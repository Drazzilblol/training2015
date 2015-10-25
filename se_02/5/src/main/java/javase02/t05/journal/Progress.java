package javase02.t05.journal;

import javase02.t05.student.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 20.10.2015.
 */
public class Progress<T extends Number> {
    private Student student;
    private List<T> grades = new ArrayList<>();

    public Progress(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void addRate(T grade) {

        grades.add(grade);
    }

    public List<T> getGrades() {
        return grades;
    }

    public String toString() {
        return String.format("%s | %s", student.getName(), grades);
    }

    public static Double calculateAverage(List<? extends Number> grades) {
        Double sum = 0.0;
        if (!grades.isEmpty()) {
            for (Number grade : grades) {
                if (grades.get(0) instanceof Double) {
                    sum += grade.doubleValue();
                } else if (grades.get(0) instanceof Integer) {
                    sum += grade.doubleValue();
                }
            }
            return sum / grades.size();
        }
        return sum;
    }

}
