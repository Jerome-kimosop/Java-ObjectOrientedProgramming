import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void testCircleConstructorAndGetters() {
        // Create a Circle object with radius 5, color "red", and filled status true
        Circle circle = new Circle("red", true, 5);

        // Test getters
        assertEquals("red", circle.getColor());
        assertTrue(circle.isFilled());
        assertEquals(5, circle.getRadius());
    }

    @Test
    void testCircleSetters() {
        // Create a Circle object with default values
        Circle circle = new Circle("blue", false, 3);

        // Test setters
        circle.setColor("green");
        circle.setFilled(true);
        circle.setRadius(7);

        // Test getters after setters
        assertEquals("green", circle.getColor());
        assertTrue(circle.isFilled());
        assertEquals(7, circle.getRadius());
    }

    @Test
    void testCircleArea() {
        // Create a Circle object with radius 4
        Circle circle = new Circle("yellow", true, 4);

        // Test area calculation
        assertEquals(Math.PI * 16, circle.getArea(), 0.0001);
    }

    @Test
    void testCircleCircumference() {
        // Create a Circle object with radius 6
        Circle circle = new Circle("orange", true, 6);

        // Test circumference calculation
        assertEquals(2 * Math.PI * 6, circle.getCircumference(), 0.0001);
    }
}
