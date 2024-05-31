public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {
                "Hello World!",
                "No, I mean it!",
                "HELLO WORLD!"
        };
        while (i < greetings.length) {
            System.out.println(greetings[i]);
            i++;
        }
    }
}
