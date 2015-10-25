package javase02.t05.main;

import javase02.t05.group.Group;
import javase02.t05.journal.Progress;
import javase02.t05.student.Student;
import javase02.t05.subject.Subject;

/**
 * Created by Drazz on 20.10.2015.
 */
public class Main {
    public static void main(String ...args){

        Group<Double> math = new Group<>("arhimed", Subject.mathematic);
        Student mark = new Student("Mark");
        Student john = new Student("John");
        math.addStudent(mark);
        math.addStudent(john);
        math.getProgressByName("Mark").addRate(5.5);
        math.getProgressByName("Mark").addRate(3.2);
        math.getProgressByName("Mark").addRate(9.1);
        math.getProgressByName("john").addRate(3.4);
        Group<Integer> cs = new Group<>("nash", Subject.comuter_science);
        cs.addStudent(mark);
        cs.addStudent(john);
        cs.getProgressByName("mark").addRate(5);

        mark.compareStudentProgress();
        math.compareGroupProgress();
        math.printGroup();

    }
}
