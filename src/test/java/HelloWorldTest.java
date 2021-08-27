import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloBoyone() {
        // Arrange
        HelloWorld helloWorld = new HelloWorld();

        // Act
        String actualResult = helloWorld.greeting("Boyone");

        // Assert
        assertEquals("Hello, Boyone!", actualResult);
    }
}
