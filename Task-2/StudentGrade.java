import java.util.*;

class Student {
    private int[] marks;
    private int total;
    private double average;

    public Student(int subjects) {
        marks = new int[subjects];
    }

    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    public void calculate() {
        total = 0;
        for (int m : marks) total += m;
        average = total / (double) marks.length;
    }

    public String getGrade() {
        if (average >= 90) return "A+";
        else if (average >= 75) return "A";
        else if (average >= 60) return "B";
        else if (average >= 50) return "C";
        else return "Fail";
    }

    public void display() {
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + getGrade());
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Student s = new Student(5);
        s.inputMarks();
        s.calculate();
        s.display();
    }
}