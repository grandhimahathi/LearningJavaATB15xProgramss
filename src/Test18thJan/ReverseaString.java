package Test18thJan;

public class ReverseaString {
    public static void main(String[] args) {
        String input = "Automation";
        String reverse = "";
        for (int i = input.length()-1; i >=0; i--) {
            reverse = reverse+input.charAt(i);
        }
        System.out.println(reverse);
    }
}
