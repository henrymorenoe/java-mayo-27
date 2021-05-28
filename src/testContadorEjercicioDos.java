import java.util.function.DoubleToIntFunction;

public class testContadorEjercicioDos {
    public static void main(String[] args) {
        //test constructor por defecto
        System.out.println("1) Test: constructor por defecto = 0");
        ContadorEjercicioDos counter = new ContadorEjercicioDos();
        if(counter.getValue() == 0){
            System.out.println("--- OK --- green");
        }else {
            System.out.println("--- red --- !!! ");
        }
        System.out.println("2) Test: constructor con parametros: valor inicial .. 3");
        ContadorEjercicioDos counterDos = new ContadorEjercicioDos(3);
        System.out.println("    - Pass case ...");
        testValueCounter( 3, 3, true);
        System.out.println("    - Fail case ...");
        testValueCounter( 3, 5, false);
    }

    private static void testValueCounter( int valorConstructor, int valorAContrastar, boolean isEqual) {
        ContadorEjercicioDos counter = new ContadorEjercicioDos(valorConstructor);
        // Cuidado: .equals en caso de ser necesario:::: referenciaas !!!
        if (isEqual == (counter.getValue() == valorAContrastar)) {
            System.out.println("        --- OK ---- green");
        } else {
            System.out.println("        --- red --- !!!");
        }
    }
}

