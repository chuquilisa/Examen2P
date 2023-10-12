package pedido;

public class suma {
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double sumar(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        suma suma = new suma();

        int result1 = suma.sumar(8, 4);
        int result2 = suma.sumar(3, 5, 4);
        double result3 = suma.sumar(8.7, 6.5);
        double result4 = suma.sumar(8.5, 6.8, 9.2);

        System.out.println("<Resultado> 1 = " + result1);
        System.out.println("<Resultado> 2 = " + result2);
        System.out.println("<Resultado> 3 = " + result3);
        System.out.println("<Resultado> 4 = " + result4);
    }
}