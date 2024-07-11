package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class GetKittensWithArgsFelineTest {
    private Random random = new Random();
    int kittensCount = random.nextInt();
    int expected = kittensCount;

    Feline feline = new Feline();

    @Test
    public void getKittensWithArgsReturnsKittensCount() {
        feline.getKittens(kittensCount);
        Assert.assertEquals(expected, feline.getKittens(kittensCount));
    }
}
