package pl.patryk;

public class Player {
    private String name;
    private Point point;

    public Player(String name, Point point){
        this.name = name;
        this.point = point;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPoint(){
        return new Point(0).toString();
    }
    public void setPoint(Point point){
        this.point = point;
    }

    public void addPoint(){
    point.addPoint(1);
    }


}
