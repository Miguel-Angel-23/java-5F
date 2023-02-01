
import java.util.Scanner;

public class CDetalleVenta {
    private int idDetalleVenta ;
    private int idVenta;
    private int idProducto; //es una flor...
    private int cantidad;
    private double descuento;
    private double precio;
    public CDetalleVenta() {
        System.out.print("Ingrese ID Detalle Venta: ");
        this.setIdDetalleVenta(new Scanner(System.in).nextInt());
        System.out.print("Ingrese ID Venta : ");
        this.setIdVenta(new Scanner(System.in).nextInt());
        System.out.print("Ingrese ID Producto: ");
        this.setIdProducto(new Scanner(System.in).nextInt());
        System.out.print("Ingrese Cantidad: ");
        this.setCantidad(new Scanner(System.in).nextInt());
        System.out.print("Ingrese Descuento: ");
        this.setDescuento(new Scanner(System.in).nextInt());
        System.out.print("Ingrese Precio: ");
        this.setPrecio(new Scanner(System.in).nextInt());

    }

    public CDetalleVenta(int idDetalleVenta, int idVenta, int idProducto, int cantidad, double descuento, double precio) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.precio = precio;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println("ID DetalleVenta: "+this.idDetalleVenta);
        System.out.println("ID Venta: "+this.idVenta);
        System.out.println("ID Producto: "+this.idProducto);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("Descuento: "+this.descuento);
        System.out.println("Precio: "+this.precio);

    }
}
