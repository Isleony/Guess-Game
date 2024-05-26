public class Main {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }

    static class GuessGame {

        class Player {
            int number;

            void guess() {
                number = (int) (Math.random() * 10);
                System.out.println("O jogador deu seu palpite: " + number);
            }
        }

        void startGame() {
            Player p1 = new Player();
            Player p2 = new Player();
            Player p3 = new Player();

            int targetNumber = (int) (Math.random() * 10);
            System.out.println("Pensando em um número entre 0 e 9");

            while (true) {
                System.out.println("O número a adivinhar é: " + targetNumber);
                p1.guess();
                p2.guess();
                p3.guess();

                int guessp1 = p1.number;
                int guessp2 = p2.number;
                int guessp3 = p3.number;

                if (guessp1 == targetNumber || guessp2 == targetNumber || guessp3 == targetNumber) {
                    System.out.println("Pelo menos um jogador acertou!");
                    if (guessp1 == targetNumber) {
                        System.out.println("Jogador 1 acertou!");
                    }
                    if (guessp2 == targetNumber) {
                        System.out.println("Jogador 2 acertou!");
                    }
                    if (guessp3 == targetNumber) {
                        System.out.println("Jogador 3 acertou!");
                    }
                    break;
                } else {
                    System.out.println("Nenhum jogador acertou, continuando o jogo...");
                }
            }
        }
    }
}
