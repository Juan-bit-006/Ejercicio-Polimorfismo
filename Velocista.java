class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedioSprint;
    
   
    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadPromedioSprint) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
    
    
    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    
    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    
    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }
    
    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
    
    
    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }
    
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio + " vatios");
        System.out.println("Velocidad promedio en sprint: " + velocidadPromedioSprint + " Km/h");
    }
}