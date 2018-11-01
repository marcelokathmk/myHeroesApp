package br.com.doghero.dhproject.activities.myHeroes.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import br.com.doghero.dhproject.R;
import br.com.doghero.dhproject.activities.myHeroes.components.LikeComponent;
import br.com.doghero.dhproject.api.model.Hero;
import br.com.doghero.dhproject.images.ImageHelper;

public class HeroAdapter extends ArrayAdapter<Hero> {

    private int resource;

    private Context context;

    public HeroAdapter(@NonNull Context context, int resource, @NonNull List<Hero> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(resource, null);
        }

        Hero hero = getItem(position);

        if (hero != null){
            TextView hostName = (TextView) view.findViewById(R.id.text_view_host_name);
            TextView hostNeighborhood = (TextView) view.findViewById(R.id.text_view_host_neighborhood);
            LikeComponent likeComponent = (LikeComponent) view.findViewById(R.id.likeComponent_like);
            TextView price = (TextView) view.findViewById(R.id.text_view_price);

            hostName.setText(hero.getUser().getFirstName());
            hostNeighborhood.setText(hero.getAddresNeighborhood());
            likeComponent.setLike(false);
            price.setText(hero.getPrice());

            loadHostImage(view, hero);
        }

        return view;
    }

    private void loadHostImage(View view, Hero hero) {
        ImageView hostImg = (ImageView) view.findViewById(R.id.img_host);
        ImageHelper.loadImage(context, hero.getUser().getImageUrl(), hostImg);

        if (hero.isSuperhero()){
            ImageView superHeroImg = (ImageView) view.findViewById(R.id.img_superhero);
            ImageHelper.loadImage(context, R.drawable.host_list_icon_badge, superHeroImg);
        }
    }
}
