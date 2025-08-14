
public class reversenumbersecondmethod {

    public static void main(String[]args){
        // This is the entry point of the program.
        // It initiates the process of reversing the number 1234 by calling 'rev2'.
        // The final reversed number (4321) will be printed to the console.
        System.out.println(rev2(1234));
    }

    /**
     * This is the initial public function designed to be called from outside to reverse a number 'n'.
     * It sets up the conditions for the recursive helper function.
     *
     * @param n The integer to be reversed.
     * @return The reversed integer.
     */
    static int rev2(int n) {
        // As discussed in Source 8, for "Pure Recursion" (Method 2 for reversing a number),
        // we often need additional variables in the recursive function's arguments that aren't
        // part of the original problem's input. In such cases, a "helper function" is used.

        // 1. Calculate the total number of digits in 'n'.
        // This is crucial because each digit needs to be placed at a specific power of 10
        // in the final reversed number (e.g., the last digit of 1234, which is 4, needs to become 4000).
        // Source 8 explicitly provides the formula for calculating digits: (int)(Math.log10(n)) + 1.
        int digits = (int)(Math.log10(n)) + 1;

        // 2. Call the private helper function to perform the actual recursive reversal.
        // We pass both the number 'n' and the calculated 'digits' count to the helper.
        return helper(n, digits);
    }

    /**
     * This is a private helper function that implements the core recursive logic for reversing a number.
     * It's 'private' because it's an internal utility for 'rev2' and not meant for direct external calls.
     *
     * @param n The current segment of the number being processed (it gets smaller with each call).
     * @param digits The number of digits remaining in the current 'n' (decreases with each call).
     * @return The progressively built reversed number.
     */
    private static int helper(int n, int digits) {
        // **Base Case:** This is the stopping condition for the recursion.
        // As per Source 8, the base case for this method is when 'n' becomes a single-digit number.
        // (e.g., if n is 5, then 5 % 10 == 5 is true).
        // When only one digit remains, it is the final digit of the original number (or segment),
        // and it simply needs to be returned as is.
        if (n % 10 == n) {
            return n;
        }

        // **Recursive Step:** This is where the magic happens – breaking down the problem.

        // 1. Extract the last digit of the current number 'n'.
        // Example: If n=1234, rem = 4. If n=123, rem = 3.
        int rem = n % 10;

        // 2. Construct the reversed number.
        // This line implements the core recursive relation described in Source 8:
        // `reverse(n, num_digits) = (n % 10) * (10^(num_digits - 1)) + reverse(n / 10, num_digits - 1)`
        //
        // Let's break down the return statement:
        //   a. `rem * (int)(Math.pow(10, digits - 1))`:
        //      This takes the current `rem` (last digit extracted) and places it at its
        //      correct positional value in the final reversed number.
        //      - For 1234: first call, rem=4, digits=4. This becomes 4 * 10^(4-1) = 4 * 1000 = 4000.
        //      - For 123 (next call): rem=3, digits=3. This becomes 3 * 10^(3-1) = 3 * 100 = 300.
        //      - This ensures that when 1234 is reversed, the '4' ends up in the thousands place.
        //
        //   b. `helper(n / 10, digits - 1)`:
        //      This makes the recursive call. It processes the rest of the number (`n` divided by 10,
        //      effectively removing the last digit) and decrements the `digits` count.
        //      The result of this recursive call (the reversed value of the remaining digits)
        //      is then added to the positionally corrected `rem`.
        //
        // This method relies on **returning values** from each recursive call to build the final result.
        // As emphasized in Source 5 and 12, "When a value is calculated *within* the recursive process
        // that needs to be used by calling functions, it *must* be returned."
        // This is why `sum` variable cannot be placed inside the function in the "reverse number"
        // problem for this pure recursive approach, as it would be re-initialized in each call,
        // and values must be explicitly returned to propagate them up the call stack (as discussed in
        // our previous conversation).
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}

