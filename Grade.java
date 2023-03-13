package classespackage;

/* This is part of the starter code!
 * You need to complete this class yourself!*/
import java.util.*;
public class Grade // Used to change grade from int to char and vice versa.
{
    private static int score;
    private static String letterGrade;
//----------------------------------------------------------------------------------------------------
    //Getters
    public static int getScore() //Numerical e.g 99
    {
        return score;
    }
    public static String getLetterGrade()
    {
        return letterGrade;
    }
//----------------------------------------------------------------------------------------------------
    // Setters
    public void setScore(int score)
    {
        this.score= score;
    }
    public static String setLetterGrade(int score)
    {
        // sets letterGrade variable to correct string letter, depending on score value.
        if (score >= 90)
        {
            return "A";
        } else if (score >= 85) {
            return "A-";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 70) {
            return "B-";
        } else if (score >= 65) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 55) {
            return "C-";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }


//----------------------------------------------------------------------------------------------------
    // Default constructor

    Grade()
    {
        this.score = 0;
        this.letterGrade = "";
    }
    // Custom constructor
    Grade(int score, String letterGrade)
    {
        this.score = score;
        this.letterGrade = letterGrade;
    }
//----------------------------------------------------------------------------------------------------

}// end of classespackage.Grade class
