package app.kvc.model;

/**
 * Created by bigm on 28/6/2560.
 */

public class CategoryModel {

    private String category;
    private Integer num1;
    private Integer num2;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public CategoryModel(String category, Integer num1, Integer num2) {
        this.category = category;
        this.num1 = num1;
        this.num2 = num2;

    }
}