package com.syntax.class19;

public class Task9ConstructorBook {

    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

   public static class Book{

        String title;
        int numOfVolumes;

        int pageNumbers;

        public Book(String title, int numOfVolumes) {
            this.title = title;
            this.numOfVolumes = numOfVolumes;
        }

        public Book(String title, int numOfVolumes,int pageNumbers){
            this(title,numOfVolumes);
            this.pageNumbers=pageNumbers;
        }

        }

    public static void main(String[] args) {
        Book book=new Book("Lord of the Rings",3,500);
        System.out.println(book.title);
        System.out.println(book.numOfVolumes);
        System.out.println(book.pageNumbers);

    }


    }



