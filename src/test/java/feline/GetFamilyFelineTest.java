package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetFamilyFelineTest {
    @Spy
    private Feline feline;

    @Test
    public void getFamilyReturnsFelineString() {
        feline.getFamily();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
}
