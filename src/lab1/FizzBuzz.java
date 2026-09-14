package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
        */


        // Task 1.1 Rewrite using while loop
        int i = 1;
        while (i <= 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}

/*
* Difference between Java and Python:
* 1. Semi-colon is required
* 2. We have to show the type of each variable
* 3. Public / Private
* 4. Indentation
* 5. Brackets for conditions
* 6. Using curly brackets instead of colons
* 7. Don't use # for comments
* */