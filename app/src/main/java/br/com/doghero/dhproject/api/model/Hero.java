package br.com.doghero.dhproject.api.model;

import java.io.Serializable;

public class Hero implements Serializable {

    private Boolean is_superhero;

    private User user;

    private String address_neighborhood;

    private String price;

    public Hero(){
    }

    public Boolean isSuperhero() {
        return is_superhero;
    }

    public void setSuperhero(Boolean superhero) {
        this.is_superhero = superhero;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddresNeighborhood() {
        return address_neighborhood;
    }

    public void setAddresNeighborhood(String addresNeighborhood) {
        this.address_neighborhood = addresNeighborhood;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
