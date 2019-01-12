import java.awt.*;

public class Test {

    static synchronized protected final void specialMethod(){

    }
    public static final int A = 5;

    public static void main(String[] args) {


    }
}

class A {
    protected int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void print(){
        System.out.println("Jestem obiektem klasy A");
    }
}

class B {
    A a = new A();

    void test(){
        int i = a.counter;
    }
}
