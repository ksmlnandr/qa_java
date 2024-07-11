package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
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
        Mockito.when(feline.getKittens()).thenReturn(1);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Assert.assertEquals(1, lion.getKittens());
    }
}
