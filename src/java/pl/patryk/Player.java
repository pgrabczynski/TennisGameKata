package pl.patryk;

public class Player {
    private String name;
    private Integer score;
    public Player(String name, Integer score) {
        this.name = name;
        this.score = score;

    }
    public void addPoint(int score){
        this.score+=15;

    }



    public String getPoint() {
       String point = Integer.toString(score);
        return point;
    }


}
