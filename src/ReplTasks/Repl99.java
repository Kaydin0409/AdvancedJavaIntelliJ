package ReplTasks;

import java.util.Scanner;

public class Repl99 {
    boolean palindromeOrNot(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        Repl99 givenPalindrome = new Repl99();
        System.out.println(givenPalindrome.palindromeOrNot(givenString));
    }
}
