// Kyle Sherman
// This is a child class of the AClass

package Java.InClass;

public class CClass extends AClass{
    // initialize variables
    private int ageInt;

    // constructors
    public CClass(String nameString, int idInt, int ageInt){
        super(nameString, idInt);
        this.ageInt = ageInt;
    }

    // getters and setters
    public int getAgeInt(){
        return ageInt;
    }
    public void setAgeInt(){
        this.ageInt = ageInt;
    }

    // methods
    @Override
    public String toString() {
        return "CClass{" +
                "ageInt=" + ageInt +
                '}';
    }
}
