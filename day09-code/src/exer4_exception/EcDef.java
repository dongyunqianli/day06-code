package exer4_exception;

public class EcDef extends Exception{
    static final long serialVersionUID=-33875164229948L;

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
