package com.example.recycleview;

public class DataModel {


    private String name;
    private String version;

    private Integer image;

    private Integer id_;

    public DataModel(String name, String version, Integer image, Integer id_) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image=image;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Integer getId_() {
        return id_;
    }

    public Integer getImage() {
        return image;
    }
}
