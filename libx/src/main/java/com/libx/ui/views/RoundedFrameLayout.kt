package com.libx.ui.views

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.core.view.ViewCompat
import com.libx.ui.R
import com.libx.ui.utils.RoundRectDrawable

class RoundedFrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val backgroundDrawable: RoundRectDrawable

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RoundedFrameLayout)
        val backgroundColor =
            typedArray.getColorStateList(R.styleable.RoundedFrameLayout_backgroundColor)
        val cornerSize = typedArray.getDimension(R.styleable.RoundedFrameLayout_cornerRadius, 0f)
        typedArray.recycle()

        clipToOutline = true
        backgroundDrawable = RoundRectDrawable(backgroundColor, cornerSize)
        ViewCompat.setBackground(this, backgroundDrawable)
    }

    override fun setBackgroundColor(color: Int) {
        backgroundDrawable.color = ColorStateList.valueOf(color)
    }
}