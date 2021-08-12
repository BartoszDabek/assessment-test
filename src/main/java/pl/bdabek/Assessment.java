package pl.bdabek;

public class Assessment {

    public static final int MULTIPLICATION_INDEX = 0;
    public static final int DIVISION_INDEX = 1;
    public static final int REMAINDER_OF_DIVISION_INDEX = 2;

    /**
     * @param first  number
     * @param second number that can't be equal to zero
     * @return array with result of the multiplication, division, and the remainder of the division
     * @throws IllegalArgumentException if second number is equal to 0
     */
    double[] test(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Second argument can not be equal to 0");
        }

        double multiplicationResult = first * second;
        double divisionResult = first / second;
        double remainderOfDivisionResult = first % second;

        return new double[]{multiplicationResult, divisionResult, remainderOfDivisionResult};
    }
}
