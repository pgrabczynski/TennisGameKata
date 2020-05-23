package pl.patryk;

public class Point {

    Integer score = 0;

    public Point(int score){
        this.score = score;
    }
    public void addPoint(int score){
        this.score= score+15;

    }
    public int getPoint(){
       return score;
    }

}
