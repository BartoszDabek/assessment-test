package pl.bdabek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pl.bdabek.Assessment.DIVISION_INDEX;
import static pl.bdabek.Assessment.MULTIPLICATION_INDEX;
import static pl.bdabek.Assessment.REMAINDER_OF_DIVISION_INDEX;

class AssessmentTest {

    private Assessment assessment = new Assessment();

    @Test
    void shouldThrowIllegalArgumentExcetionIfSecondArgumentIsEqualToZero() {
        assertThrows(IllegalArgumentException.class, () -> assessment.test(1, 0));
    }

    @Test
    void shouldReturnArrayLengthOfResults() {
        double[] result = assessment.test(10, 5);

        assertEquals(result.length, 3);
    }

    //TODO 8/12/2021: parameter tests for resulsts test
    @Test
    void shouldReturnArrayWithResultsOfMultiplication() {
        double result = assessment.test(10, 5)[MULTIPLICATION_INDEX];

        assertEquals(result, 50);
    }

    @Test
    void shouldReturnArrayWithResultsOfDivision() {
        double result = assessment.test(10, 5)[DIVISION_INDEX];

        assertEquals(result, 2);
    }

    @Test
    void shouldReturnArrayWithResultsOfRemainderOfDivision() {
        double result = assessment.test(10, 5)[REMAINDER_OF_DIVISION_INDEX];

        assertEquals(result, 0);
    }

}