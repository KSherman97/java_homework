// Kyle Sherman
// 11/9/2017
// Name: Inheritance Practice
// Description: This program is to practice with inheritance in Java

package sherman.kyle;

public class Main extends Parent{

    public static void main(String[] args) {
         //Parent p1 = new Parent(); // instantiate the parent class using default constructor

        // Parent p2 = new Parent(1,2);

        ChildA c1 = new ChildA();

        // ChildA c2 = new ChildA();

        c1.d = c1.getD();
        c1.i = c1.getI();

        c1.setI(1);
        c1.setD(2.5);

        System.out.println("Double: " + c1.getD() + " Integer: " + c1.getI());

        System.out.println(familyName);
        Parent.familyName = "Obermansholtz";
        System.out.println(familyName);
    }
}
