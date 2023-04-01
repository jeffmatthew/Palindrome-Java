import java.util.*;

public class PalindromeVerifierStack {
    public static void main(String[] args) {
        System.out.print("Enter a word: "); // allows user input
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack<>(); // create a stack

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i)); // push method to push each character to the stack
        }

        String reverseString = ""; // reversed word storage

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop(); // pop method to bring initial character and append it to the back
        }

        if (inputString.equals(reverseString)) {
            System.out.println("Yuuup, " + inputString + " sure is a palindrome!");
        } else {
            System.out.println("Uuumm sorry but " + inputString + " isn't a palindrome :/");
        }
    }
}