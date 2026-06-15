public class Q11 {
    public static void main(String[] args) {

        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } 
            else if (Character.isDigit(ch)) {
                numbers++;
            } 
            else if (Character.isWhitespace(ch)) {
                spaces++;
            } 
            else {
                others++;
            }
        }

        System.out.println("The string is : " + str);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}