package com.example.mydraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Mydraw extends View {
    public Mydraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        canvas.drawLine(0,0, canvas.getWidth(), canvas.getHeight(), paint);
        canvas.drawLine(canvas.getWidth(), 0, 0, canvas.getHeight(), paint);
    }
}
