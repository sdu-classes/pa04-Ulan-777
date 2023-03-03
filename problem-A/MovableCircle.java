public class MovableCircle extends MovablePoint{
    public int radius;
    public MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return toString() + ",radius = " + radius;
    }
    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    @Override
    public void moveLeft(){
        x-= xSpeed;
    }
    @Override
    public void moveRight(){
        x+= xSpeed;
    }

}
