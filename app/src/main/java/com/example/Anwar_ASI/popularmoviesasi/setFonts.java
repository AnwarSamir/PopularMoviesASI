package com.example.Anwar_ASI.popularmoviesasi;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;

public  class setFonts {

    String fontName ;
    Button button;
    private Context activity;

    public setFonts(Context context, Button button)
    {
        context=activity;
        this.button=button;
        Typeface f= Typeface.createFromAsset(context.getAssets(), fontName);
        button.setTypeface(f);
    }


}
