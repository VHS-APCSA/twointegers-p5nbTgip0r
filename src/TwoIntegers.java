public class TwoIntegers {
    private int number1, number2;

    public TwoIntegers() {
        this.number1 = 0;
        this.number2 = 0;
    }

    public TwoIntegers(int input, int input2) {
        this.number1 = input;
        this.number2 = input2;
    }

    public String arithmetic() {
        final String format = number1 + " %s " + number2 + " = %s";

        int sum = number1 + number2;
        String sumFormatted = String.format(format, "+", sum);
        
        int product = number1 * number2;
        String productFormatted = String.format(format, "*", product);
        
        int diff = number1 - number2;
        String diffFormatted = String.format(format, "-", diff);
        
        double quotient = (double) number1 / number2;
        String quotientFormatted = String.format(format, "/", quotient);
        return sumFormatted + ", " + productFormatted + ", " + diffFormatted + ", " + quotientFormatted;
    }

    public int larger() {
        if(number1 >= number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public boolean isEven() {
        int sum = number1 + number2;
        return sum % 2 == 0;
    }

    public boolean isMultiple() {
        return number1 % number2 == 0;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
