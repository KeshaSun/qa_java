import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.catchThrowable;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline predatorLion;
    @Test
         public void lionKittensTest() throws Exception {
        Lion lion = new Lion("Самец", predatorLion);
        Mockito.when(predatorLion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
        public void lionDietTest() throws Exception {
        Lion lion = new Lion("Самец", predatorLion);
        Mockito.when(predatorLion.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actualResult,expectedResult);
        }
    @Test
        public void lionDoesHaveManeExceptionTest() {
        Throwable thrown = catchThrowable(() -> {
            Lion lion = new Lion("НедопустимоеЗначение", predatorLion);
            Throwable exception = assertThrows(IndexOutOfBoundsException.class, lion::doesHaveMane);
            assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
        });
        //Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
        }
}