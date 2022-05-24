package solid_patterns.interface_segregation;

public class Run {
    public static void main(String[] args) {
        StringConversations stringConversations = new StringConversations();

        System.out.println(stringConversations.convertStringToChars("Hello world!"));
    }
}
