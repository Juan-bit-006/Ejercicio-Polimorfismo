public class SistemaCiclismo {
    public static void main(String[] args) {
      
        Equipo equipo = new Equipo("Team Sky", "Reino Unido");
        
       
        Velocista velocista = new Velocista(1, "Mark Cavendish", 320.5, 65.8);
        velocista.settiempoAcum(120);
        
        Escalador escalador = new Escalador(2, "Nairo Quintana", 5.8f, 15.6f);
        escalador.settiempoAcum(125);
        
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Tony Martin", 54.7);
        contrarrelojista.settiempoAcum(118);
        
      
        equipo.anadirCiclista(velocista);
        equipo.anadirCiclista(escalador);
        equipo.anadirCiclista(contrarrelojista);
        
       
        equipo.imprimirDatosEquipo();
        
       
        equipo.listarNombresCiclistas();
        
       
        System.out.println("\nDatos del ciclista con ID 2:");
        equipo.imprimirDatosCiclistaPorId(2);
        
       
        System.out.println("\nBuscando ciclista con ID 5:");
        equipo.imprimirDatosCiclistaPorId(5);
    }
}