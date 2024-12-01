package Ex8;

public class Ex8Test {
        public static void main(String[] args) {
            // Creem una nova posició inicial
            Position initialPosition = new Position(5, 5);

            // Creem un jugador amb la posició inicial
            Player player = new Player(initialPosition, "Jugador1");

            // Mostrem la informació del jugador
            System.out.println(player);

            // Movem el jugador
            player.moveRight();
            player.jump();
            System.out.println("Després de moure's a la dreta i saltar: " + player);

            // Movem el jugador a l'esquerra i caure
            player.moveLeft();
            player.fall();
            System.out.println("Després de moure's a l'esquerra i caure: " + player);

            // Canviem el nom del jugador
            player.setName("Jugador2");
            System.out.println("Nom del jugador canviat: " + player.getName());
        }
}
