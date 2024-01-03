import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExpresion {
    private static final String CLASSNAME_REGEX = "^[CPA][\\w0-9]{4}[GHIK]$";
    public ClassNameExpresion(){
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
