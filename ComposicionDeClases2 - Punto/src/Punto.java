public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(){

        double dist = x -y;

        if (dist > 0){
            return x - y;

        }else{
            return -(x - y);
        }

    }

    @Override
    public String toString() {
        return "Point -> (" + x + ", " + y + ")" + "\n" +
                "Distance between X and Y -> " + distance();
    }
}
