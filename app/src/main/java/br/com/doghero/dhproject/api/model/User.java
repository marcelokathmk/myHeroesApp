package br.com.doghero.dhproject.api.model;

import java.io.Serializable;

public class User implements Serializable {

    private String first_name;

    private String image_url;

    public User(){

    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String imageUrl) {
        this.image_url = imageUrl;
    }
}

