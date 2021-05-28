package individualTarde;

public class PasswordFuerte extends Password{

    private String regEx = "^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$";


    public PasswordFuerte(){

    }

    @Override
    public String getRegex() {
        return this.regEx;
    }
}
