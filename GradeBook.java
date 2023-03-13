package classespackage;
/* This is part of the starter code!
 * You need to complete this class yourself!*/

import java.util.*;

public class GradeBook  //stores student data into an array
{
    private static ArrayList<Student> listOfStudents;  //classespackage.Student refers to classespackage.Student class
   // int lengthOfArray = listOfStudents.size();  // length of arraylist
    //----------------------------------------------------------------------------------------------------
    GradeBook() // Custom constructor to initialize Array of student objects
    {
        listOfStudents = new ArrayList<Student>();

    }
//----------------------------------------------------------------------------------------------------
    public static void addToArray(Student s) // Adding our object to the array method
    {
        listOfStudents.add(s);
    }
//----------------------------------------------------------------------------------------------------

    // METHODS
    public static int getMinScore() //get min number score
    {
        int grade;
        int minScore = listOfStudents.get(0).getGrade();
        for (Student student : listOfStudents)
        {
            grade = student.getGrade();
            if (grade < minScore)
            {
                minScore = grade;
            }
        }
        return minScore;
    }
    //----------------------------------------------------------------------------------------------------
    public static int getMaxScore() // Max number score  // Need to change to similar to GetMinScore()
    {
        int grade;
        int maxScore = listOfStudents.get(0).getGrade();

        for ( int i = 0; i < listOfStudents.size(); i++)
        {
            grade = listOfStudents.get(i).getGrade();
            if (grade > maxScore)
            {
                maxScore = grade;
            }
        }
        return maxScore;
    }
    //----------------------------------------------------------------------------------------------------
    public static String getMinLetterGrade() // returns lowest letter grade
    {
        return Grade.setLetterGrade(GradeBook.getMinScore());
    }
    //----------------------------------------------------------------------------------------------------
    public static String getMaxLetterGrade() // highest letter grade
    {
        return Grade.setLetterGrade(GradeBook.getMaxScore());
    }
    //----------------------------------------------------------------------------------------------------
    public static String getLetterGrade(int pid)
    {
        for (Student student : listOfStudents)
        {
            if (student.getPid() == pid)
            {
                return Grade.setLetterGrade(student.getGrade());
            }
        }
        return null + " This pid does not exist";
    }
    //----------------------------------------------------------------------------------------------------
    public static String getFullName(int pid) {
        for (Student student : listOfStudents) {
            if (student.getPid() == pid) {
                return student.getFirstName() + " " + student.getLastName();
            }
        }
        return null + " This pid does not exist";  // incase pid doesnt exist
    }
    //----------------------------------------------------------------------------------------------------
    public static String updateGrade(int pid, int newGrade)
    {
        for (Student student : listOfStudents)
        {
            if (student.getPid() == pid)
            {
                student.setGrade(newGrade);
                break;
            }
        }
        return null + " This pid does not exist";// incase pid doesnt exist
    }
    //----------------------------------------------------------------------------------------------------
    public static double getAverageScore() // Mean
    {
        int sum = 0;
        for (Student student : listOfStudents) {
            sum += Grade.getScore();
        }

        float listsize = listOfStudents.size();

        return (float) sum/listsize;
    }
    //----------------------------------------------------------------------------------------------------
    public static String getAverageLetterGrade()
    {
        double sum = 0;
        for (Student student : listOfStudents)
        {
            sum += student.getGrade();
        }
        double averageNumericGrade = sum / listOfStudents.size();
        int averageNumericGradeInt = (int) Math.rint(averageNumericGrade); //rounds double to a whole int
        return Grade.setLetterGrade(averageNumericGradeInt); //returns a string letter e.g "A"
    }
    //----------------------------------------------------------------------------------------------------
    public static void printTabularScores() //Tab scores
    {
        System.out.println("First Name\t\tLast Name\t\tPID\t\t\tScore");
        for (Student student : listOfStudents)
        {
            System.out.println(student.getFirstName() + "\t\t\t\t" + student.getLastName() + "\t\t\t\t" + student.getPid() + "\t\t" + student.getGrade());
        }
    }
    //----------------------------------------------------------------------------------------------------
    public static void printTabularLetters()  //Tab letters
    {
        System.out.println("First Name\t\tLast Name\t\tPID\t\t\t Grade");
        for (Student student : listOfStudents)
        {
            System.out.println(student.getFirstName() + "\t\t\t\t" + student.getLastName() + "\t\t\t\t" + student.getPid() + "\t\t" + Grade.setLetterGrade(student.getGrade()) );
        }
    }
    //----------------------------------------------------------------------------------------------------
    public static String medianLetter()  //Median letter ( middle val)
    {
        int medscore = (int)medianScore();  //
        return Grade.setLetterGrade(medscore);
    }
    //----------------------------------------------------------------------------------------------------
    public static double medianScore() //median score
    {
        // Create an array to store all the scores
        double[] scores = new double[listOfStudents.size()];
        int i = 0;
        for (Student student : listOfStudents)
        {
            scores[i] = student.getGrade();
            i++;
        }

        // Sort the scores   Bbb Jjj 1234567 80   Hhh Kkk 2345678 90   Iii Ttt 4567890 30
        Arrays.sort(scores);

        // Calculate the median score
        double median;
        int middle = scores.length / 2;  // mid val
        if (scores.length % 2 == 0)   // modolo
        {
            median = (scores[middle - 1] + scores[middle]) / 2.0;
        } else
        {
            median = scores[middle];
        }
        return median;
    }

//----------------------------------------------------------------------------------------------------
} // end of GradeBook class
