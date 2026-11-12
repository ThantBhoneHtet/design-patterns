package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        GameItem gameItem1 = new GameItem("Sword", 100, 50);
        GameItem gameItem2 = (GameItem) gameItem1.reproduce();
        gameItem2.updatePostiion(200, 100);
        System.out.println("GameItem1: " + gameItem1.state + " at (" + gameItem1.x + ", " + gameItem1.y + ")");
        System.out.println("GameItem2: " + gameItem2.state + " at (" + gameItem2.x + ", " + gameItem2.y + ")");
    }
}
