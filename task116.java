public class Task116{
    public static void main(String[] args) {
        String input = "Flag";

        StringBuilder palindrome = new StringBuilder("galf");
        
        if(input.equals(palindrome)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Input string is not a Palindrome");
        }
        
    }
}
