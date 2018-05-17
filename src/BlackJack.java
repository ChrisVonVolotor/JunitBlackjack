public class BlackJack {
    public static void main(String[] args) {
        Game blackjack = new Game();
        System.out.println(blackjack.resolve(18,21));
        System.out.println(blackjack.resolve(22,22));
        System.out.println(blackjack.resolve(19,20));
        System.out.println(blackjack.resolve(17,17));

    }


}
