
package EJER2;

public class main {
    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica();
        
        System.out.println("Área cuadrado: " + figura.area(5));
        System.out.println("Área triángulo: " + figura.area(4, 3));
        System.out.println("Área círculo: " + figura.area(3, "circulo"));
        System.out.println("Perímetro rectángulo: " + figura.perimetro(4, 3));
        System.out.println("Perímetro círculo: " + figura.perimetro(3));
    }
}

