import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsleapYearTest {

    @Test
    public void is1ALeapYear(){
        IsLeapYear one = new IsLeapYear();
        assertEquals(false, one.isLeapYear(1));
    }

    @Test
    public void is400ALeapYear(){
        IsLeapYear fourHundred = new IsLeapYear();
        assertEquals(true, fourHundred.isLeapYear(400));
    }
    @Test
    public void is100ALeapYear(){
        IsLeapYear oneHundred = new IsLeapYear();
        assertEquals(false, oneHundred.isLeapYear(100));
    }
    @Test
    public void is4ALeapYear(){
        IsLeapYear four = new IsLeapYear();
        assertEquals(true, four.isLeapYear(4));
    }
    @Test
    public void isEighteenHundredALeapYear(){
        IsLeapYear EighteenHundred = new IsLeapYear();
        assertEquals(false, EighteenHundred.isLeapYear(1800));
    }
    @Test
    public void isTwoThousandALeapHear(){
        IsLeapYear twoThousand = new IsLeapYear();
        assertEquals(true, twoThousand.isLeapYear(2000));
    }
    @Test
    public void isTwoThousandOneHundredALeapYear(){
        IsLeapYear twoThousandOneHundred = new IsLeapYear();
        assertEquals(false, twoThousandOneHundred.isLeapYear(2100));
    }
    @Test
    public void isFourHundredAndFortyALeapYear(){
        IsLeapYear fourHundredAndForty = new IsLeapYear();
        assertEquals(true, fourHundredAndForty.isLeapYear(440));
    }
    @Test
    public void is102ALeapYear(){
        IsLeapYear oneHundredAndTwo = new IsLeapYear();
        assertEquals(false, oneHundredAndTwo.isLeapYear(102));
    }
}
