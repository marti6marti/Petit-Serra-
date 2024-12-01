package Ex8;

public class Ex8Test {
        public static void main(String[] args) {
           
            Position initialPosition = new Position(5, 5);


            Player player = new Player(initialPosition, "Jugador1");


            System.out.println(player);


            player.moveRight();
            player.jump();
            System.out.println("Després de moure's a la dreta i saltar: " + player);


            player.moveLeft();
            player.fall();
            System.out.println("Després de moure's a l'esquerra i caure: " + player);


            player.setName("Jugador2");
            System.out.println("Nom del jugador canviat: " + player.getName());
        }
}
