package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTestGetSound {
    private Feline feline;
    @Spy
    private Cat cat = new Cat(feline);
    @Test
    public void getSoundReturnsMeow() {
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound());
    }
}
