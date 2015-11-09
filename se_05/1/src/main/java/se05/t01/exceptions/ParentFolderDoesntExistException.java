package se05.t01.exceptions;

/**
 * Created by Drazz on 09.11.2015.
 */
public class ParentFolderDoesntExistException extends RuntimeException {
    public ParentFolderDoesntExistException(String message){
        super(message);
    }
}
