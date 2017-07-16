package app.kvc.model;

/**
 * Created by field on 16/7/2560.
 */

public class CategoryModel {

    private String Tvcategory;
    private Integer NumAll;
    private Integer NumBroken;
    private Integer NumImage;

    public CategoryModel(String Tvcategory, Integer NumAll, Integer NumBroken, Integer NumImage) {
        this.Tvcategory = Tvcategory;
        this.NumAll = NumAll;
        this.NumBroken = NumBroken;
        this.NumImage = NumImage;
    }
    public String getTvCategory() {return Tvcategory;}

    public void setTvcategory(String Tvcategory) {this.Tvcategory = Tvcategory;}

    public Integer getNumAll() {return NumAll;}

    public void setNumAll(Integer numAll) {this.NumAll = NumAll;}

    public Integer getNumBroken() {return NumBroken;}

    public void setNumBroken(Integer NumBroken) {this.NumBroken = NumBroken;}

    public Integer getNumImage() {
        return NumImage;
    }

    public void setNumImage(Integer NumImage) {
        this.NumImage = NumImage;
    }
}