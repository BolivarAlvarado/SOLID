public class Pago {
    public String id;
    public Double monto;
    public String metodo;
    public String estado;

    public String procesarPago() {
        elegirMetodoPago();
        String resumenPago = generarResumenPago();
        return resumenPago;
    }

    public void aplicarDescuento() {
        monto = monto - 5.0; 
    }

    public void elegirMetodoPago() {
        aplicarDescuento();
        metodo = "Tarjeta";
    }

    public String generarResumenPago() {
        estado = "Procesado";
        return "Pago procesado con éxito. Monto final: $" + monto + " usando " + metodo;
    }
}

