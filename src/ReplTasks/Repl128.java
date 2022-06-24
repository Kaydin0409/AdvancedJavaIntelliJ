package ReplTasks;

public class Repl128 {

    static String mixString(String s1,String s2){
            String mix="";
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                mix +=s1.charAt(i)+s2.charAt(j);
            }
        }
        return mix;
    }

    public static void main(String[] args) {


    }

}




