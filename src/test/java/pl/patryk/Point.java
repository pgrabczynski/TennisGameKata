package pl.patryk;

public class Point {
    Integer score;
    public Point(int score){
        this.score = score;
    }
    public void addPoint(){
        score+=15;

    }
    public int getPoint(){
       return score;
    }

}
