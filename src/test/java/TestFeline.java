import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static com.example.constant.AnimalFood.FAVORITE_FOODS;

public class TestFeline {

    Feline feline = new Feline();


    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Семейство неверное", expectedFamily, actualFamily);
    }

    @Test
    public void getNumberOfKittensTest() {
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        Assert.assertEquals("Количество котят неверное", expectedKittens, actualKittens);
    }
    @Test
    public void getNumberOfKittensTestParameter() {
        int expectedKittens = 2;
        int actualKittens = feline.getKittens(expectedKittens);
        Assert.assertEquals("Количество котят неверное", expectedKittens, actualKittens);
    }

    @Test
    public void eatMeatPositive() throws Exception {
        List<String> actualMeal = feline.eatMeat();
        Assert.assertEquals("Коты это не едят", FAVORITE_FOODS, actualMeal);
    }

}