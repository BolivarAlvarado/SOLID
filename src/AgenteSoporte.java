public class AgenteSoporte {
    public String id;
    public String nombre;
    private Incidencia incidenciaAsignada;

    public void asignarIncidencia(Incidencia incidencia) {
        this.incidenciaAsignada = incidencia;
    }
}
