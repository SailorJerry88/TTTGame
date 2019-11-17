package Game.Exeption;

public class FieldTakenExeption extends RuntimeException{

    public FieldTakenExeption() {

    }

    public FieldTakenExeption(String message) {
        super(message);
    }

    public FieldTakenExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public FieldTakenExeption(Throwable cause) {
        super(cause);
    }

    public FieldTakenExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
