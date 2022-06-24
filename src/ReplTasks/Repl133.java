package ReplTasks;

public class Repl133 {

    static int countAEasy(String s) {
        s = s.replaceAll("[^aA]", "");
        return s.length();
    }

    static int countA(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                counter++;
            }
        }
        return counter;
    }



    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
