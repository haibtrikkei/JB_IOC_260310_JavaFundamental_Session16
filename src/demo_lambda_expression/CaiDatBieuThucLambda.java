package demo_lambda_expression;

public class CaiDatBieuThucLambda {
    public static void main(String[] args) {
        InterfaceMath obj = (a,b)->a+b;

        System.out.println("Tổng của 2 số 3,5 là: "+obj.sum(3,5));
    }
}
