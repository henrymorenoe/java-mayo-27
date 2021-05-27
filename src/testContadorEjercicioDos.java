import java.util.function.DoubleToIntFunction;

public class testContadorEjercicioDos {
    public static void main(String[] args) {
        //test constructor por defecto
        System.out.println("1) Test: constructor por defecto = 0");
        ContadorEjercicioDos counter = new ContadorEjercicioDos();
        if(counter.getValue()==0){
            System.out.println("--- OK ----");
        }else {
            System.out.println("--- Red !!--");
        }
        System.out.println("2) Test: constructor con parametros: valor inicial .. 3");
        ContadorEjercicioDos counterDos = new ContadorEjercicioDos(3);
        if(counterDos.getValue() == 3){
            System.out.println("--- OK ----");
        }else{
            System.out.println("--- Red !! ---");
        }


        }
    }

