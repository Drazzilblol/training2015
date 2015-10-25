package javase02.t05.group;

import javase02.t05.journal.Progress;
import javase02.t05.student.Student;
import javase02.t05.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 20.10.2015.
 */
public class Group<T extends Number> {
    private String subject;
    private String groupName;
    private List<Progress<T>> progressList = new ArrayList<>();

    public Group(String groupName, Subject subject) {
        this.groupName = groupName;
        this.subject = subject.name();
    }

    public void addStudent(Student student) {
        progressList.add(new Progress<T>(student));
        student.getGroups().add(this);
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Progress<T>> getProgressList() {
        return progressList;
    }

    public String getSubjectName() {
        return subject;
    }

    public Progress<T> getProgressByName(String name) {
        for (int i = 0; i < progressList.size(); i++) {
            if (progressList.get(i).getStudent().getName().toLowerCase().equals(name.toLowerCase())) {
                return progressList.get(i);
            }
        }
        return null;
    }

    public void printGroup() {
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("%s - %s", groupName, subject));
        System.out.println("--------------------------------------------------");
        for (Progress p : progressList) {
            System.out.println(p.toString());
        }
    }

    public void compareGroupProgress() {
        Double maxGrade = 0.0;
        String studentWithMaxGrade = "";
        Double minGrade = 10.0;
        String studentWithMinGrade = "";
        for (Progress p : progressList) {
            Double avg = Progress.calculateAverage(p.getGrades());
            if (maxGrade < avg) {
                maxGrade = avg;
                studentWithMaxGrade = p.getStudent().getName();
            }
            if (minGrade > avg) {
                minGrade = avg;
                studentWithMinGrade = p.getStudent().getName();
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("Students average grades in %s", groupName));
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("%s | %s", studentWithMaxGrade, maxGrade));
        System.out.println(String.format("%s | %s", studentWithMinGrade, minGrade));
    }


}
