import java.util.*;
public class StudentGradeCalculator
{
    public static HashMap<String, Integer> sheet()
    {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("ARTS", 0);
        marks.put("MATHS", 0);
        marks.put("ENGLISH", 0);
        marks.put("CHEMISTRY", 0);
        marks.put("PHYSICS", 0);
        marks.put("BIOLOGY", 0);
        
        return marks;
    }
    
    public static HashMap<String, Integer> marksEntry(HashMap<String, Integer> marks)
    {
        System.out.println("Please enter the marks(out of 100) of following subjects:");
        
        for (String key : marks.keySet()) 
        {
            System.out.print(key + ": ");
            Scanner s = new Scanner(System.in);
            int val = s.nextInt();
            marks.put(key,val);
        }
        return marks;
    }
    
    public static int totCal(HashMap<String, Integer> marks)
    {
        int tot = 0;
        for (String key : marks.keySet()) 
        {
            tot = tot + marks.get(key);
        }
        return tot;
    }
    
    public static String gradCal(int avg)
    {
        if (avg <= 50){return "FAIL";}
        else if (avg >= 91 && avg <= 100){return "S Grade";}
        else if (avg >= 81 && avg < 91){return "A Grade";}
        else if (avg >= 71 && avg < 81){return "B Grade";}
        else if (avg >= 61 && avg < 71){return "C Grade";}
        else if (avg >= 51 && avg < 61){return "D Grade";}
        return null;
    }
    
    
    
    public static void main(String [] args)
    {
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("");
        
        HashMap<String, Integer> marks = sheet();
        marks = marksEntry(marks);
        int total = totCal(marks);
        System.out.println("");
        System.out.println("Your total marks are " + total);
        int avg = total / 6;
        System.out.println("Your average pecentage is " + avg);
        String grade = gradCal(avg);
        System.out.println("Your grade is " + grade);
    }
}






