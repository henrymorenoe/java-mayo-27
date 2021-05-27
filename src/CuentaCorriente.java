public class CuentaCorriente {
        private String  numeroCuenta;
        private Integer saldo;
        private int numeroTransaccionesPorDia;


        // Constructors
        public CuentaCorriente(String numeroCuenta){
            boolean hasBeenSetNumeroCuenta =  setNumeroCuenta(numeroCuenta);
            this.saldo = 0;
            if(!hasBeenSetNumeroCuenta)
                System.out.println("ERROR en metodo setNumeroCuenta :: " + hasBeenSetNumeroCuenta);
        }


        // Methods: business ops.
        public boolean ingreso(Integer monto){
            // TODO
            /** validaciones: Diferente de 0; cantidad maxima
             **/
            try {
                setSaldo(this.saldo + monto);
                //System.out.println("despues de sumar en ingreso a saldo es: :" + this.saldo );
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

    public boolean setSaldo(Integer monto){
            // TODO
        /**
         * Validaciones ... no null, maximo ...
         * **/
            this.saldo = monto;
            return true;
    }

    public Integer getSaldo(){
            //TODO
        /**
         * validar algun tipo de password para Autenticar ...
         * **/
        return this.saldo;
    }

}
