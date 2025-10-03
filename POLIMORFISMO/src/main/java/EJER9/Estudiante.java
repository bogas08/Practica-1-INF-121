package EJER9;
class Estudiante {
    private String nombre;
    private String apellidos;
    private double parcial1;
    private double parcial2;
    private double exFinal;
    
    public Estudiante() {}
    
    public Estudiante(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Estudiante(String nombre, String apellidos, double p1, double p2, double ef) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.parcial1 = p1;
        this.parcial2 = p2;
        this.exFinal = ef;
    }
    
    // Sobrecarga notaFinal
    public double notaFinal() {
        return parcial1 + parcial2 + exFinal;
    }
    
    public double notaFinal(double pesoP1, double pesoP2, double pesoEF) {
        return (parcial1 * pesoP1 + parcial2 * pesoP2 + exFinal * pesoEF) / 100;
    }
    
    // Sobrecarga aprobo
    public boolean aprobo() {
        return notaFinal() > 51;
    }
    
    public boolean aprobo(double notaMinima) {
        return notaFinal() > notaMinima;
    }
    
    public boolean aprobo(double notaMinima, double notaExtra) {
        return (notaFinal() + notaExtra) > notaMinima;
    }
    
    // Sobrecarga mostrar
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Parcial 1: " + parcial1);
        System.out.println("Parcial 2: " + parcial2);
        System.out.println("Ex Final: " + exFinal);
    }
    
    public void mostrar(String formato) {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Nota Final: " + notaFinal());
    }
}
