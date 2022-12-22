import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {

        int carts = 5, players = 0;

        String[] suits = {"clubs", "diamonds", "hearts ", "spades"};

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack ", "Queen ", "King ", "Ace"};

        int n = suits.length * rank.length; // количество карт


        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of players: ");
            if (in.hasNextInt()) {
                players = in.nextInt();
                if (carts * players <= n) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("End of the game");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Many players");
                    }
                }
            } else {
                System.out.println("You didn't enter a number, or your number is too large");
            }
        }

        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i)); // случайная карта в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * carts; i++) {
            System.out.println(deck[i]);
            if (i % carts == carts - 1)
                System.out.println();
        }
    }
}
