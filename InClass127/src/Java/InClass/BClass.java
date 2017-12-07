// Kyle Sherman
// This is a child class of AClass

package Java.InClass;

public class BClass extends AClass {
    // There must be a matching constructor in the AClass. This means
    // that if no constructor exists here, then there must also be a
    // default (blank) constructor in the parent class.

    // initialize variables
    private String idkString;

    // constructors
    public BClass(){
        super();
    }

    public BClass(String nameString, int idInt) {
        super(nameString, idInt);
    }

    public BClass(String nameString, int idInt, String idkString){
        super(nameString, idInt);
        this.idkString = idkString;
    }

    // getters and setters
    public String getIdkString(){
        return idkString;
    }
    public void setIdkString(String idkString){
        this.idkString = idkString;
    }

    // methods

    @Override
    public String toString() {
        return "BClass{" +
                "idkString='" + idkString + '\'' +
                super.toString() + '\'' +
                '}';
    }
}
