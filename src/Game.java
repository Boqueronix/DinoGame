public class Game {
    public static int gameRunning = 0;
    public static int frequency = 1000;
    public static void main(String[] args) throws InterruptedException {
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(512, 512 / 3);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1/3.0);
        Dino dino = new Dino();
        Landscape.init(dino);
        while (gameRunning >= 0){
            gameRunning++ ;
            Thread.sleep(5);
            Landscape.draw();
            if (gameRunning % frequency == 5){
                Landscape.contents.add(new Obstacle(1, 0.01 + Math.random() * (1/3.0 - 0.01), 0.01 + Math.random() * 0.025, 0.01 + Math.random() * 0.025));
            }
        }
    }
}