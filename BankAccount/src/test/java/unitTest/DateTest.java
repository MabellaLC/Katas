package unitTest;

import BankAccount.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {
    Date date;
    @BeforeEach
    public void setUp(){
        date  = new Date("10-05-2006");
    }
    @Test
    public void day(){
        assertEquals("10", date.day());
    }

    @Test
    public void month(){
        assertEquals("05", date.month());
    }

    @Test
    public void year(){
        assertEquals("2006", date.year());
    }

}
