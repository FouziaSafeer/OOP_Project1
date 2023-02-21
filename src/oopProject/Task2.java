package oopProject;

public class Task2 {
    /*2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
*/
    public static void main(String[] args) {
        B bclass=new B(80,75,95,85);
        System.out.println( "Class B : student1 average is:  "+bclass.getPercentage());

        System.out.println("- - - - - - - - -- - -");
        A aClass=new A(78,95,65);
        System.out.println("Class A student2 average is: "+aClass.getPercentage());
    }
}
 abstract class Marks{

    abstract double getPercentage();

}
class A extends Marks{

    int marks1;
    int marks2;
    int marks3;

    public A(int marks1,int marks2,int marks3) {
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }

    @Override
    double getPercentage() {

        return (marks1+marks2+marks3)/3;
    }
}
class B extends Marks{
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    public B(int marks1,int marks2,int marks3,int marks4) {
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.marks4=marks4;
    }

    @Override
    double getPercentage() {
        return (marks1+marks2+marks3+marks4)/4;
    }
}
