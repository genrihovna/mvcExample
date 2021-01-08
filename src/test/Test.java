package test;



import main.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void multiplicationByZeroShouldReturnZero(){
        Model tester = new Model();

        assertEquals(0, tester.process(10, 0, "*"), "10 x 0 must be 0");
        assertEquals(0, tester.process(0, 10, "*"), "0 x 10 must be 0");
        assertEquals(0, tester.process(0, 0, "*"), "0 x 0 must be 0");
    }
}
