public class CVendedor {
    private int idVendedor;
    private String tipoDocumento;
    private String numDocumento;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private String estado;

    public CVendedor(int idVendedor, String tipoDocumento, String numDocumento, String nombre, String apellido, String correo, String contraseña, String estado) {
        this.idVendedor = idVendedor;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


