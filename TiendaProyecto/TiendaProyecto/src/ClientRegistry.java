import java.util.ArrayList;
import java.util.List;

public class ClientRegistry {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void addCliente(Cliente c) {
        clientes.add(c);
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static Cliente findById(int id) {
        for (Cliente c : clientes) if (c.getId() == id) return c;
        return null;
    }
}
