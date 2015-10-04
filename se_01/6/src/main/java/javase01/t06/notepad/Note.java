package javase01.t06.notepad;

/**
 * Created by Drazz on 04.10.2015.
 *
 * класс заметка в блокноте, не знаю зачем тут поле ID
 *
 */
public class Note {
    /** хранит id заметки */
    private int id;
    /** хранит название заметки */
    private String title;
    /** хранит текст заметки */
    private String text;
    /** конструктор, принимет параметры id, title, text */
    public Note(int id, String title, String text )
    {
        this.id = id;
        this.title = title;
        this.text = text;
    }
    /** получить текст заметки */
    public String getText()
    {
        return text;
    }
    /** задать текст заметки */
    public void setText(String text)
    {
        this.text = text;
    }
    /** задать название заметки */
    public void setTitle(String title)
    {
        this.title = title;
    }
    /** задать ID заметки, модификатор доступа package */
    void setId(int id)
    {
        this.id = id;
    }
    /** перегруженый toString(), возвращает строку из id, названия и текста */
    public String toString()
    {
        return this.id + " " + this.title + " " + this.text;
    }
}
