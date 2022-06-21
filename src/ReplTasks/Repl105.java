package ReplTasks;

import java.util.Scanner;

public class Repl105 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        System.out.println(word.replaceAll("[^a,e,i,o,u]", ""));
    }
}
