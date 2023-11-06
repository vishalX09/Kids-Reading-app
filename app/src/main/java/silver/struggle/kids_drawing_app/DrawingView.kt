package silver.struggle.kids_drawing_app

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi
import java.nio.file.Path

class DrawingView(context: Context , attrs: AttributeSet): View(context , attrs) {
    @RequiresApi(Build.VERSION_CODES.O)
    internal abstract inner class CustomPath(var color:Int, var brushthickness :Float): Path {

    }
    private var mydrawpath: CustomPath? =null
    private var mycanvasBitmao :Bitmap? = null
    private var myDrwpaint : Paint? = null
    private var mycanvaspaint : Paint? = null
    private var myBrushsize :Float = 0.toFloat()
    private var color:Int = Color.BLACK



}