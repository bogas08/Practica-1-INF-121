package EJER5;
class Celular {
    private String nroTel;
    private String duenio;
    private double espacio;
    private int ram;
    private int nroApp;
    
    public Celular(String nroTel, String duenio, double espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.duenio = duenio;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }
    
    // Sobrecarga ++ para aumentar apps en 10
    public void incrementar() {
        this.nroApp += 10;
    }
    
    // Sobrecarga -- para disminuir espacio en 5 GB
    public void decrementar() {
        this.espacio -= 5;
        if(this.espacio < 0) this.espacio = 0;
    }
    
    public void mostrarDatos() {
        System.out.println("Tel: " + nroTel + ", Dueño: " + duenio + 
                         ", Espacio: " + espacio + "GB, RAM: " + ram + 
                         "GB, Apps: " + nroApp);
    }
}

