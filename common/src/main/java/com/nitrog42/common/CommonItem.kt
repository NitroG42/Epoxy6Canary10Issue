package com.nitrog42.common

import android.widget.LinearLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass(layout = R2.layout.item)
abstract class CommonItem : EpoxyModelWithHolder<CommonHolder>() {
    @EpoxyAttribute
    var title: Int = 0

    override fun bind(holder: CommonHolder) {

    }

//    override fun getDefaultLayout(): Int {
//        return R2.layout.item
//    }
}

class CommonHolder : KotlinEpoxyHolder() {
    val ll by bind<LinearLayout>(R.id.ll)
}