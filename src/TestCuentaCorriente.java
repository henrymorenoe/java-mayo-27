public class TestCuentaCorriente {

        public static void main(String[] args) {
            // write your code here
            CuentaCorriente cuenta_1 = new CuentaCorriente("424325");
            cuenta_1.ingreso(1000);
            System.out.println("Test Saldo debe ser 1000 ; is " +cuenta_1.getSaldo());
        }
}
