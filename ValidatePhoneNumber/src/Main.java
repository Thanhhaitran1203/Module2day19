public class Main {
    public static void main(String[] args) {
        String[] validPhoneNumber = {"(84)-(0978489648)"};
        String[] invalidPhoneNumber = {"(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};
    PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
    for(String phoneNumber:validPhoneNumber){
        boolean isValid = phoneNumberExample.validate(phoneNumber);
        System.out.println(phoneNumber + " "+ isValid);
    }
        for(String phoneNumber:invalidPhoneNumber){
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println(phoneNumber + " "+ isValid);
        }
    }
}