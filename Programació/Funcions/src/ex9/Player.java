package ex9;

public class Player {
    private Position position;
    private String name;


    public Player(Position position, String name) {
        this.position = position;
        this.name = name;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Position getPosition() {
        return position;
    }



    public String toString() {
        return "Player: " + name + ", Position: " + position.toString();
    }
}
