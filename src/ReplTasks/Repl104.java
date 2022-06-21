package ReplTasks;

import java.util.Scanner;

public class Repl104 {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int i=0;
        String[] arr=new String[5];

       /* System.out.println("Please enter 5 names: ");
        arr[0]=scanner.nextLine();
        arr[1]=scanner.nextLine();
        arr[2]=scanner.nextLine();
        arr[3]=scanner.nextLine();
        arr[4]=scanner.nextLine();

        */
        //BETTER WAY:

        while(i<arr.length){
            System.out.println("Please enter a name");
            arr[i]=scanner.next();
            i++;
        }




        for(int j=0; j<arr.length; j++){
            for(int k=0; k<3; k++){
                System.out.print(arr[j].charAt(k));
            }
            System.out.println();
        }





    }
}
