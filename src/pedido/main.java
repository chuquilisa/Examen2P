package pedido;


public class main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        double valorPedido1 = pedido.calcularValorPedido("  PIQUE ", " SODA");
        double valorPedido2 = pedido.calcularValorPedido(" CHAJCHU ", " CHICHARRON ", "GUARAPO");
        double valorPedido3 = pedido.calcularValorPedido(" CHURRASCO ", " POLLO FRITO ", "AGUA ", " EMPANADA ");

        System.out.println("Precio del primer pedido : Bs.  " + valorPedido1);
        System.out.println("Precio del segundo pedido : Bs.  " + valorPedido2);
        System.out.println("Precio del tercer pedido  : Bs.  " + valorPedido3);
    }
}