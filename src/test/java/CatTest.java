import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    @Mock
    Feline predatorCat;
    @Before
    public void newCat() {
        cat = new Cat(predatorCat);
    }
    @Test
    public void catSoundTest() {
        String catSound  = cat.getSound();
        assertEquals(catSound, cat.getSound());
    }
    @Test
    public void catDietTest() throws Exception {
        List<String> food = predatorCat.eatMeat();
        Mockito.when(predatorCat.eatMeat()).thenReturn(food);
        assertEquals(cat.getFood(),food);
    }
}


