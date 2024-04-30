import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith (Parameterized.class)
public class TestFelineParameter {

    private final int numberOfKittens;

    public TestFelineParameter(int numberOfKittens) {
        this.numberOfKittens = numberOfKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKitten() {
        return new Object[][]{
                {1},
                {2}
        };
    }

    @Test
    public void getNumberOfKittensTest() {
        Feline feline = new Feline();
        assertEquals(numberOfKittens, feline.getKittens());
    }
}




