package EJER5;
public class main {
    public static void main(String[] args) {
        Celular cel = new Celular("12345678", "Juan", 64, 4, 15);
        
        System.out.println("Antes:");
        cel.mostrarDatos();
        
        cel.incrementar(); 
        cel.decrementar(); 
        
        System.out.println("Después:");
        cel.mostrarDatos();
    }
}
