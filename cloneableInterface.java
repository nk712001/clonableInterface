package assignmentEdyoda2;
import java.util.*;

public class cloneableInterface {

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Abc obj =new Abc();
         obj.i=5;
         obj.j=6;

         Abc obj1 =(Abc)obj.clone();
         obj1.j=8;
         System.out.println(obj);
         System.out.println(obj1);

    }
    public static class Abc implements Cloneable {
        int i;
        int j;

        @Override
        public String toString() {
            return "i=" + i +"j=" + j;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

    }
}