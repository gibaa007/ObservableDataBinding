package com.g7.sample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by newagesmb on 23/1/18.
 */

public class Pojo extends BaseObservable {
    String text = "";

    public Pojo(String text) {
        this.text = text;
    }


    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }
}
