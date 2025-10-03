package EJER7;
class Sistema {
    private String[] admins;
    private String[][] autos;
    private int nroAdmins;
    private int nroAutos;
    
    public Sistema() {
        admins = new String[10];
        autos = new String[10][3]; // [marca, modelo, color]
        nroAdmins = 0;
        nroAutos = 0;
    }
    
    public Sistema(String[] admins, String[][] autos) {
        this.admins = admins;
        this.autos = autos;
    }
    
    public void mostrar() {
        System.out.println("Administradores:");
        for(int i = 0; i < nroAdmins; i++) {
            System.out.println("- " + admins[i]);
        }
        
        System.out.println("Autos:");
        for(int i = 0; i < nroAutos; i++) {
            System.out.println("- " + autos[i][0] + " " + autos[i][1] + " " + autos[i][2]);
        }
    }
    
    // Sobrecarga: agregar admin
    public void adicionar(String admin) {
        if(nroAdmins < admins.length) {
            admins[nroAdmins++] = admin;
        }
    }
    
    // Sobrecarga: agregar auto
    public void adicionar(String marca, String modelo, String color) {
        if(nroAutos < autos.length) {
            autos[nroAutos][0] = marca;
            autos[nroAutos][1] = modelo;
            autos[nroAutos][2] = color;
            nroAutos++;
        }
    }
}