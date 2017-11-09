package sherman.kyle;

public class Parent {
    protected int i = 5;
    private Integer I;
    protected double d = 2.5;
    private Double D;
    public static String familyName;

    public Parent(){
        //System.out.println("Parent default constructor");

        this.i = i;
        I = new Integer(3);
        this.d = d;
        D = new Double(2.5);
        familyName = new String("Sherman");
    }

    public Parent(int i, double d){ // Usage by signature(Parent(int, double))
        System.out.println("Parent custom constructor #1");
        this.i = i;
        this.d = d;
        I = new Integer(i);
        D = new Double(d);
        System.out.println(i);
        System.out.println(d);
        familyName = new String("Sherman");
    }

    public Integer getI() {
        return I;
    }

    public void setI(Integer i) {
        I = i;
    }

    public Double getD() {
        return D;
    }

    public void setD(Double d) {
        D = d;
    }

}
