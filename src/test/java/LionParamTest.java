import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

    @RunWith(Parameterized.class)
    public class LionParamTest {

        @Parameterized.Parameter
        public String sex;
        @Parameterized.Parameter(1)
        public Boolean expectedSex;

        @Parameterized.Parameters(name = "Пол {0} Значение {1}")
        public static Object[][] data() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }

        @Test
        public void doesHaveManeTest() throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            Boolean actualResult = lion.doesHaveMane();
            assertEquals(expectedSex, actualResult);
        }
}
