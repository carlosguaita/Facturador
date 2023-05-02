public class Main {
    public static void main(String[] args) {
        Menu menu =  new Menu();
        Factura factura = new Factura();
        System.out.println("Bienvenido al sistema de facturación");
        boolean opcionsalir=true;
        do {
            char opcion = menu.memuPrincipal();
            switch (opcion) {
                case 'a':
                    do {
                        char opcion1 = menu.menuProductos();
                        factura.facturarProducto(opcion1);
                    } while (menu.seguirIngresando());
                    break;
                case 'b':
                    factura.calculoSubtotal();
                    factura.aplicarDescuento();
                    factura.ingresarCliente();
                    factura.imprimirFactura();
                    opcionsalir=false;
                    break;
                default:
                    opcionsalir=false;
                    break;
            }
        }while (opcionsalir);

    }
}