package Ex8;

public class Position {
    private int x;
    private int y;

    // Constructor per defecte
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor amb paràmetres
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters i setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Mètodes per incrementar i decrementar les coordenades
    public void incX() {
        this.x++;
    }

    public void incY() {
        this.y++;
    }

    public void decX() {
        this.x--;
    }

    public void decY() {
        this.y--;
    }

    // Mètode per establir els valors de les dues coordenades
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Mètode per obtenir una representació de la posició
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
