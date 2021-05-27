public class TestCuentaCorriente {

        public static void main(String[] args) {
            // write your code here
            CuentaCorriente cuenta_1 = new CuentaCorriente("424325");
            cuenta_1.ingreso(1000);
            System.out.println("Test Saldo debe ser 1000 ; is " +cuenta_1.getSaldo());
            System.out.println("------ test egreso -----");
            Integer testcantidadEgreso = cuenta_1.egreso("password", 500);
            if (testcantidadEgreso == 500){
                System.out.println("--GREEN-- OK paso el test. ");
            }else{
                System.out.println("--RED-- No pasado !!!");
            }
        }
}
