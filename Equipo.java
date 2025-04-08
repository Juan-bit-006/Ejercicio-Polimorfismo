import java.util.ArrayList;
import java.util.List;

class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas;
    
  
    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
        tiempoTotalEquipo = 0;
    }
   
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public int getTiempoTotalEquipo() {
        calcularTiempoTotal();
        return tiempoTotalEquipo;
    }
    
    public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void anadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        calcularTiempoTotal();
    }
    
 
    private void calcularTiempoTotal() {
        tiempoTotalEquipo = 0;
        for (Ciclista ciclista : ciclistas) {
            tiempoTotalEquipo += ciclista.gettiempoAcum();
        }
    }
    
    
    public void listarNombresCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre() + " (" + ciclista.imprimirTipo().substring(7) + ")");
        }
    }
    
    
    public void imprimirDatosCiclistaPorId(int id) {
        boolean encontrado = false;
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == id) {
                ciclista.imprimirDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No hay un ciclista con el id: " + id);
        }
    }
    
    
    public void imprimirDatosEquipo() {
        System.out.println("=== Datos del Equipo ===");
        System.out.println("Nombre: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + getTiempoTotalEquipo() + " minutos");
        System.out.println("Número de ciclistas: " + ciclistas.size());
    }
}