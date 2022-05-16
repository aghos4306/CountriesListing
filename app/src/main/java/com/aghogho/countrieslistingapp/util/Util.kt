package com.aghogho.countrieslistingapp.util

import android.content.Context
//import android.support.v4.widget.CircularProgressDrawable
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.aghogho.countrieslistingapp.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

//fun getProgressDrawable(context: Context): CircularProgressDrawable {
//    return CircularProgressDrawable(context).apply {
//        strokeWidth = 10f
//        centerRadius = 50f
//        start()
//    }
//}

//fun ImageView.loadImage(url: String?, progressDrawable: CircularProgressDrawable) {
//    val options = RequestOptions()
//        .placeholder(progressDrawable)
//        .error(R.mipmap.ic_launcher_round)
//    Glide.with(this.context)
//        .setDefaultRequestOptions(options)
//        .load(url)
//        .into(this)
//}

fun getProgressDrawable(context: Context): ProgressBar {
    return ProgressBar(context).apply {

    }
}

fun ImageView.loadImage(url: String?, progressBar: ProgressBar) {
    val options = RequestOptions()
        //.placeholder(progressBar)
        .error(R.mipmap.ic_launcher_round)
    Glide.with(this.context)
        .setDefaultRequestOptions(options)
        .load(url)
        .into(this)
}