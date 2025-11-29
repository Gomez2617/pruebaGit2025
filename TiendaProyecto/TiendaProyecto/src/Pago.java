/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julia
 */
public class Pago {

    public static boolean procesarPago(double total, String medio) {
        SistemaPago sistema = new SistemaPago();
        return sistema.procesarPago(total, medio);
    }

    public static boolean validarTransaccion(String medio) {
        SistemaPago sistema = new SistemaPago();
        return sistema.validarTransaccion(medio);
    }
    
}