package ent1.eja.e8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void testConstructor() {
        Time time = new Time(12, 30, 45);
        assertEquals(12, time.getHour(), "La hora debe ser 12");
        assertEquals(30, time.getMinute(), "El minuto debe ser 30");
        assertEquals(45, time.getSecond(), "El segundo debe ser 45");
    }

    @Test
    void testSetHour() {
        Time time = new Time(0, 0, 0);
        time.setHour(23);
        assertEquals(23, time.getHour(), "La hora debe ser 23");
    }

    @Test
    void testSetMinute() {
        Time time = new Time(0, 0, 0);
        time.setMinute(59);
        assertEquals(59, time.getMinute(), "El minuto debe ser 59");
    }

    @Test
    void testSetSecond() {
        Time time = new Time(0, 0, 0);
        time.setSecond(58);
        assertEquals(58, time.getSecond(), "El segundo debe ser 58");
    }

    @Test
    void testSetTime() {
        Time time = new Time(0, 0, 0);
        time.setTime(10, 20, 30);
        assertEquals(10, time.getHour(), "La hora debe ser 10");
        assertEquals(20, time.getMinute(), "El minuto debe ser 20");
        assertEquals(30, time.getSecond(), "El segundo debe ser 30");
    }

    @Test
    void testToString() {
        Time time = new Time(9, 5, 3);
        assertEquals("09:05:03", time.toString(), "El toString debe devolver 09:05:03");

        Time time2 = new Time(23, 59, 59);
        assertEquals("23:59:59", time2.toString(), "El toString debe devolver 23:59:59");
    }

    @Test
    void testNextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertEquals("00:00:00", time.toString(), "Debe avanzar al siguiente día 00:00:00");

        Time time2 = new Time(12, 30, 45);
        time2.nextSecond();
        assertEquals("12:30:46", time2.toString(), "Debe avanzar un segundo 12:30:46");
    }

    @Test
    void testPreviousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
        assertEquals("23:59:59", time.toString(), "Debe retroceder al día anterior 23:59:59");

        Time time2 = new Time(10, 15, 30);
        time2.previousSecond();
        assertEquals("10:15:29", time2.toString(), "Debe retroceder un segundo 10:15:29");
    }
}
