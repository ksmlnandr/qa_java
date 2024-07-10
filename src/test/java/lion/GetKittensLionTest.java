package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetKittensLionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsFelineGetKittens() throws Exception {
        Lion lion = new Lion("Самец",feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }
}
