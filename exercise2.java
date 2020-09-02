public class exercise2 {
    public static void main(String[] args) {

        String original = "abcde";
        StringBuilder reversedString = new StringBuilder();

        for(int i = original.length()-1; i>=0; i--){
            reversedString.append(original.charAt(i));
        }

        System.out.print("The reversed string of the '"+original+"' is: " );
        System.out.println(reversedString);
    }
}