package app.kvc.model;

/**
 * Created by bigm on 27/6/2560.
 */

public class RoomModel {

    private String roomNo;
    private Integer numAll;
    private Integer numBroken;
    private Integer numImage;


    public RoomModel(String roomNo, Integer numAll, Integer numBroken, Integer numImage) {
        this.roomNo = roomNo;
        this.numAll = numAll;
        this.numBroken = numBroken;
        this.numImage = numImage;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Integer getNumAll() {
        return numAll;
    }

    public void setNumAll(Integer numAll) {
        this.numAll = numAll;
    }

    public Integer getNumBroken() {
        return numBroken;
    }

    public void setNumBroken(Integer numBroken) {
        this.numBroken = numBroken;
    }

    public Integer getNumImage() {
        return numImage;
    }

    public void setNumImage(Integer numImage) {
        this.numImage = numImage;
    }
}
