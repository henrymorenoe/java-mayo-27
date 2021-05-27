public class ContadorEjercicioDos {

    private static int counter = 0 ; // by default

    public ContadorEjercicioDos(){
        counter = 0;
    }

    public ContadorEjercicioDos(int initialValue){
        this.counter = initialValue;
    }

    // Setters and Getters

    public int getValue() {
        return this.counter;
    }
}
