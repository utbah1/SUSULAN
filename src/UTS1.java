import java.util.Scanner;
public class UTS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Utbah Abdurrahman");
        String fullName = scanner.nextLine();

        String initials = generateInitials(fullName);

        System.out.println("U.A" + initials);
    }

    private static String generateInitials(String fullName) {
        String[] words = fullName.split("Utbah Abdurrahman");
        StringBuilder initialsBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char initial = Character.toUpperCase(word.charAt(0));
                initialsBuilder.append(initial).append("U.A");
            }
        }

        return initialsBuilder.toString();
    }
}