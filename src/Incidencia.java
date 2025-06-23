public class Incidencia {
    public String id;
    public String descripcion;
    public String estado;
    public Usuario usuario;
    public Reserva reserva;
    public AgenteSoporte agente;

    public String reportarIncidencia(String descripcion){
        agente.asignarIncidencia(new Incidencia());
        return "Incidencia reportada";
    }

    public String revisarIncidencia(){
        String solucion = resolverIncidencia();
        return solucion;
    }

    public String resolverIncidencia(){
        return "solucion";
    }

    public void escalar(){
        // Método vacío según tu instrucción
    }

    public void cerrar(){
        // Método vacío según tu instrucción
    }
}

