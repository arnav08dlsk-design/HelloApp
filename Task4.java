
public class Task4 {
    public static void main(String[] args) {
      String name = "Java Programming";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                count++; 
            }
        }
        for (int i = 0; i < name.length(); i++) {
            int charCount = 0;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    charCount++;
                }

            }            if (name.charAt(i) != ' ' && charCount > 0) {
                System.out.println(name.charAt(i) + " : " + charCount);
                charCount = 0;
            }
        }
        System.out.println("Total number of characters in the string is: " + count);
    }
}  

        