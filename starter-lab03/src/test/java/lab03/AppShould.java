package lab03;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppShould {

    @Test
    void have_task1() {
     

        var lg = new LabGrade("lab03", 55.5);
        assertEquals("lab03", lg.name());
        assertEquals(55.5, lg.score(), 0.001);
    }

    
    StudentGrade makeCarol() {
        var labs = List.of(
            new LabGrade("lab2", 20.0),
            new LabGrade("lab3", 10.0),
            new LabGrade("lab1", 30.0));
        return new StudentGrade("Carol", labs, 41.0);
    }
    

    @Test
    void have_task2() {

       
        var sg = makeCarol();
        assertEquals("lab3", sg.worstLab());
    }

    @Test
    void have_task3() {

      
        var sg = makeCarol();
        assertEquals(30.5, sg.finalGrade(), 0.1);
    }

    @Test
    void have_task4() {

        
        var bob = App.getStudent("Bob");
        assertEquals("lab03", bob.worstLab());
        assertEquals(63.4, bob.finalGrade(), 0.1);
    }
}
