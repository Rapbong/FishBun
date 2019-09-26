package com.sangcomz.fishbun.adapter.image;

import android.net.Uri;
import android.widget.ImageView;

/**
 * Created by sangcomz on 23/07/2017.
 */

interface ImageAdapter {
    fun loadImage(data: ImageAdapterData)
    fun loadDetailImage(data: ImageAdapterData)
}

data class ImageAdapterData(val view: ImageView, val uri: Uri, val orientation: Int)
