public class Empleado extends Persona {
    private String cargo;
    private double salario;

    public Empleado() {}

    public Empleado(int id, String nombre, String cedula, String telefono, String cargo, double salario) {
        super(id, nombre, cedula, telefono);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public void registrarTurno() {
        System.out.println(getNombre() + " registró su turno.");
    }

    public void atenderCliente() {
        System.out.println(getNombre() + " está atendiendo un cliente.");
    }
    
    @Override
    public String toString() {
        return "Empleado{" +
           "id=" + getId() +
           ", nombre='" + getNombre() + '\'' +
           ", cedula='" + getCedula() + '\'' +
           ", telefono='" + getTelefono() + '\'' +
           ", cargo='" + cargo + '\'' +
           ", salario=" + salario +
           '}';
    }
}