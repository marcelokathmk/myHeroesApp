package br.com.doghero.dhproject.images;

import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;

public class ImageHelper {

    public static void loadImage(Context context, String imageUrl, ImageView imageView) {
        Picasso.with(context)
                .load(imageUrl)
                .transform(new CropCircleTransformation())
                .into(imageView);
    }

    public static void loadImage(Context context, int resourceId, ImageView imageView){
        Picasso.with(context)
                .load(resourceId)
                .into(imageView);
    }
}
