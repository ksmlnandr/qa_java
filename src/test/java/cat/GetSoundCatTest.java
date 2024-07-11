package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetSoundCatTest {
    @Mock
    private Feline feline;

    private Cat cat = new Cat(feline);

    @Test
    public void getSoundReturnsMeow() {
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound());
    }
}
