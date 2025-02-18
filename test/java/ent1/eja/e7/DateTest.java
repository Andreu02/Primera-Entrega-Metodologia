package ent1.eja.e7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testConstructor() {
        Date date = new Date(5, 8, 2023);
        assertEquals(5, date.getDay(), "El día debe ser 5");
        assertEquals(8, date.getMonth(), "El mes debe ser 8");
        assertEquals(2023, date.getYear(), "El año debe ser 2023");
    }

    @Test
    void testSetDay() {
        Date date = new Date(1, 1, 2020);
        date.setDay(15);
        assertEquals(15, date.getDay(), "El día debe ser 15");
    }

    @Test
    void testSetMonth() {
        Date date = new Date(1, 1, 2020);
        date.setMonth(12);
        assertEquals(12, date.getMonth(), "El mes debe ser 12");
    }

    @Test
    void testSetYear() {
        Date date = new Date(1, 1, 2020);
        date.setYear(2025);
        assertEquals(2025, date.getYear(), "El año debe ser 2025");
    }

    @Test
    void testSetDate() {
        Date date = new Date(1, 1, 2020);
        date.setDate(10, 11, 2022);
        assertEquals(10, date.getDay(), "El día debe ser 10");
        assertEquals(11, date.getMonth(), "El mes debe ser 11");
        assertEquals(2022, date.getYear(), "El año debe ser 2022");
    }

    @Test
    void testToString() {
        Date date = new Date(5, 8, 2023);
        assertEquals("05/08/2023", date.toString(), "El toString debe devolver 05/08/2023");

        Date date2 = new Date(15, 12, 1999);
        assertEquals("15/12/1999", date2.toString(), "El toString debe devolver 15/12/1999");
    }
}
