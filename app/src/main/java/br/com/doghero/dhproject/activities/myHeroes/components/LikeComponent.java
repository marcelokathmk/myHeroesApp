package br.com.doghero.dhproject.activities.myHeroes.components;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.com.doghero.dhproject.R;

public class LikeComponent extends LinearLayout {

    private ImageView imagemLike;
    private Boolean like;

    public LikeComponent(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context, R.layout.component_like, this);
        initComponents(context, attrs);
    }

    private void initComponents(Context context, AttributeSet attrs) {
        this.imagemLike = (ImageView) findViewById(R.id.imageButton_like_my_hero);
        this.imagemLike.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                actionClickLikeIcon(view);
            }
        });
    }

    private void actionClickLikeIcon(View view) {
        this.setLike(isLike() ? false : true);
    }

    public Boolean isLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
        this.imagemLike.setBackgroundResource(
                isLike() ? R.drawable.icon_like_filled_vector_red : R.drawable.icon_like_border_vector_gray_battleship);
    }
}
