public class CuentaCorriente {

        private String  numeroCuenta;
        private Integer saldo;
        private int numeroTransaccionesPorDia; // TODO


        // Constructors


        public CuentaCorriente(String numeroCuenta){
            boolean hasBeenSetNumeroCuenta =  setNumeroCuenta(numeroCuenta);
            this.saldo = 0;
            if(!hasBeenSetNumeroCuenta)
                System.out.println("ERROR en metodo setNumeroCuenta :: " + hasBeenSetNumeroCuenta);
        }


        // Methods: business ops.


        private boolean autenticarUsuario(){
            // TODO
            /**
             * Autenticar segun practicas de seguridad en estos casos - consultar
             * **/
            return false;
        }


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


        public Integer egreso(String password, Integer cantidadSolicitada){
            Integer valueToReturn = 0;
            // TODO
            /**
             * Autenticar antes de hacer alguna transaccion (usar un metodo comun de validar)
             * validar cantidades no cero, no exceder saldo
             * **/
            return valueToReturn;
        }


        public boolean reintegro(){
            // TODO
            /**
             * Definir firmas (parametros a usar)
             * Validar montos no nulos etc ...
             *
             * **/

            return false;
        }


        public boolean transferencia(String cuentaDestinataria, String password, Integer montoParaTransferir){
            //TODO
            /**
             * Autenticar password
             * verificar : existencia de la cuenta destinataria
             * validar: monto not null, que no supere el numero de tranascciones permitidas por dia,  maximo monto ...
             * **/
            return false;
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
