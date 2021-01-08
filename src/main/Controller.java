package main;

import java.io.IOException;

public class Controller {

    public static void main(String[] args) throws IOException {//throws DivideByZeroException {

        Model model = new Model();
        View view = new View();
        int a;
        int b;
        double result;
        String sign;

        while (true) {
            a = view.provideFirstNumber();
            b = view.provideSecondNumber();
            sign = view.provideSign();
            model.setA(a);
            model.setB(b);
            model.setSign(sign);
            try {
               result = model.process(a, b, sign);
               view.result(a, b, sign, result);
            }
            //catch (DivideByZeroException e){
            //    System.out.println("**");
           // }
            finally {
                boolean close = view.close();
                if (close) break;
                else continue;
            }
        }
    }
}