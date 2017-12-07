// Kyle Sherman
// In Class example work from 12/7/2017
package Java.InClass;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;

public class Main {

    public static int factorial(int i){
        if (i == 1)
        {
            return 1;
        }
        return (i * factorial(i-1));
    }

    public static int fibonacci(int i){
        if(i <= 2)
            return 1;
        else{
            return (fibonacci(i-1) + fibonacci(i-2));
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(factorial(6));
        System.out.println(fibonacci(20));

        // barray is an index array of bthings
        System.out.println("New array of Bclass items");
        BClass[] barray = new BClass[5];
        barray[0] = new BClass("Kyle Sherman", 1, "test");
        barray[1] = new BClass("Gary Sherman", 2, "test");
        barray[2] = new BClass("Spencer Sherman", 3, "test");
        barray[3] = new BClass("Jeremy Sherman", 4, "test");
        barray[4] = new BClass("Clint Stauffer", 5, "Test");

        // for loop to print out the contents of the bclass
        for(int index = 0; index < 5; index++){
            System.out.println(
                    barray[index].getNameString() + " " +
                    barray[index].getIdInt() + " " +
                    barray[index].getIdkString()
            );
        }

        System.out.println("\n" + "New ArrayList of type CClass");

        ArrayList<CClass> clist = new ArrayList<CClass>();
        clist.add(new CClass("Kyle Sherman", 1, 20));
        clist.add(new CClass("Gary Sherman", 2, 21));
        clist.add(new CClass("Spencer Sherman", 3, 14));
        clist.add(new CClass("Jeremy Sherman", 4, 17));
        for (CClass c : clist) {System.out.println(
                c.getNameString() + " " +
                c.getIdInt() + " " +
                c.getAgeInt()
        );}

        System.out.println("\n" + "New ArrayList of type AClass containing bitems");
        ArrayList<AClass> alist = new ArrayList<AClass>();
        /**
        for(int i = 0; i < barray.length; i++) {
            alist.add(barray[i]);
        }
         */
        for(BClass bAll : barray) {alist.add(bAll);}
            System.out.println(alist.toString());
    }
}
