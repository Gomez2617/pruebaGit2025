public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String cedula;
    protected String telefono;

    public Persona() {}

    public Persona(int id, String nombre, String cedula, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    // Methods
    public void registrar() {
        System.out.println("Registrando persona: " + nombre);
    }

    public void consultarDatos() {
        System.out.println("ID: " + id + " Nombre: " + nombre + " Cedula: " + cedula + " Telefono: " + telefono);
    }
    
    @Override
    public String toString() {
        return id + " - " + nombre + " (" + cedula + ")";
    }
}