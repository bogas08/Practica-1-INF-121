package ejer3;

public class Matriz {
    private float[][] matriz;
    
    // Constructor con valores predeterminados (matriz identidad)
    public Matriz() {
        matriz = new float[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
    }
    
    // Constructor con matriz específica
    public Matriz(float[][] matriz) {
        this.matriz = matriz;
    }
    
    // Método sumar
    public Matriz sumar(Matriz otra) {
        float[][] resultado = new float[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    
    // Método restar
    public Matriz restar(Matriz otra) {
        float[][] resultado = new float[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                resultado[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    
    // Método igual
    public boolean igual(Matriz otra) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(this.matriz[i][j] != otra.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
    
