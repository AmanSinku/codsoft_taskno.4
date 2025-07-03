import java.util.*;

public class gradecalculator {
    public static void main(String args[]){
        String grade;
        int English,Physics,Mathematics,Chemistry,Computer_Science,Hindi,Total_marks;
        double Average_per;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter obtained marks out of 100");
        System.out.println("Enter marks obtained in English:");
        English=in.nextInt();
        System.out.println("Enter marks obtained in Physics:");
        Physics=in.nextInt();
        System.out.println("Enter marks obtained in Mathematics:");
        Mathematics=in.nextInt();
        System.out.println("Enter marks obtained in Chemistry:");
        Chemistry=in.nextInt();
        System.out.println("Enter marks obtained in Computer Science:");
        Computer_Science=in.nextInt();
        System.out.println("Enter marks obtained in Hindi:");
        Hindi=in.nextInt();
        Total_marks=English+Physics+Mathematics+Chemistry+Computer_Science+Hindi;
        Average_per=Total_marks/6;
        if (Average_per>=91 && Average_per<=100) {
            grade="A1";
        }
        else if(Average_per>=81 && Average_per<=90){
            grade="A2";
        }
        else if (Average_per>=71 && Average_per<=80) {
            grade="B1";
        }
        else if (Average_per>=61 && Average_per<=70) {
            grade="B2";
        }
        else if (Average_per>=51 && Average_per<=60) {
            grade="C1";
        }
        else if (Average_per>=41 && Average_per<=50) {
            grade="C2";
        }
        else if (Average_per>=33 && Average_per<=40) {
            grade="D";
        }
        else if (Average_per>=21 && Average_per<=32) {
            grade="E1";
        }
        else{
            grade="E2";
        }
        System.out.println("Total marks Obtained:"+Total_marks);
        System.out.println("Average Percentage:"+Average_per);
        System.out.println("Grade Obtained:"+grade);
    }
    
}
