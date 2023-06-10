package com.example.teachmeskillsandroidkotlin.presentation.custom

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

internal class TestCustomView(context: Context, attributes: AttributeSet) :
    View(context, attributes) {

    private var faceColor = Color.YELLOW
    private var mouthColor = Color.BLACK
    private var borderColor = Color.BLACK
    private var rightEyeColor = Color.BLACK
    private var leftEyeColor = Color.BLACK

    companion object {
        private var paint = Paint(Paint.ANTI_ALIAS_FLAG)
        private val styleFill = Paint.Style.FILL
        private var borderWidth = 4.0f
        private var size = 320
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        size = measuredWidth.coerceAtMost(measuredHeight)
        setMeasuredDimension(size, size)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        drawFaceBackground(canvas)
        drawMouth(canvas)
        drawRightEye(canvas)
        drawLeftEye(canvas)
    }

    private fun drawFaceBackground(canvas: Canvas) {
        paint.apply {
            color = faceColor
            style = Paint.Style.FILL
        }
        val radius = size / 2f

        canvas.drawCircle(size / 2f, size / 2f, radius, paint)

        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawCircle(size / 2f, size / 2f, radius - borderWidth / 2f, paint)
    }

    private fun drawRightEye(canvas: Canvas) {
        paint.apply {
            color = rightEyeColor
            style = styleFill
        }
        val rightEyeRect = RectF(
            size * 0.57f,
            size * 0.23f,
            size * 0.68f,
            size * 0.50f
        )
        canvas.drawOval(rightEyeRect, paint)
    }

    private fun drawLeftEye(canvas: Canvas) {
        paint.apply {
            color = leftEyeColor
            style = styleFill
        }
        val leftEyeRect = RectF(
            size * 0.32f,
            size * 0.23f,
            size * 0.43f,
            size * 0.50f
        )
        canvas.drawOval(leftEyeRect, paint)
    }

    private fun drawMouth(canvas: Canvas) {
        val mouthPath = Path()
        mouthPath.moveTo(size * 0.22f, size * 0.7f)
        mouthPath.quadTo(size * 0.50f, size * 0.80f, size * 0.78f, size * 0.70f)
        mouthPath.quadTo(size * 0.50f, size * 0.90f, size * 0.22f, size * 0.70f)
        paint.apply {
            paint.color = mouthColor
            paint.style = Paint.Style.FILL
        }
        canvas.drawPath(mouthPath, paint)
    }
}