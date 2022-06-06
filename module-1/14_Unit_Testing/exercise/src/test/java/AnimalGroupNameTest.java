
import com.techelevator.AnimalGroupName;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AnimalGroupNameTest {

    @Test
    public void rhino_should_return_group() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //act
        String actual = animalGroupName.getHerd("rhino");
        //assert
        Assert.assertEquals("Crash", actual);
    }
    @Test
    public void if_rhino_has_mixed_case_return_correct_group() {
        //arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //act
        String actual = animalGroupName.getHerd("rHiNo");
        //assert
        Assert.assertEquals("Crash", actual);

    }

}






