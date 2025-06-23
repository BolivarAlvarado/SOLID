import java.time.LocalDate;
import java.util.List;

public class Vuelo {
    public String id;
    public String origen;
    public String destino;
    public LocalDate horario;
    public String clase;
    public String aerolinea;
    public boolean disponibilidad;
    public List<Usuario> usuarios;
    public Double precio;
    public boolean verificarDisponibilidad(String origen, String destino, LocalDate fecha){
        return disponibilidad;
    }

    public String getDestino(){
        return destino;
    }

    public String getOrigen(){
        return origen;
    }

    public LocalDate getFecha(){
        return horario;
    }

    public void asignarVuelo(Usuario user){
        usuarios.add(user);
    }

    public Double getPrecio(){
        return precio;
    }

    public String getId(){
        return id;
    }

    public static void cancelarVuelo(String id){}
    
}
