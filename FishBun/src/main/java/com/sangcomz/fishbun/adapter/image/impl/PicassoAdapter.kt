package com.sangcomz.fishbun.adapter.image.impl;

import com.sangcomz.fishbun.adapter.image.ImageAdapter;
import com.sangcomz.fishbun.adapter.image.ImageAdapterData
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator

/**
 * Created by sangcomz on 23/07/2017.
 */

class PicassoAdapter : ImageAdapter {
    override fun loadImage(data: ImageAdapterData) {
        createAdapter(data).centerCrop().into(data.view)
    }

    override fun loadDetailImage(data: ImageAdapterData) {
        createAdapter(data).centerInside().into(data.view)
    }

    private fun createAdapter(data: ImageAdapterData) : RequestCreator {
        return Picasso
                .get()
                .load(data.uri)
                .fit()
                .rotate(data.orientation.toFloat())
    }
}
