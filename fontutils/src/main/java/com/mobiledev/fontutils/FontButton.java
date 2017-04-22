package com.mobiledev.fontutils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Manu on 4/22/2017.
 */

public class FontButton extends Button {
    public FontButton(Context context) {
        super(context);
        init(context,null);
    }

    public FontButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public FontButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    private void init(Context context ,AttributeSet attrs) {
        if (attrs!=null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.FontTextView);
            String fontName = a.getString(R.styleable.FontTextView_fontName);
            if (fontName!=null) {
                Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/"+fontName);
                setTypeface(myTypeface);
                //setAllCaps(false);
            }
            a.recycle();
        }
    }
}
