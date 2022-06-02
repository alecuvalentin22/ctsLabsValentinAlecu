package tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import classes.SlowTestsClass;

@RunWith(Categories.class)
//@ExcludeCategory(SlowTestsClass.class);
@SuiteClasses({ TestPersonCalculateAvgCosts.class, TestPersonConstructor.class })
public class AllTestsExcludingSlowTest {

}
