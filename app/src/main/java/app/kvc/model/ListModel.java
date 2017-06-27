package app.kvc.model;

import java.lang.ref.SoftReference;

/**
 * Created by bigm on 26/6/2560.
 */

public class ListModel {

    private int area;
    private String room;
    private String num1;
    private String num2;

    public ListModel(int area, String room, String num1, String num2) {
        this.area = area;
        this.room = room;
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getArea() { return area; }

    public void setArea(int area) { this.area = area; }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {this.room = room;}

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() { return num2; }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
}
