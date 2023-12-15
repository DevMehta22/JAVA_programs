import java.util.*;
class PerCal
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double totalMarks = 0;
        for (int i = 0; i < 6; i++) 
        {
            System.out.printf("Enter marks of subject %d: ", i+1);
            double marks = scan.nextDouble();
            totalMarks += marks;
        }
        double percentage = (totalMarks / 600) * 100;
        System.out.printf("The Percentage of student: %.2f%%", percentage);
    }
}

