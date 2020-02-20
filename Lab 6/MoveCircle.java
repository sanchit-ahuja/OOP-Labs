class MoveCircle implements Movable {
    private MovePoint center;
    private int radius;
    public MoveCircle(int x,int y,int xspeed,int yspeed,int radius) {
        this.center = new MovePoint(x,y,xspeed,yspeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Point is: " + center.x +  "," + center.y + " and speed are: " + center.xspeed + "," + center.yspeed ;
    }
    @Override
    public void moveUp() {
        center.y-=center.yspeed;
    }
    @Override
    public void moveDown() {
        center.y+=center.yspeed;
    }
    @Override
    public void moveLeft() {
        center.x-=center.xspeed;
    }
    @Override
    public void moveRight() {
        center.x+=center.xspeed;
    }
    public static void main(String[] args) {
        Movable m1 = new MovePoint(5, 6, 10,20); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MoveCircle(2,4,5,6,5); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}