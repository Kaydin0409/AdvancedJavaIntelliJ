package ReplTasks;

public class Repl131 {

    static String third;

    static String thirdLetter(String s){
        String third="";
        for(int i=0; i<s.length(); i+=3){
            third +=(s.charAt(i));
        }
        return third;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
