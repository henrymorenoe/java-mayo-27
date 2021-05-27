package individualTarde;

import java.util.InputMismatchException;

public class testPassword {

    public static void main(String[] args) {
        System.out.println("Test 1: constructor pasando una RegEx");
        String regEx = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$" ;
        Password myPassword = new Password(regEx);
        if(myPassword.getRegex()==regEx){
            System.out.println("--- OK ---- green");
        }else{
            System.out.println("--- Red ---- !!!");
        }

        System.out.println("Test 2: validar la regex con setValue()");
        testSetValueAgainstRegex(myPassword, "myPassword*123", true);
        // fails cases
        try {
            testSetValueAgainstRegex(myPassword, "mypassword", false);
        } catch (InputMismatchException e){
            //e.printStackTrace();
            System.out.println("  Error del InputMismatchException customizado:: "+e.getLocalizedMessage());
            if(e.getLocalizedMessage() == "No es una password valida segun los estandares definidos en la RegEx")
            {   System.out.println("--- OK --- green ");
            }else {
                System.out.println("--- Red --- !!! ");
            }

        }




    }


    // Auxiliar methods: to test .. etc ..

    private static void testSetValueAgainstRegex(Password myPassword, String pwdToTest, boolean isEquals) {
        boolean hasSetValue =  myPassword.setValue(pwdToTest);
        if(hasSetValue == isEquals){
            System.out.println("---OK--- green");
        }else {
            System.out.println("---Red--- !!! ");
        }
    }

}
