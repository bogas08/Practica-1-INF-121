package EJER2;
class FiguraGeometrica {
    
    public double area(double lado) {
        return lado * lado;
    }
    
    public double area(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public double area(double radio, String tipo) { 
        return Math.PI * radio * radio;
    }
    
    public double perimetro(double ancho, double alto) {
        return 2 * (ancho + alto);
    }
    
    public double perimetro(double radio) { 
        return 2 * Math.PI * radio;
    }
}
