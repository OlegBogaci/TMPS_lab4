package solid_patterns.interface_segregation;

public class StringConversations implements stringToChars,intToString{

    @Override
    public String convertIntToString(int integer) {
        return new String(Integer.toString(integer));
    }

    @Override
    public char[] convertStringToChars(String string) {
        char[] chars = new char[string.length()];
        chars=string.toCharArray();
        return chars;
    }
}
