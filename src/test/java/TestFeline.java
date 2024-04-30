import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

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
    public void eatMeatPositive() throws Exception {
        List<String> expectedMeal = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeal = feline.eatMeat();
        Assert.assertEquals("Коты это не едят", expectedMeal, actualMeal);
    }

}