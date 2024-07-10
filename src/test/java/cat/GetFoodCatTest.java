package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GetFoodCatTest {

    private Feline feline;
    private Cat cat;

    @Before
    public void setUp() throws Exception {
        feline = mock(Feline.class);
        cat = new Cat(feline);
    }

    @Test
    public void getFoodReturnsEatMeat() throws Exception {
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}