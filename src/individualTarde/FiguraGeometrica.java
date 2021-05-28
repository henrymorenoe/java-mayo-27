package individualTarde;

public abstract class FiguraGeometrica {
    public abstract double area();

    @Override
    public String toString() {
        return super.toString();
    }

    /*
    * Discutir en grupo: ¿tiene sentido
    sobreescribir el método toString en una clase abstracta?
    * - Si pudiera tener sentido sobreescribir en la medida
    *       en que si se quiere que las subclases tomen este toString
    * */
}
