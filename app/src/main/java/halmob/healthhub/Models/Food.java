package halmob.healthhub.Models;

/**
 * Created by hakan on 11.11.2017.
 */

public class Food {
    String foodName;
    String protein;
    String carbohydrate;
    String fat;
    String calorie;

    public String getFoodName() { return foodName;}
    public void setFoodName(String newFoodName) {
        this.foodName = newFoodName;
    }

    public String getProtein() { return protein;}
    public void setProtein(String newProtein) {
        this.protein = newProtein;
    }

    public String getCarbohydrate() {
        return carbohydrate;
    }
    public void setCarbohydrate(String newCarbohydrate) {
        this.carbohydrate = newCarbohydrate;
    }

    public String getFat() {
        return fat;
    }
    public void setFat(String newFat) {
        this.fat = newFat;
    }

    public String getCalorie() {
        return calorie;
    }
    public void setCalorie(String newCalorie) {
        this.calorie = newCalorie;
    }

}
