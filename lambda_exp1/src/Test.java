import java.io.PrintStream;

public class Test {
    interface FuncInter1 {
        int operation(int a, int b, int c);    //SAM = Single Abstract Method
    }

    private int operate(int a, int b, int c, FuncInter1 fobj) {
        //implemented by FuncInter1 interface
        return fobj.operation(a, b, c);
    }

    public static void main(String[] args) {
        //                 lambda expression:
        FuncInter1 add = (int x, int y, int z) -> x + y + z;
        FuncInter1 multiply = (int x, int y, int z) -> x * y * z;
        Test tobj = new Test();
        System.out.println("Addition is 6+3+2 = " + tobj.operate(6,3, 2, add));
        System.out.println("Multiplication is 6*3*2 =  " + tobj.operate(6,3, 2, multiply));

    }
}
