package com.geekbrains.lesson4.hw;





import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



import static com.geekbrains.lesson4.hw.Triangle.calculateTriangleSquare;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class TriangleSquareCalculationTest {

    @Test
    void positiveSquareCalcTest() throws Exception {
        double result = calculateTriangleSquare(2, 2, 2);
        Assertions.assertEquals(3, result);


    }
    @Test
    void negativeSquareCalcTest() throws Exception {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> calculateTriangleSquare(-2, 2, 2));
    }





}
