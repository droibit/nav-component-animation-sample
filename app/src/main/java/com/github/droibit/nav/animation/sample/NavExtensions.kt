package com.github.droibit.nav.animation.sample

import androidx.navigation.NavOptions

fun NavOptions.Builder.setSlideAnimation(): NavOptions.Builder {
    return setEnterAnim(R.anim.slide_in_right)
        .setExitAnim(R.anim.slide_out_left)
        .setPopEnterAnim(R.anim.slide_in_left)
        .setPopExitAnim(R.anim.slide_out_right)
}