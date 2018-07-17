import java.util.TooManyListenersException;

public class Exercise {

public void exampleMethod(String input)
{
    System.out.println(input);
}


public void exampleReturn(String input)
{System.out.println(input);}


public int addi(int a, int b, boolean c) {
    int Total;
    if (c) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
    } else {
        Total = a + b;
        return Total;
    }


    return 0;
    //
}


}

