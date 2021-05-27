public class CuentaCorriente {
        private String  numeroCuenta;
        private Integer saldo;
        private int numeroTransaccionesPorDia;


        // Constructors
        public CuentaCorriente(String numeroCuenta){
            boolean hasBeenSetNumeroCuenta =  setNumeroCuenta(numeroCuenta);
            if(!hasBeenSetNumeroCuenta)
                System.out.println("ERROR en metodo setNumeroCuenta :: " + hasBeenSetNumeroCuenta);
        }


        // Methods: business ops.
        public boolean ingreso(Integer monto){
            // TODO
            /** validaciones: Diferente de 0; cantidad maxima
             **/
            try {
                this.saldo = this.saldo + monto;
                return true;
            } catch (Exception e){
                return false;
            }
        }

    // Setters and Getters customized ...
    private boolean setNumeroCuenta(String numeroCuenta){
        try {
            // TODO
            /** Validar:
             * no null; caracteres y longitud permitidos...
             * **/
            this.numeroCuenta = numeroCuenta;
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
