import java.util.*;

class PalindromeVerifierQueue {

    public static void main(String[] args) {
        System.out.print("Enter a word: "); // allows user input
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue<Character> queue = new LinkedList(); // creates a linked list

        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i)); // iterates the characters in reverse
        }

        String reverseString = ""; // initializing string

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove(); // removing letter at the start then returns it
        }
        if (inputString.equals(reverseString))
            System.out.println("Yuuup, " + inputString + " sure is a palindrome!");
        else
            System.out.println("Uuumm sorry but " + inputString + " isn't a palindrome :/");

    }
}
