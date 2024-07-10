package lion;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class DoesHaveManeLionTest {

    private final String sex;
    private final boolean expected;

    public DoesHaveManeLionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setParameters() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeParameterized() throws Exception {
        Lion lion = new Lion(sex, null);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void DoesHaveManeTestWithException() throws Exception {
        Lion lion = new Lion("Третий вариант пола", null);
        try {
            lion.doesHaveMane();
        } catch (Exception exception) {
            assertTrue(exception.getMessage().contains("Используйте допустимые значения пола животного - самец или самка"));
            throw exception;
        }
    }
}
