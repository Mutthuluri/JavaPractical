package javaPractical;

// Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” instead of thenumber and for the multiples of ‘5’ print “Buzz”.
public class p2FizzAndBuzz {
    public static void main(String[] args) {
        for (int v = 1; v < 101; v++) {

            if (v % 3 == 0) {
                System.out.println("Fizz");
            } else if (v % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(v);
            }

        }
    }
}
