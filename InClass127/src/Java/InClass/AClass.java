// Kyle Sherman
// A Class (Parent Class)

package Java.InClass;

public class AClass {
    // initialize variables
    private String nameString;
    private int idInt;

    // constructors
    public AClass(){}

    public AClass(String nameString, int idInt){
        this.nameString = nameString;
        this.idInt = idInt;
    }

    // GETTERS AND SETTERS
    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        System.out.println("Name Changed");
        this.nameString = nameString;
    }

    public int getIdInt() {
        return idInt;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

    // methods
    public String dump(){
        System.out.print(this.toString());
        return this.toString();
    }

    @Override
    public String toString() {
        return "AClass{" +
                "nameString='" + nameString + '\'' +
                ", idInt=" + idInt +
                '}';
    }
}
