package ReplTasks;

import java.util.Scanner;

public class Repl100 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        StringBuilder strBuilder=new StringBuilder(s);
        strBuilder.reverse();

        for(int i=0; i<strBuilder.length(); i++ ){
            System.out.print(strBuilder.charAt(i));
        }




    }
}
