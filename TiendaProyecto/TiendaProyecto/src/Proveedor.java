public class Proveedor extends Persona {
    private String empresa;
    private String contacto;

    public Proveedor() {}

    public Proveedor(int id, String nombre, String cedula, String telefono, String empresa, String contacto) {
        super(id, nombre, cedula, telefono);
        this.empresa = empresa;
        this.contacto = contacto;
    }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }
    public String getContacto() { return contacto; }
    public void setContacto(String contacto) { this.contacto = contacto; }

    public void registrarProducto() {
        System.out.println("Proveedor " + empresa + " registró un producto.");
    }

    public void enviarPedido() {
        System.out.println("Proveedor " + empresa + " envió un pedido.");
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + empresa;
    }
}