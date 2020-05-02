import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void addition() {
        Addition add = new Addition();
        System.out.println(add.addition(1,2));
    }
}