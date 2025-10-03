package EJER11;
class Pasajero {
    private String nombre;
    private int edad;
    private String genero;
    
    public Pasajero(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    // Métodos getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getGenero() { return genero; }
}

class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private Pasajero[][] pasajeros;
    
    public Crucero(String nombre, String paisOrigen, String paisDestino) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.pasajeros = new Pasajero[3][100];
        this.nroPasajeros = 0;
    }
    
    // Método para simular operador ++ (leer)
    public void incrementar() {
        // Simular lectura de datos
        System.out.println("Leyendo datos del crucero: " + nombre);
    }
    
    // Método para simular operador -- (mostrar)
    public void decrementar() {
        System.out.println("Mostrando datos del crucero: " + nombre);
        System.out.println("Origen: " + paisOrigen + ", Destino: " + paisDestino);
    }
    
    // Método para simular operador == (suma costos)
    public boolean igual(Crucero otro) {
        // Simular comparación de costos
        return this.nroPasajeros == otro.nroPasajeros;
    }
    
    // Método para simular operador + (misma cantidad pasajeros)
    public boolean mismaCantidadPasajeros(Crucero otro) {
        return this.nroPasajeros == otro.nroPasajeros;
    }
    
    // Método para simular operador - (contar géneros)
    public void contarGeneros() {
        int hombres = 0, mujeres = 0;
        // Lógica para contar géneros
        System.out.println("Hombres: " + hombres + ", Mujeres: " + mujeres);
    }
}
