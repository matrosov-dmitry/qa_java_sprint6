import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static com.example.constant.AnimalFood.FAVORITE_FOODS;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    private Feline feline;

    @Before

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals("Коты так не говорят", expectedSound, actualSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(FAVORITE_FOODS);
        List<String> actualMeal = cat.getFood();
        Assert.assertEquals("Коты это не едят", FAVORITE_FOODS, actualMeal);
    }
}