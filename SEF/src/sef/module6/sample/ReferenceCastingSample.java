package sef.module6.sample;

public class ReferenceCastingSample {

    public static void main(String arg[]) {

        Student_P s = new Student_P();
        s.setName("Jane Doe");
        s.setSchool("A Fictional School");
        s.setGrade(10);

        // Sample reference casting
        Person_P tempPerson = s; // convert student to person upcasting
        tempPerson.announce();
        System.out.println("Tempt person name: " + tempPerson.getName());

        System.out.println();

        Student_P tempStudent = (Student_P) tempPerson; // convert person to student down casting
        tempStudent.announce();
        System.out.println("Tempt student name: " + tempStudent.getName());
        System.out.println("Tempt student school: " + tempStudent.getSchool());

        System.out.println();

        tempStudent.setSchool("Fictional master school");
        System.out.println("tempt student changed school: " + tempStudent.getSchool());
    }

}