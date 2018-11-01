package br.com.doghero.dhproject.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyHeroes implements Serializable {

    private List<Hero> recents;

    private List<Hero> favorites;

    public MyHeroes(){
        this.recents = new ArrayList<Hero>();
        this.favorites = new ArrayList<Hero>();
    }

    public List<Hero> getRecents() {
        return recents;
    }

    public void setRecents(List<Hero> recents) {
        this.recents = recents;
    }

    public List<Hero> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Hero> favorites) {
        this.favorites = favorites;
    }

}
