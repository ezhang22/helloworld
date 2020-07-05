import java.util.Scanner;

public class firsttest

{
    public static void main(String[] args)
    {
        int numGrades, nextGrade, totalGrades, count;
        System.out.println("Enter the student's name:");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next( );
        System.out.println("Enter the number of grades:");
        numGrades = keyboard.nextInt();
        nextGrade = 0;
        totalGrades = 0;
        count = 1;
        while (count <= numGrades)
        {
            System.out.println("Enter a student grade: ");
            nextGrade = keyboard.nextInt();
            totalGrades = totalGrades + nextGrade;
            count++;
        }
        Double GPA = 0.0 + totalGrades/numGrades;
        System.out.println("        " + name + "'s grade is " + GPA);
    }
}