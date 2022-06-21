package com.syntax.class21;

public class userClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable
    and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    int mobileNum;
    public userClass(String name, int mobileNum) {
        this.name = name;
        this.mobileNum = mobileNum;
    }
}
class userInfo extends userClass{

    String address;
    userInfo(String address,String name,int mobileNum) {
        super(name, mobileNum);
        this.address=address;
    }

    public void userDetails(){
        System.out.println("User's name: "+name+" User's mobile number: "+mobileNum+" User's address is "+address);
    }

    public static void main(String[] args) {

        userInfo userInfo=new userInfo("123 Pickens Bridge Rd.","Kellie",1234567890);

        userInfo.userDetails();

    }


}
