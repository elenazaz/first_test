import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Ex {

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("Какой-то текст");
        assertTrue ( 3 > 2 );
    }

    @Test
    void secondTest() {
        System.out.println("Какой-то другой текст");
        assertFalse(3 > 2);
    }
}
