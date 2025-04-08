
abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcum;
    

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcum = 0;
    }
    
   
    public int getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int gettiempoAcum() {
        return tiempoAcum;
    }
    
    public void settiempoAcum(int tiempoAcum) {
        this.tiempoAcum = tiempoAcum;
    }
    

    public abstract String imprimirTipo();
    
  
    public void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcum + " minutos");
        System.out.println("Tipo: " + imprimirTipo());
    }
}