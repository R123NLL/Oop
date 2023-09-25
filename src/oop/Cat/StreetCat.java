package oop.Cat;

public class StreetCat extends Cat {
    protected int numOfFights;
    protected StreetCat(String name, int whiskersLength, String color,int numOfFights) {
        super(name, whiskersLength, color);
        this.numOfFights=numOfFights;
    }

    public int getNumOfFights() {
        return numOfFights;
    }

    public void setNumOfFights(int numOfFights) {
        this.numOfFights = numOfFights;
    }

    public String toString(){
        return super.toString()+" \tNumber of fights is: "+numOfFights;
    }
}
