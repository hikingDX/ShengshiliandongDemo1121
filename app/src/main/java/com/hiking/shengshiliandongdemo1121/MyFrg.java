package com.hiking.shengshiliandongdemo1121;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Administrator on 2016/11/21.
 */
public class MyFrg extends Fragment{
    private int mColor;

    public MyFrg(){}
    public MyFrg(int i){
        mColor = i;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfrg,container,false);
        view.setBackgroundColor(mColor);
        return view;
    }
}
