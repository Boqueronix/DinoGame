public class Dino extends Entity{
    public double[] coordinates;
    public Dino(){
        coordinates = new double[]{0.2, 0.3/3};
    }
    @Override
    public void draw(){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.picture(coordinates[0], coordinates[1], "fish.jpg",0.03, 0.025);
    }
    @Override
    public void move(){
        if (StdDraw.isKeyPressed(32)){
            coordinates[1] += 0.002;
        } else {
            coordinates[1] -= 0.00075;
        }
        if (coordinates[1] < 0.01 - 0.025 || coordinates[1] > 0.323333 + 0.025){
            Game.gameRunning = -1;
        }
    }
}
