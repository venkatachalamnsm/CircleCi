package cooperandroidboilerplate.com.circlecisample;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by atiwari4 on 8/29/2017.
 */

@RunWith(JUnit4.class)
public class UIFeatureTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void userSignsIn(){
        onView(withId(R.id.userNameET)).perform(typeText("apollo-unauthorized"));
        onView(withId(R.id.passwordET)).perform(typeText("apollo-unauthorized"));
        onView(withId(R.id.loginButton)).perform(click());
       //  onView(withText("Logged in")).check(matches(isDisplayed()));
    }
}
