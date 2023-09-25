package oop.Cat;

public class SiamiCat extends Cat{
    protected String favoriteFood;
    protected SiamiCat(String name, int whiskersLength, String color, String favoriteFood) {
        super(name, whiskersLength, color);
        this.favoriteFood=favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String toString(){
        return super.toString()+" \tFavorite food is: "+favoriteFood;
    }
}
