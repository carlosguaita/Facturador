import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public char memuPrincipal(){
        char opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opción que desea realizar");
        System.out.println("a. Facturar producto");
        System.out.println("b. Imprimir factura");
        System.out.println("c. Salir");
        opcion = sc.next().charAt(0);
        return opcion;
    }

    public char menuProductos(){
        char opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoja el producto que desea facturar");
        System.out.println("a. Llantas (Precio normal: $150) (Precio al por mayor, desde 6 unidades: $130)");
        System.out.println("b. Kit Pastillas de freno (Precio normal: $55) (Precio al por mayor, desde 12 unidades: $45)");
        System.out.println("c. Kit de embrague (Precio normal: $180) (Precio al por mayor, desde 8 unidades $165)");
        System.out.println("d. Faro (Precio normal: $70) (Precio al por mayor, desde 10 unidades: $60)");
        System.out.println("e. Radiador (Precio normal: $120) (Precio al por mayor, desde 6 unidades: $105)");
        opcion = sc.next().charAt(0);
        return opcion;
    }


    public boolean seguirIngresando(){
        boolean opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea ingresar otro producto (y/n)");
        opcion = sc.next().charAt(0)=='y'? true : false;
        return opcion;
    }
}
