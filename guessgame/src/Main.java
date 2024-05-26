import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }

    static class GuessGame {
        void startGame() {
            Scanner scanner = new Scanner(System.in);

            int targetNumber = (int) (Math.random() * 10);
            System.out.println("Pensando em um número entre 0 e 9. Tente adivinhar!");

            while (true) {
                System.out.print("Digite seu palpite: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Parabéns! Você acertou!");
                    break;
                } else {
                    System.out.println("Errado. Tente novamente.");
                }
            }

            scanner.close();
        }
    }
}
