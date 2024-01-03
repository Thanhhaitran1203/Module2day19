public class Main {
    private static ClassNameExpresion classNameExpresion;
    public static final String[] validClasName = {"C0223G","A0323K"};
    public static final String[] invalidClasName = {"M0318G", "P0323A"};
    public static void main(String[] args) {
        classNameExpresion = new ClassNameExpresion();
        for (String name:validClasName) {
            boolean isValid = classNameExpresion.validate(name);
            System.out.println(name +" "+ isValid);
        }
        for (String name:invalidClasName) {
            boolean isValid = classNameExpresion.validate(name);
            System.out.println(name + " " + isValid);
        }
    }
}