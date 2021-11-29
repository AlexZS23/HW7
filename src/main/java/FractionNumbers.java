public class FractionNumbers {

//    Write class to represent FractionNumbers
//    This class should contain two fields.
//    This class should contain methods to perform basic math operations:
//    plus, minus, multiply, divide
//    Also, this class should have toString method to print numbers into standard output
//    Create additional class like App to check functionality of FractionNumber class

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String mathOperation;

    public FractionNumbers(double firstNumber, double secondNumber, String mathOperation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.mathOperation = mathOperation;

    }

    public double mathPlus() {
        return firstNumber + secondNumber;
    }

    public double mathMinus() {
        return firstNumber - secondNumber;
    }

    public double mathMultiply() {
        return firstNumber * secondNumber;
    }

    public double mathDivide() {
        return firstNumber / secondNumber;
    }

    @Override
    public String toString() {

        if ("Addition".equals(mathOperation)) {
            return "Sum of your numbers = " + mathPlus();

        } else if ("Subtraction".equals(mathOperation)) {
            return "Difference of yor number = " + mathMinus();

        } else if ("Multiply".equals(mathOperation)) {
            return "Your result = " + mathMultiply();

        } else if ("Divide".equals(mathOperation)) {
            if (secondNumber == 0) {
                return "You can't divide on zero";
            } else {
                return "Yor result = " + mathDivide();
            }
        }
        return "Your variant doesn't match with any proposed";
    }
}
