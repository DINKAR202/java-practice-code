import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of kids in the group
        int n = sc.nextInt();

        // Read the names of the kids and store them in the array
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // Read the total number of gifts that Santa Claus has
        int g = sc.nextInt();

        // Read the names of the initial two kids who received the gift
        String first = sc.next();
        String second = sc.next();

        sc.close();

        int[] gifts = new int[n];
        for (int i = 0; i < n; i++) {
            gifts[i] = 0;
        }

        int firstIndex = -1;
        for (int i = 0; i < n; i++) {
            if (names[i].equals(first)) {
                firstIndex = i;
                break;
            }
        }

        int secondIndex = -1;
        for (int i = 0; i < n; i++) {
            if (names[i].equals(second)) {
                secondIndex = i;
                break;
            }
        }

        String direction;
        if ((firstIndex + 1) % n == secondIndex) {
            direction = "Clockwise";
        } else {
            direction = "Anti-Clockwise";
        }

        System.out.println(direction);

        int currentIndex = secondIndex;
        int giftCount = 2;

        gifts[firstIndex]++;
        gifts[secondIndex]++;

        while (giftCount < g) {
            if (direction.equals("Clockwise")) {
                currentIndex = (currentIndex + 2) % n;
            } else {
                currentIndex = (currentIndex - 2 + n) % n;
            }
            
            gifts[currentIndex]++;
            giftCount++;
        }

        int maxGifts = 0;
        for (int i = 0; i < n; i++) {
            if (gifts[i] > maxGifts) {
                maxGifts = gifts[i];
            }
        }

        boolean firstPrinted = false;
        for (int i = 0; i < n; i++) {
            if (gifts[i] == maxGifts) {
                if (firstPrinted) {
                    System.out.print(", ");
                }
                System.out.print(names[i] + "-" + maxGifts);
                firstPrinted = true;
            }
        }
        System.out.println();

        if (direction.equals("Clockwise")) {
            currentIndex = (currentIndex - 2 + n) % n;
        } else {
            currentIndex = (currentIndex + 2) % n;
        }
        System.out.println(names[currentIndex]);
    }
}
