package individualTarde;

public class Circulo extends FiguraGeometrica{
     /*
     ¿Qué error de compilación aparece? ¿Cómo lo solucionarías?
       - Error: "se debe implementar el metodo abstracto area de lo contrario
                se tiene que convertir en clase abstracta"
       - Solucion: sobreescribir el metodo abracto heredado de FiguraGeometrica
      */

    @Override
    public double area() {
        return 0;
    }
}
