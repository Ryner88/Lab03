package lab03;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        var alice = getStudent("Alice");
        System.out.printf("[Alice] Worst lab: %s, Final grade: %.01f\n",
                        alice.worstLab());

        var bob = getStudent("Bob");
        System.out.printf("[Bob] Worst lab: %s, Final grade: %.01f\n",
                          bob.worstLab());
   }

    /**
     * Load and build a StudentGrade from the grades table.
     *
     * @param  name  The name of the student
     * @return       A new StudentGrade record
     */
    public static StudentGrade getStudent(String name) {
        var rows = Files.readRows("grades.csv");

        double examGrade = 0.0;

        for (var row : rows) {
            if (row.studentName().equals(name)) {
                System.out.println(row);
            }
        }

        return new StudentGrade(name, labs, examGrade);
        //return 5;
    }
}

// Put your LabGrade record definition here.
/**
 * record for LabGrade that stores lab assignments
 *    
 * 
 */


record LabGrade(String name, double score) {
   
}

// Put your StudentGrade record definition here.
/**
 * record for StudentGrade that stores list of lab grades
 * 
 * 
 */
record StudentGrade(String name, List<LabGrade> LabGrade, double examGrade) {
    
    public LabGrade worstLab() {
        return Collections.min(LabGrade, (lg1 , lg2) -> Double.compare(lg1.score(), lg2.score()));
  
    }
}
  