public class Vehiculo {
    public String id;
    public String tipo;
    public String proveedor;
    public Usuario usuario;
    public String estado;
    public Double precio;

    public boolean verificarDisponibilidad(){
        return true;
    }

    public void asignarVehiculo(Usuario usuario){
        this.usuario = usuario;
    }

    public Double getPrecio(){
        return precio;
    }

    public String getId(){
        return id;
    }
    public static void cancelarVehiculo(String id){}
}
