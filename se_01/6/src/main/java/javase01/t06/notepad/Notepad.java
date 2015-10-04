package javase01.t06.notepad;

/**
 * Created by Drazz on 04.10.2015.
 *
 * класс блокнот
 */
public class Notepad {
    /** массив с записями */
    private Note[] noteArray = new Note[6];
    /** счетчик записей в массиве */
    private int noteCounter = 0;
    /** добавить новую запись в блокнот, если массив с записями заполнен,
     * создает новый массив, в 2 раза больше и перезаписывает заметки в него */
    public void addNote(String title, String text)
    {
        if (noteCounter >= noteArray.length)
        {
            Note[] tempArr = noteArray;
            noteArray = new Note[tempArr.length * 2];
            for (int i = 0; i < tempArr.length; i++)
            {
                noteArray[i] = tempArr[i];
            }
        }
        noteArray[noteCounter] = new Note(noteCounter, title, text);
        noteCounter++;
    }
    /** возвращает запись из блокнота по id */
    public Note getNote(int id)
    {
        return noteArray[id];
    }
    /** выводит на экран все записи */
    public void printAllNotes()
    {
        for (int i = 0; i < noteCounter; i++)
        {
            System.out.println(noteArray[i].toString());
        }
    }
    /** редактировать запись, id менять нельзя */
    public void editNote(int id, String newTitle, String newText)
    {
        noteArray[id].setTitle(newTitle);
        noteArray[id].setText(newText);
    }
    /** перемещение заметки и сменя id */
    private void changeId(int oldId, int newId)
    {
        noteArray[newId] = noteArray[oldId];
        noteArray[oldId] = null;
        noteArray[newId].setId(newId);
    }
    /** удалить заметку и сместить массив на ее место */
    public void removeNote(int id)
    {
        for (int i = id; i < noteCounter - 1; i++) {
            changeId(id + 1, id);
        }
        noteCounter--;
    }
}
