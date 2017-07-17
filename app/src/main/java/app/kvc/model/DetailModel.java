/**
 * Created by Filver L Believe on 17/7/2560.
 */

package app.kvc.model;

import android.content.Intent;

public class DetailModel {

    private String textcode;
    private String textId;
    private String textname;
    private String texttype;
    private String textcolor;
    private String textstatus;
    private String textbroken;
    private String textdate;
    private String textuser;
    private Integer imageviwe;
    private Integer imagestatus;

    public DetailModel(String textcode, String textId, String textname, String texttype, String textcolor, String textstatus, String textbroken, String textdate, String textuser,Integer imageviwe, Integer imagestatus) {
//    public DetailModel(String textcode, String textId, String textname, String texttype, String textcolor, String textstatus, String textbroken, String textdate, String textuser,Integer imageviwe, Integer imagestatus) {
        this.textcode = textcode ;
        this.textId = textId ;
        this.textname = textname ;
        this.texttype = texttype ;
        this.textcolor = textcolor ;
        this.textdate = textdate ;
        this.textstatus = textstatus ;
        this.textbroken = textbroken ;
        this.textuser = textuser ;
        this.imageviwe = imageviwe ;
        this.imagestatus = imagestatus ;
    }
    public String getTextcode() {return textcode;}

    public void setTextcode(String textcode) {this.textcode = textcode;}

    public String getTextId() {return textId;}

    public void setTextId(String textId) {this.textId = textId;}

    public String getTexttype() {return texttype;}

    public void setTexttype(String texttype) {this.texttype = texttype;}

    public String getTextname() {return textname;}

    public void setTextname(String textname) {this.textname = textname;}

    public String getTextcolor() {return textcolor;}

    public void setTextcolor(String textcolor) {this.textcolor = textcolor;}

    public String getTextstatus() {return textstatus;}

    public void setTextstatusr(String textstatus) {this.textstatus = textstatus;}

    public String getTextbroken() {return textbroken;}

    public void setTextbroken(String textbroken) {this.textbroken = textbroken;}

    public String getTextdate() {return textdate;}

    public void setTextdate(String textdate) {this.textdate = textdate;}

    public String getTextuser() {return textuser;}

    public void setTextuser (String textuser) {this.textuser = textuser;}

    public Integer getImageviwe() {return imageviwe;}

    public void setImageviwe(Integer imageviwe) {this.imageviwe = imageviwe;}

    public Integer getImagestatus() {return imagestatus;}

    public void setImagestatus(Integer imagestatus) {this.imagestatus = imagestatus;}
}