package pkg;

import java.io.Serializable;

public class EvenOddTester implements Serializable {

    private int num;

    public EvenOddTester() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isEven() {
        return 0 == num % 2;
    }
}
