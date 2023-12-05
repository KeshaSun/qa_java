import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

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
        public void felineKittensTest(){
            Feline feline = new Feline();
            assertEquals(1, feline.getKittens());
        }
        @Spy
        Feline spyfeline;
         @Test
         public void felineFamilyTest() {
             // устанавливаем поведение метода getFamily
            Mockito.when(spyfeline.getFamily()).thenReturn("Кошачьи");
            assertEquals("Кошачьи", spyfeline.getFamily());
        }

}
