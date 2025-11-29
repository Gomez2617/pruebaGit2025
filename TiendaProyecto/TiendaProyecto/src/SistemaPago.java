public class SistemaPago {

    public boolean validarTransaccion(String datos) {
        // Simulación de validación simple
        return datos != null && !datos.trim().isEmpty();
    }

    public boolean procesarPago(double monto, String medioPago) {
        // Simulación: siempre valida si medioPago no está vacío y monto > 0
        if (monto <= 0) return false;
        if (medioPago == null || medioPago.trim().isEmpty()) return false;
        // aquí podría integrarse con pasarelas reales; para el ejercicio devolvemos true
        System.out.println("Procesando pago de " + monto + " por " + medioPago);
        return true;
    }
    
    // Método adicional para mejor funcionalidad
    public String obtenerMediosPagoDisponibles() {
        return "Efectivo, Tarjeta de Crédito, Tarjeta de Débito";
    }
}