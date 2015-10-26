package javase03.t02.main;

import javase03.t02.questionnaire.Questionnaire;

/**
 * Created by Drazz on 26.10.2015.
 */
public class Main {
    public static void main(String[] args){
        Questionnaire q = new Questionnaire();
        q.setLanguage();
        q.ask();

    }
}
