import java.io.PrintStream;

public class Test {
    interface FuncInter1 {
        int operation(int a, int b);
    }

    private int operate(int a, int b, FuncInter1 fobj) {
        //implemented by FuncInter1 interface
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        //                 lambda expression:
        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;
        Test tobj = new Test();
        System.out.println("Addition is 6+3 = " + tobj.operate(6,3, add));
        System.out.println("Multiplication is 6*3 =  " + tobj.operate(6,3, multiply));


        //String message = "HELLO WORD!";
        PrintStream(message -> message.toLowerCase());
    }
}
