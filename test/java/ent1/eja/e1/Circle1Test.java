package ent1.eja.e1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Circle1Test {

    @Test
    void testDefaultConstructor() {
        Circle1 circle = new Circle1();
        assertEquals(1.0, circle.getRadius(), "El radio por defecto debe ser 1.0");
    }

    @Test
    void testParameterizedConstructor() {
        Circle1 circle = new Circle1(5.0);
        assertEquals(5.0, circle.getRadius(), "El radio debe ser 5.0");
    }

    @Test
    void testGetArea() {
        Circle1 circle = new Circle1(2.0);
        assertEquals(4.0 * Math.PI, circle.getArea(), "El área debe ser π * 2^2");
    }
}
