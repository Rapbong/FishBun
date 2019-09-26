package com.sangcomz.fishbun.adapter.image.impl;

import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.sangcomz.fishbun.adapter.image.ImageAdapter;
import com.sangcomz.fishbun.adapter.image.ImageAdapterData

/**
 * Created by sangcomz on 23/07/2017.
 */

class GlideAdapter : ImageAdapter {
    override fun loadImage(data: ImageAdapterData) {
        val options = RequestOptions().centerCrop()
        Glide
                .with(data.view.context)
                .load(data.uri)
                .apply(options)
                .into(data.view)
    }

    override fun loadDetailImage(data: ImageAdapterData) {
        val options = RequestOptions().centerInside()
        Glide
                .with(data.view.context)
                .load(data.uri)
                .apply(options)
                .into(data.view)
    }
}
