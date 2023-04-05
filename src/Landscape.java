import java.util.ArrayList;

public class Landscape {
    private static int score;
    public static ArrayList<Entity> contents = new ArrayList<>();
    public static Dino dino;
    public static void init(Dino d){
       dino = d;
    }
    public static void draw(){
        StdDraw.clear();
        dino.draw();
        dino.move();
        StdDraw.line(0,0.01, 1, 0.01);
        StdDraw.line(0,0.323333, 1, 0.32333);
        if (Game.gameRunning % 100 == 5){
            score = (int) (Math.pow(Game.gameRunning, 1.5) / 1000);
        }
        StdDraw.text(0.75, 0.25, "Score: " + score);
        if (contents.size() > 0) {
            for (int i = contents.size() - 1; i >= 0; i--) {
                contents.get(i).draw();
                contents.get(i).move();
            }
        }
        StdDraw.show();
    }
}
