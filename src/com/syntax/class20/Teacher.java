package com.syntax.class20;

public class Teacher {

    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour. Test all 4 classes
     */


  //THIS IS EXAMPLE OF HIERARCHICAL INHERITANCE

    String name;
    String typeOfTeacher;
    void teach(){
        System.out.println(name+" teaches "+typeOfTeacher);

    }

    class MathTeacher extends Teacher{
        String favoriteMatchSubject;
        public void teachesMath(){
            System.out.println(name+" teaches Math and their favorite subject is "+favoriteMatchSubject);
        }
    }

    static class ChemistryTeacher extends Teacher{
        String favoriteChemSubject;
        public void teachesChemistry(){
            System.out.println(name+" teaches Chemistry and their favorite subject is "+favoriteChemSubject);
        }
    }
    class PianoTeacher extends Teacher{
        String favoriteModelOfPiano;
        public void teachesPiano(){
            System.out.println(name+" teaches Piano and their favorite model of pinao is "+favoriteModelOfPiano);
        }
    }
}
