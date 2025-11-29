import java.util.ArrayList;

public class Tienda {
    private int codigo;
    private String direccion;
    private String ciudad;

    private ArrayList<Empleado> empleados;
    private ArrayList<Venta> ventas;
    private ArrayList<Producto> productos; // ✅ AGREGAR esta línea

    public Tienda(String jugueteria, String maxi_Tienda, String popayán) {
        empleados = new ArrayList<>();
        ventas = new ArrayList<>();
        productos = new ArrayList<>(); // ✅ INICIALIZAR la lista
        this.direccion = maxi_Tienda != null ? maxi_Tienda : "Dirección no especificada";
    this.ciudad = popayán != null ? popayán : "Ciudad no especificada";
    }

    public Tienda(int codigo, String direccion, String ciudad) {
        this("Jugueteria", "Maxi Tienda", "popayán");
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
        System.out.println("Venta registrada en la tienda.");
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    // ✅ IMPLEMENTAR métodos para productos
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigoBarras().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public Iterable<Producto> getProductos() {
        return productos;
    }

    // Getters y Setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public ArrayList<Empleado> getEmpleados() { return empleados; }
    public ArrayList<Venta> getVentas() { return ventas; }
}