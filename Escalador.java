class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;
    
 
    public Escalador(int identificador, String nombre, float aceleracion, float grado) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracion;
        this.gradoRampa = grado;
    }
    
   
    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }
    
    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }
    
    public float getGradoRampa() {
        return gradoRampa;
    }
    
    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    
  
    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }
    
   
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración promedio: " + aceleracionPromedio + " m/s2");
        System.out.println("Grado de rampa soportada: " + gradoRampa + " grados");
    }
}