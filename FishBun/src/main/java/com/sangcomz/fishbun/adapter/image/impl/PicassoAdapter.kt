package com.sangcomz.fishbun.adapter.image.impl;

import android.net.Uri;
import android.widget.ImageView;

import com.sangcomz.fishbun.adapter.image.ImageAdapter;
import com.sangcomz.fishbun.adapter.image.ImageAdapterData
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator

/**
 * Created by sangcomz on 23/07/2017.
 */

class PicassoAdapter : ImageAdapter {
    override fun loadImage(data: ImageAdapterData) {
        var requestCreator = Picasso
                                    .get()
                                    .load(data.uri)
                                    .fit()
                                    .centerCrop()
        if (data.orientation != 0) {
            requestCreator = requestCreator.rotate((360 - data.orientation).toFloat())
        }
        requestCreator.into(data.view)
    }

    override fun loadDetailImage(data: ImageAdapterData) {
        var requestCreator = Picasso
                                .get()
                                .load(data.uri)
                                .fit()
                                .centerInside()
        if (data.orientation != 0) {
            requestCreator = requestCreator.rotate((360 - data.orientation).toFloat())
        }
        requestCreator.into(data.view)
    }

    private fun rotateAndDraw(requestCreator: RequestCreator, view: ImageView, orientation: Int) {

    }
}
