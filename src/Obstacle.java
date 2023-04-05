public class Obstacle extends Entity{
    private double[] coordinates;
    private double width;
    private double height;
    private static double speedMod = 1;
    public Obstacle(double x, double y, double w, double h){
        coordinates = new double[]{1, Math.random() * 0.3};
        width = w;
        height = h;
    }
    public void move(){
        coordinates[0] -= 0.001 * speedMod * Math.pow(Game.gameRunning,0.5) / 50;
        if (coordinates[0] + width / 2 < 0){
            Landscape.contents.remove(this);
        }
        if (StdDraw.isKeyPressed(72)){
            speedMod *= 1.05;
            Game.frequency *= 0.99995;
        }
        if (coordinates[0] - width/2 < Landscape.dino.coordinates[0] + 0.03 && coordinates[0] + width/2 > Landscape.dino.coordinates[0] - 0.03){
            if (coordinates[1] - height/2 < Landscape.dino.coordinates[1] + 0.025 && coordinates[1] + height/2 > Landscape.dino.coordinates[1] - 0.025){
                Game.gameRunning = -1;
            }
        }
    }
    @Override
    public void draw(){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(coordinates[0], coordinates[1], width, height);
    }

}
