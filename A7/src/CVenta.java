import java.util.Date;
import java.util.Scanner;

public class CVenta {
    private String idVenta;
    private String nroDocumento;
    private Date fechaVenta;
    private int idVendedor;
    private int idCliente;
    private double precioTotal;
    private double igv;
    private double descuento;
    private String estado;
    /*public CVenta() {
        System.out.print("Ingrese ID Venta: ");
        this.setIdVenta(new Scanner(System.in).nextLine());
        System.out.print("Ingrese N°Documento: ");
        this.setNroDocumento(new Scanner(System.in).nextLine());
        System.out.print("Ingrese Fecha de Venta: ");
        this.setFechaVenta(new Scanner(System.in).nextLine());
        System.out.print("Ingrese  ID Vendedor: ");
        this.setIdVendedor(new Scanner(System.in).nextInt());
        System.out.print("Ingrese ID Cliente: ");
        this.setIdCliente(new Scanner(System.in).nextInt());
        System.out.print("Ingrese Precio Total: ");
        this.setPrecioTotal(new Scanner(System.in).nextInt());
        System.out.print("Ingrese IGV: ");
        this.setIgv(new Scanner(System.in).nextInt());
        System.out.print("Ingrese Descuento: ");
        this.setDescuento(new Scanner(System.in).nextInt());
        System.out.print("Ingrese Estado: ");
        this.setEstado(new Scanner(System.in).nextLine());
    }

*/
    public CVenta(String idVenta, String nroDocumento, Date fechaVenta, int idVendedor, int idCliente, double precioTotal, double igv, double descuento, int idDetalleVenta, String estado) {
        this.idVenta = idVenta;
        this.nroDocumento = nroDocumento;
        this.fechaVenta = fechaVenta;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.precioTotal = precioTotal;
        this.igv = igv;
        this.descuento = descuento;
        this.estado = estado;

    }

    public String getIdVenta() {
        return idVenta;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getIgv() {
        return igv;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void mostrar(){
        System.out.println("Nombre: "+this.idVenta);
        System.out.println("Apellido: "+this.nroDocumento);
        System.out.println("T.Documento: "+this.fechaVenta);
        System.out.println("N°Documento: "+this.idVendedor);
        System.out.println("Correo: "+this.idCliente);
        System.out.println("Tipo: "+this.precioTotal);
        System.out.println("Tipo: "+this.igv);
        System.out.println("Tipo: "+this.descuento);
        System.out.println("Estado: "+this.estado);

    }
}
