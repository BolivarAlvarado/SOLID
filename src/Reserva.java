import java.time.LocalDate;
import java.util.List;

public class Reserva {
    public String id;
    private Usuario usuario;
    private Vuelo vuelo;
    private Vehiculo vehiculo;
    private Pago pago;
    List<Vehiculo> vehiculos;
    List<Vuelo> vuelos;

    public void reservar(String origen, String destino, LocalDate fecha) {
        // Buscar vuelo disponible
        for (Vuelo v : vuelos) {
            if (v.verificarDisponibilidad(origen, destino, fecha)) {
                this.vuelo = v;
                break;
            }
        }

        // Buscar vehículo disponible
        for (Vehiculo ve : vehiculos) {
            if (ve.verificarDisponibilidad()) {
                this.vehiculo = ve;
                break;
            }
        }
        seleccionarVueloVehiculo(vuelo,vehiculo);
    }

   public void seleccionarVueloVehiculo(Vuelo v,Vehiculo ve){
    v.asignarVuelo(usuario);
    ve.asignarVehiculo(usuario);
   }

   public String  enviarDatosPago(){
     return pago.procesarPago();
   }

public void accederReservarActuales(String id) {
    cancelarReserva(id);
}

public String cancelarReserva(String id) {
    Reserva reserva = obtenerReservaPorId(id);
    
    if (verificarPoliticas(reserva)) {
        Vuelo.cancelarVuelo(reserva.getVuelo().getId());
        Vehiculo.cancelarVehiculo(reserva.getVehiculo().getId());
        return "mensaje";

    }else{
        return "mensaje";
    }
}

private Reserva obtenerReservaPorId(String id) {
    return new Reserva();
}

private boolean verificarPoliticas(Reserva reserva) {
    return true;
}

public Vuelo getVuelo(){
    return vuelo;
}
public Vehiculo getVehiculo(){
    return vehiculo;
}

}

