package pedido;

public class Pedido {

    public double calcularValorPedido(String primerPlato, String bebida) {
        double precioPrimerPlato = 55.0;
        double precioBebida = 10.5;
        return precioPrimerPlato + precioBebida;
    }

    public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida) {
        double precioPrimerPlato = 25.0;
        double precioSegundoPlato = 25.0;
        double precioBebida = 5.5;
        return precioPrimerPlato + precioSegundoPlato + precioBebida;
    }

    public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida, String postre) {
        double precioPrimerPlato = 30.0;
        double precioSegundoPlato = 35.0;
        double precioBebida = 1.5;
        double precioPostre = 7.0;
        return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
    }


}