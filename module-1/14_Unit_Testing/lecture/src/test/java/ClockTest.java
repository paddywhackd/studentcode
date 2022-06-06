import com.techelevator.Clock;
import org.junit.Assert;
import org.junit.Test;

public class ClockTest {

    @Test
    public void when_not_vacation_and_weekday_return_7am() {
        //arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int tuesday = 2;

        //act
        String actual = Clock.alarmClock(tuesday,vacation);

        //assert
        Assert.assertEquals("should be 7am", "7:00", actual);
    }

}
