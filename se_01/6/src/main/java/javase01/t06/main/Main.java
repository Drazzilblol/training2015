package javase01.t06.main;
import javase01.t06.notepad.*;

/**
 * Created by Drazz on 04.10.2015.
 *
 * main класс, выводит на экран список,
 * затем удаляет запись, выводит список опять,
 * редактирует запись, и выводит только ее
 */
public class Main {
    public static void main(String[] args)
    {
        Notepad notepad = new Notepad();
        notepad.addNote("first", "blahblah");
        notepad.addNote("second", "blahblah123123");
        notepad.addNote("3rd", "qwerty");
        notepad.printAllNotes();

        notepad.removeNote(1);
        notepad.printAllNotes();

        notepad.editNote(0, "edited first", "edited text");
        System.out.println(notepad.getNote(0).toString());
    //    System.out.println(notepad.getNoteById(1).getText());
    }
}
