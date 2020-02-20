public class MovePoint implements Movable {
    int x,y,xspeed,yspeed;
    public MovePoint(int x,int y,int xspeed,int yspeed){
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "Point is: " + x +  "," + y + " and speed are: " + xspeed + "," + yspeed ;
    }
    @Override
    public void moveUp() {
        y-=yspeed;
    }
    @Override
    public void moveDown() {
        y+=yspeed;
    }
    @Override
    public void moveLeft() {
        x-=xspeed;
    }
    @Override
    public void moveRight() {
        x+=xspeed;
    }
}

// class TestMovable {
//     public static void main(String[] args) {
//     Movable m1 = new MovePoint(5, 5); // upcast
//     System.out.println(m1);
//     m1.moveDown();
//     System.out.println(m1);
//     m1.moveRight();
//     System.out.println(m1);
//     }
//     }