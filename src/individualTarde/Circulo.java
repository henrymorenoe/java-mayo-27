package individualTarde;

public class Circulo extends FiguraGeometrica{
     /*
     ¿Qué error de compilación aparece? ¿Cómo lo solucionarías?
       - Error: "se debe implementar el metodo abstracto area de lo contrario
                se tiene que convertir en clase abstracta"
       - Solucion: sobreescribir el metodo abracto heredado de FiguraGeometrica
      */

    private double radio = 0;

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadio(), 2);
    }


    // Setters and Getters

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}
