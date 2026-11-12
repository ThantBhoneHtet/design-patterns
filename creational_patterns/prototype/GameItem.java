package prototype;

public class GameItem implements Prototype {
    String state;
    int x, y;

    GameItem(String state, int x, int y) {
        this.state = state;
        this.x = x;
        this.y = y;
    }

    void updatePostiion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override 
    public Prototype reproduce() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
