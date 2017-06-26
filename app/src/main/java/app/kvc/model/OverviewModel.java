package app.kvc.model;

/**
 * Created by bigm on 26/6/2560.
 */

public class OverviewModel {

    private String id;
    private String name;
    private Integer status;

    public OverviewModel(String id, String name, Integer status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
