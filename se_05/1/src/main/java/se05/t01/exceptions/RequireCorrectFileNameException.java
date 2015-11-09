package se05.t01.exceptions;

/**
 * Created by Drazz on 09.11.2015.
 */
public class RequireCorrectFileNameException extends RuntimeException {

    public RequireCorrectFileNameException(String message) {
        super(message);
    }
}
