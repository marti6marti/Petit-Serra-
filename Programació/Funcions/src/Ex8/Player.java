package Ex8;

public class Player {
    private Position position; // Posició del jugador
    private String name; // Nom del jugador

    // Constructor que inicialitza la posició del jugador
    public Player(Position position, String name) {
        this.position = position;
        this.name = name;
    }

    // Mètodes per moure el jugador
    public void moveRight() {
        position.incX();
    }

    public void moveLeft() {
        position.decX();
    }

    public void jump() {
        position.incY();
    }

    public void fall() {
        position.decY();
    }

    // Getters i setters per al nom del jugador
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Mètode per obtenir la posició del jugador
    public Position getPosition() {
        return position;
    }

    // Mètode per obtenir una representació del jugador
    @Override
    public String toString() {
        return "Player: " + name + ", Position: " + position.toString();
    }
}
