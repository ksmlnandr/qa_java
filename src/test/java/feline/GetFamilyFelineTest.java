package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetFamilyFelineTest {

    private Feline feline = new Feline();

    @Test
    public void getFamilyReturnsFelineString() {
        feline.getFamily();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
}
