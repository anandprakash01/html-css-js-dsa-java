package J01_Basic;

public class B7_Babylonian {
    public static void main(String[] args){
        System.out.println("The square root of 10 is " + sqrt(10));
    }

    // method to find the square root of a non-negative number using the Babylonian method
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number is not defined");
        }
        if (x == 0 || x == 1) {
            return x;
        }
        // initialize two variables to store the current and previous approximations
        double curr = x;
        double prev = 0;
        // loop until the difference between the current and previous approximations is very small
        while (Math.abs(curr - prev) > 0.0001) {
            // update the previous approximation
            prev = curr;
            // calculate the current approximation using the Babylonian formula
            curr = (curr + x / curr) / 2;
        }
        // return the current approximation as the square root
        return curr;
    }

}
