package br.com.doghero.dhproject.activities.myHeroes;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import br.com.doghero.dhproject.R;
import br.com.doghero.dhproject.activities.myHeroes.adapter.HeroAdapter;
import br.com.doghero.dhproject.api.ApiAnswer;
import br.com.doghero.dhproject.api.model.Hero;
import br.com.doghero.dhproject.api.model.MyHeroes;

public class MyHeroesActivity extends Activity {

    private MyHeroes myHeroes;

    private ArrayAdapter<Hero> favoritesAdapter;

    private ArrayAdapter<Hero> recentsAdapter;

    private ListView listViewFavorites;

    private ListView listViewRecents;

    @Override
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_heroes);
        init(bundle);
    }

    private void init(Bundle bundle) {
        myHeroes = ApiAnswer.getMyHeroesToObject();

        if (myHeroes != null){
            if (!myHeroes.getFavorites().isEmpty()){
                loadAdapterFavorites();
            }
            if  (!myHeroes.getRecents().isEmpty()){
                loadAdapterRecents();
            }
        }
    }

    private void loadAdapterRecents() {
        listViewRecents = (ListView) findViewById(R.id.listView_recents);
        recentsAdapter = new HeroAdapter(this, R.layout.component_hero, myHeroes.getRecents());
        listViewRecents.setAdapter(recentsAdapter);
    }

    private void loadAdapterFavorites() {
        listViewFavorites = (ListView) findViewById(R.id.listView_favorites);
        favoritesAdapter = new HeroAdapter(this, R.layout.component_hero, myHeroes.getFavorites());
        listViewFavorites.setAdapter(favoritesAdapter);

    }
}
