package com.mbr.hourcounter;

import android.app.TimePickerDialog;
import android.content.Context;
import android.webkit.WebView;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by fnzl2784 on 29/09/13.
 */
public class JsWrapper {

    Context mContext;
    WebView wv;

    public JsWrapper(Context mainContext, WebView wv){
        this.mContext = mainContext;
        this.wv = wv;

    }

    public void openTimePickerDialog(String timeId){
        final String theId = timeId;
        Calendar c = Calendar.getInstance();
        TimePickerDialog tpDialog = new TimePickerDialog(this.mContext, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i2) {
                wv.loadUrl("javascript:onTimeChanged('"+theId+"','"+i+":"+i2+"')");

            }
        },c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),true);
        tpDialog.show();
    }
}
