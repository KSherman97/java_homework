package sherman.kyle;

public class ChildA extends Parent {
    int i1 = 0;
    double d1 = 0;
    int i = 0;
    double d = 0;

    public ChildA(){
        this.i = 100;

        System.out.println("In Child A's Constructor");
        System.out.println("Parent i: " + super.i + " This.i: " + this.i);
    }

    public ChildA(int i, double d, int i1, double d1) {
        super(i, d);
        this.i1 = i1;
        this.d1 = d1;
    }

    public void ChangeName(String familyName){
        familyName = "ObermanJensen";
    }
}
