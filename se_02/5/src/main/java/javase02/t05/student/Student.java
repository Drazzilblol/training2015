package javase02.t05.student;

import javase02.t05.group.Group;
import javase02.t05.journal.Progress;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 20.10.2015.
 */
public class Student {
    private String name;
    private List<Group> groups = new ArrayList<>();

    public List<Group> getGroups() {
        return groups;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void compareStudentProgress() {
        Double maxGrade = 0.0;
        String groupWithMaxGrade = "";
        Double minGrade = 10.0;
        String groupWithMinGrade = "";
        for (Group g : groups) {
            Double avg = Progress.calculateAverage(g.getProgressByName(name).getGrades());
            if (maxGrade < avg) {
                maxGrade = avg;
                groupWithMaxGrade = g.getGroupName();
            }
            if (minGrade > avg) {
                minGrade = avg;
                groupWithMinGrade = g.getGroupName();
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("%s average grades in his groups", name));
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("%s | %s", groupWithMaxGrade, maxGrade));
        System.out.println(String.format("%s | %s", groupWithMinGrade, minGrade));
    }


}
