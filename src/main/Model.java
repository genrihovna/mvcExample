package main;

public class Model<ByZeroException extends Throwable> {

    private int a;
    private int b;
    private String sign;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double process(int a, int b, String sign) {//throws DivideByZeroException {
        switch (sign) {
            case "+":
                return a + b;
            //break; //why break is unreachable statement?
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                //if (b != 0) {
                    return a / b;
               // } else throw new DivideByZeroException("Divide by zero is prohibited!");
            default:
                assert false: "Unknown sign: " + sign;
                return 0; //don't know what should be returned
        }
    }
}

class DivideByZeroException extends Exception{


    public DivideByZeroException(String mes){
        //super(mes);
        System.out.println(mes);
    }

}

