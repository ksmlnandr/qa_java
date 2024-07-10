package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class GetKittensWithArgsFelineTest {
    private Random random = new Random();
    int kittensCount = random.nextInt();
    int expected = kittensCount;
    @Spy
    Feline feline;

    @Test
    public void getKittensWithArgsReturnsKittensCount() {
        feline.getKittens(kittensCount);
        Assert.assertEquals(expected, feline.getKittens(kittensCount));
    }
}
