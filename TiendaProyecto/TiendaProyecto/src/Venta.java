import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fecha;
    private double total;
    private Cliente cliente;
    private Empleado empleado;
    private List<ItemVenta> items;

    public Venta() {
        this.items = new ArrayList<>();
    }

    public Venta(int idVenta, Date fecha, Cliente cliente, Empleado empleado) {
        this();
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    // Getters y Setters completos
    public int getIdVenta() { 
        return idVenta; 
    }
    
    public void setIdVenta(int idVenta) { 
        this.idVenta = idVenta; 
    }
    
    public Date getFecha() { 
        return fecha; 
    }
    
    public void setFecha(Date fecha) { 
        this.fecha = fecha; 
    }
    
    public double getTotal() { 
        return total; 
    }
    
    public void setTotal(double total) { 
        this.total = total; 
    }
    
    public Cliente getCliente() { 
        return cliente; 
    }
    
    public void setCliente(Cliente cliente) { 
        this.cliente = cliente; 
    }
    
    public Empleado getEmpleado() { 
        return empleado; 
    }
    
    public void setEmpleado(Empleado empleado) { 
        this.empleado = empleado; 
    }
    
    public List<ItemVenta> getItems() { 
        return items; 
    }
    
    public void setItems(List<ItemVenta> items) { 
        this.items = items; 
    }

    public void agregarItem(Producto producto, int cantidad) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(new ItemVenta(producto, cantidad));
    }

    public void calcularTotal() {
        this.total = 0;
        if (items != null) {
            for (ItemVenta item : items) {
                this.total += item.getProducto().getPrecio() * item.getCantidad();
            }
        }
    }

    
    public static class ItemVenta {
        private Producto producto;
        private int cantidad;

        public ItemVenta(Producto producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public Producto getProducto() { 
            return producto; 
        }
        
        public void setProducto(Producto producto) { 
            this.producto = producto; 
        }
        
        public int getCantidad() { 
            return cantidad; 
        }
        
        public void setCantidad(int cantidad) { 
            this.cantidad = cantidad; 
        }
        
        public double getSubtotal() {
            return producto.getPrecio() * cantidad;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta #").append(idVenta)
          .append(" - Fecha: ").append(fecha)
          .append(" - Total: $").append(String.format("%.2f", total))
          .append("\nCliente: ").append(cliente != null ? cliente.getNombre() : "N/A")
          .append(" - Empleado: ").append(empleado != null ? empleado.getNombre() : "N/A")
          .append("\nProductos:\n");
        
        if (items != null && !items.isEmpty()) {
            for (ItemVenta item : items) {
                sb.append("  - ").append(item.getProducto().getNombre())
                  .append(" x ").append(item.getCantidad())
                  .append(" = $").append(String.format("%.2f", item.getSubtotal()))
                  .append("\n");
            }
        } else {
            sb.append("  No hay productos\n");
        }
        sb.append("=====================================\n");
        return sb.toString();
    }
}