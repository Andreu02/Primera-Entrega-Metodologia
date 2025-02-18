package ent1.eja.e9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void testConstructor() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.5f, -2.5f);
        assertEquals(5.0f, ball.getX(), "La coordenada X debe ser 5.0");
        assertEquals(10.0f, ball.getY(), "La coordenada Y debe ser 10.0");
        assertEquals(3, ball.getRadius(), "El radio debe ser 3");
        assertEquals(1.5f, ball.getxDelta(), "La velocidad en X debe ser 1.5");
        assertEquals(-2.5f, ball.getyDelta(), "La velocidad en Y debe ser -2.5");
    }

    @Test
    void testSetX() {
        Ball ball = new Ball(0, 0, 1, 0, 0);
        ball.setX(8.5f);
        assertEquals(8.5f, ball.getX(), "La coordenada X debe ser 8.5");
    }

    @Test
    void testSetY() {
        Ball ball = new Ball(0, 0, 1, 0, 0);
        ball.setY(15.2f);
        assertEquals(15.2f, ball.getY(), "La coordenada Y debe ser 15.2");
    }

    @Test
    void testSetRadius() {
        Ball ball = new Ball(0, 0, 1, 0, 0);
        ball.setRadius(5);
        assertEquals(5, ball.getRadius(), "El radio debe ser 5");
    }

    @Test
    void testSetXDelta() {
        Ball ball = new Ball(0, 0, 1, 0, 0);
        ball.setxDelta(2.0f);
        assertEquals(2.0f, ball.getxDelta(), "La velocidad en X debe ser 2.0");
    }

    @Test
    void testSetYDelta() {
        Ball ball = new Ball(0, 0, 1, 0, 0);
        ball.setyDelta(-3.5f);
        assertEquals(-3.5f, ball.getyDelta(), "La velocidad en Y debe ser -3.5");
    }

    @Test
    void testMove() {
        Ball ball = new Ball(2.0f, 3.0f, 1, 1.0f, 1.5f);
        ball.move();
        assertEquals(3.0f, ball.getX(), "Después de mover, X debe ser 3.0");
        assertEquals(4.5f, ball.getY(), "Después de mover, Y debe ser 4.5");
    }

    @Test
    void testReflectHorizontal() {
        Ball ball = new Ball(0, 0, 1, 2.0f, 0);
        ball.reflectHorizontal();
        assertEquals(-2.0f, ball.getxDelta(), "La velocidad en X debe invertirse a -2.0");
    }

    @Test
    void testReflectVertical() {
        Ball ball = new Ball(0, 0, 1, 0, 3.5f);
        ball.reflectVertical();
        assertEquals(-3.5f, ball.getyDelta(), "La velocidad en Y debe invertirse a -3.5");
    }

    @Test
    void testToString() {
        Ball ball = new Ball(4.0f, 6.0f, 2, 1.0f, -1.0f);
        assertEquals("Ball [(4.0,6.0), speed=(1.0,-1.0)]", ball.toString(), "El toString debe devolver la representación correcta");
    }
}
