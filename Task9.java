public class Task9 {
    public static void main(String[] args) {
        String name = "Java Programming";
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                count++;
            }
        }

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == ' ')
                continue;

            boolean flag = false;

            // check if already occurred before
            for (int k = 0; k < i; k++) {
                if (name.charAt(i) == name.charAt(k)) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                continue;

            int charCount = 0;

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    charCount++;
                }
            }

            System.out.println(name.charAt(i) + " : " + charCount);
        }

        System.out.println("Total number of characters in the string is: " + count);
    }
}