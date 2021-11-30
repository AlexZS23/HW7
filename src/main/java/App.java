public class App {

    //    Create additional class like App to check functionality of FractionNumber class

    public static void main(String[] args) {

        double firstNumber = 1;
        double secondNumber = 10;
        String mathOperation = "Subtraction"; // Subtraction, Multiply, Divide

        FractionNumbers fractionNumbers = new FractionNumbers(firstNumber, secondNumber, mathOperation);

        System.out.println(fractionNumbers.toString());

    }
}
