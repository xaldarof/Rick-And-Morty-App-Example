package com.example.daggerhilt.utils

import android.view.View
import android.view.animation.AnimationUtils


private var lasPosition = -1

fun View.animateRvView(duration: Long, position: Int) {
    if (position > lasPosition) {
        val anim = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left)
        anim.duration = duration
        startAnimation(anim)
        lasPosition = position
    }
}
