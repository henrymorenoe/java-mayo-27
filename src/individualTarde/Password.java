package individualTarde;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String regEx = "";
    private String pwd = ""; /**
     - cifrar y saltear password;
     - no guardar plana
     - NO manipular en distintos lugares lo posible este tipo de informacion
     **/

    // Constructors

    public Password(String regEx){
        setRegex(regEx);
    }

    public Password(){

    }
    // Getters and Setters

    private void setRegex(String regEx) {
        // TODO
        /**
         * ¿ validar regEx ??
         * **/
        this.regEx = regEx;
    }


    public String getRegex() {
        return this.regEx;
    }


    public boolean setValue(String pwd) {
        // TODO
        /**
         *
         * **/
        boolean isPasswordOk =  validateAgainstRegex(pwd);
        if (isPasswordOk){
            this.pwd = pwd;
            return true;
        }else{
            return false;
        }

    }


    private boolean validateAgainstRegex(String pwd) {
        Pattern pattern = Pattern.compile(getRegex());
        Matcher matcher = pattern.matcher(pwd);
        boolean matchFound = matcher.find() ;
        if (matchFound){
            return matchFound;
        }else {
            throw new InputMismatchException("No es una password valida segun los estandares definidos en la RegEx");
        }

    }


}
