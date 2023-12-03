import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

        @InjectMocks
        Feline feline;
        @Test
        public void felineFoodTest() throws Exception {
            List<String> food = feline.eatMeat();
            assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
        }
        @Test
        public void felineFamilyTest() {
            Feline feline = new Feline();
            assertEquals("Кошачьи", feline.getFamily());
        }

        @Test
        public void felineKittensTest(){
            Feline feline = new Feline();
            assertEquals(1, feline.getKittens());
        }
    }
