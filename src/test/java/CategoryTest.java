
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SanityTests.class)
@Suite.SuiteClasses( {TestClass.class})
public class CategoryTest {
}