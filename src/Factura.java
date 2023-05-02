import java.util.Scanner;

public class Factura {
    Producto llantas;
    Producto kitFrenos;
    Producto kitEmbrague;
    Producto faros;
    Producto radiador;

    Cliente cliente;

    double subtotal;

    double total;

    public Factura(){
        this.llantas=new Producto();
        this.kitFrenos=new Producto();
        this.kitEmbrague=new Producto();
        this.faros=new Producto();
        this.radiador=new Producto();
    }

    public void facturarProducto(char opcion){
        Scanner sc = new Scanner(System.in);
        int cantidad=0;
        switch (opcion){
            case 'a':
                System.out.println("Ingrese la cantidad de llantas que desea facturar");
                cantidad = sc.nextInt();
                this.llantas=  new Producto("llantas", 150,130,6,cantidad);
                break;
            case 'b':
                System.out.println("Ingrese la cantidad de Kit Pastillas de freno que desea facturar");
                cantidad = sc.nextInt();
                this.kitFrenos= new Producto("Kit Pastillas de freno", 55,45,12,cantidad);
                break;
            case 'c':
                System.out.println("Ingrese la cantidad de Kit de embrague que desea facturar");
                cantidad = sc.nextInt();
                this.kitEmbrague= new Producto("Kit de embrague", 180,165,8,cantidad);
                break;
            case 'd':
                System.out.println("Ingrese la cantidad de Faros que desea facturar");
                cantidad = sc.nextInt();
                this.faros= new Producto("Faros", 70,60,10,cantidad);
                break;
            case 'e':
                System.out.println("Ingrese la cantidad de Radiadores que desea facturar");
                cantidad = sc.nextInt();
                this.radiador =  new Producto("Radiador", 120,105,10,cantidad);
                break;
            default:
                System.out.println("la opción elegida no es válida");
                break;
        }
    }

    public void calculoSubtotal(){
        this.subtotal = llantas.obtenerTotal()+kitFrenos.obtenerTotal()+kitEmbrague.obtenerTotal()+faros.obtenerTotal()+radiador.obtenerTotal();
    }

    public void aplicarDescuento(){

        if(this.subtotal>100 && this.subtotal<=500){
            this.total=this.subtotal*0.95;
        } else if (this.subtotal>500 && this.subtotal<=1000) {
            this.total=this.subtotal*0.93;
        }else if (this.subtotal>1000) {
            this.total=this.subtotal*0.90;
        }else {
            this.total=this.subtotal;
        }
    }

    public void ingresarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Cliente:");
        String nombre =  sc.next();
        System.out.println("Ingrese la cedula del Cliente:");
        String cedula =  sc.next();
        this.cliente=new Cliente(nombre,cedula);
    }

    public void imprimirFactura(){
        System.out.println("Nombre del cliente: "+cliente.getNombre());
        System.out.println("Cédula del cliente: "+cliente.getCedula());
        System.out.println("Producto                    cantidad        precio           total");
        if(llantas.getCantidad()>0){
            System.out.println(llantas.getNombre()+"               "+llantas.getCantidad()+"        "+llantas.getPrecio()+"         "+llantas.obtenerTotal());
        }
        if(kitFrenos.getCantidad()>0){
            System.out.println(kitFrenos.getNombre()+"  "+kitFrenos.getCantidad()+"        "+kitFrenos.getPrecio()+"         "+kitFrenos.obtenerTotal());
        }
        if(kitEmbrague.getCantidad()>0){
            System.out.println(kitEmbrague.getNombre()+"    "+kitEmbrague.getCantidad()+"        "+kitEmbrague.getPrecio()+"         "+kitEmbrague.obtenerTotal());
        }
        if(faros.getCantidad()>0){
            System.out.println(faros.getNombre()+"               "+faros.getCantidad()+"        "+faros.getPrecio()+"         "+faros.obtenerTotal());
        }
        if(radiador.getCantidad()>0){
            System.out.println(radiador.getNombre()+"               "+radiador.getCantidad()+"        "+radiador.getPrecio()+"         "+radiador.obtenerTotal());
        }
        System.out.println("El subtotal es: "+this.subtotal);
        System.out.println("El total es:"+this.total);
    }

}
