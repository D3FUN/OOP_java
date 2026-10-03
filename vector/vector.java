public class Vector{

    private double x;
    private double y;
    private double z;

    
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector add(Vector other){
        return new Vector(
            this.x + other.x,
            this.y + other.y,
            this.z + other.z);
    }
    public Vector multiply(double number){
        return new Vector(
            x * number,
            y * number,
            z * number);
    }
    @Override 
    public String toString(){
        return "Vector(" + x + "," + y + "," + z + ")";
    }
}