import java.util.*;
class MoveCircle implements Movable,Comparable<MoveCircle> {
    private MovePoint center;
    private int radius;
    public MoveCircle(int x,int y,int xspeed,int yspeed,int radius) {
        this.center = new MovePoint(x,y,xspeed,yspeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        System.out.println("Radius" + radius);
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
        MovePoint m_1 = new MovePoint(5, 6, 10,20); // upcast
        MovePoint m_2 = new MovePoint(7, 6, 20,30); // upcast
        MovePoint m_3 = new MovePoint(5, 6, 40,50); // upcast
        List<MovePoint> l2 = new ArrayList <MovePoint> ();
        l2.add(m_1);
        l2.add(m_2);
        l2.add(m_3);

        Collections.sort(l2,new sortbyxspeed());
        for(MovePoint x: l2) {
            System.out.println(x);
        }
        // System.out.println(m1);
        // m1.moveLeft();
        // System.out.println(m1);
        MoveCircle m2 = new MoveCircle(2,4,5,6,5); // upcast
        MoveCircle m3 = new MoveCircle(6, 7, 1, 2, 10);
        // System.out.println(m3.equals(m2));
        // System.out.println(m3);
        m2.moveRight();
        List<MoveCircle> li = new ArrayList<MoveCircle>();
        // li.add(m1);
        li.add(m2);
        li.add(m3);
        Collections.sort(li);
        // for(MoveCircle x:li){
        //     System.out.println(x);
        // }
        // for(  )
        // System.out.println(m2);
    }

    @Override
    public int compareTo(MoveCircle c) {
        if(c.radius == radius){
            return 0;
        }
        else if(c.radius>radius){
            return 1;
        }
        else {
            return -1;
        }
        // TODO Auto-generated method stub
        // return 0;
    }
}

class sortbyxspeed implements Comparator<MovePoint> {
    public int compare(MovePoint p1,MovePoint p2) {
        if(p1.xspeed == p2.xspeed) {
            return 0;
        }
        else if (p1.xspeed < p2.xspeed) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

class sortbyyspeed implements Comparator<MovePoint> {
    public int compare(MovePoint p1,MovePoint p2) {
        if(p1.yspeed == p2.yspeed) {
            return 0;
        }
        else if (p1.yspeed < p2.yspeed) {
            return -1;
        }
        else {
            return 1;
        }
    }
}