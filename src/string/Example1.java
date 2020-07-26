package string;

public class Example1 {
    public static void main(String[] args) {
        String name = "SadabHassan";
        String duplicateName = new String("SadabHassan");
        System.out.println(name == duplicateName);
        System.out.println(name.equals(duplicateName));

        // UpperCase and LowerCase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // length
        System.out.println(name.length());

        // startWith and EndsWith
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.endsWith("an"));

        // charAt
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(5));

        // replace
        String replacedString = name.replace("Sa", "   Sa");
        System.out.println(replacedString);

        //trim
        System.out.println(replacedString.trim());

        //substring

        System.out.println(name.substring(5));
        System.out.println(name.substring(0, name.length()));
    }
}