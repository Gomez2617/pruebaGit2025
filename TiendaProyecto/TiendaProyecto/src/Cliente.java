public class Cliente extends Persona {

    public Cliente() {}

    public Cliente(int id, String nombre, String cedula, String telefono) {
        super(id, nombre, cedula, telefono);
    }

    public void realizarCompra() {
        System.out.println(getNombre() + " realiza una compra.");
    }
}