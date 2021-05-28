package individualTarde;

public class testFiguraGeometrica {
    public static void main(String[] args) {
        System.out.println("Test objetoCirculo.area()");
        FiguraGeometrica circulo = new Circulo();
        System.out.println("    Pass case ----");
        testAreaCirculo(circulo,5.0d, 78, 79, true);
        System.out.println("    fail case -----");
        testAreaCirculo(circulo,7.0d, 78, 79, false);


    }

    private static void testAreaCirculo( FiguraGeometrica figura, double radio, int rangoInferiorRespuesta, int rangoSuperiorRespuesta, boolean isEqual) {
        ((Circulo) figura).setRadio(radio);
        if (isEqual == (figura.area() > rangoInferiorRespuesta && figura.area()<rangoSuperiorRespuesta)) {
            System.out.println("        -> --- OK --- green");
        }else {
            System.out.println("        -> --- Red --- !!! ");
        }
    }
}
