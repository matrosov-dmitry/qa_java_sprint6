import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static com.example.constant.AnimalFood.FAVORITE_FOODS;

@RunWith(Parameterized.class)
public class TestLion {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    String sex;
    boolean hasMane;

    @Mock
    Feline feline;

    public TestLion (String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void maleHasManeButFemaleHasNoMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", hasMane, lion.doesHaveMane());
    }

    @Test
    public void lionHasCorrectNumberOfKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionFeedsLikePredator() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(FAVORITE_FOODS);
        Assert.assertEquals("Лев питается не как хищник", FAVORITE_FOODS, lion.getFood());
    }


}