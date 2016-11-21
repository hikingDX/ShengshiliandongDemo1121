package com.hiking.shengshiliandongdemo1121;

import android.app.FragmentManager;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.media.MediaBrowserCompatUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private FragAdapter mFragAdapter;
    private Button mButton;
    private android.support.v4.app.FragmentManager fm;

    private ViewPagerIndicator mIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
        initViewPager();
        mButton = (Button) findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //                mFragAdapter.destroyItem(mFragAdapter.getCount()-1);
                int position = mViewPager.getCurrentItem();
                mFragAdapter.mFragments.remove(position);
                mFragAdapter.notifyDataSetChanged();

            }

        });
    }


    private void initViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.vp);
        mViewPager.setAdapter(mFragAdapter);
        mIndicator = (ViewPagerIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mViewPager,0);
    }

    private void initFragment() {
        List<Fragment> fragments = new ArrayList<>();
        MyFrg myFrg1 = new MyFrg(Color.GREEN);
        MyFrg myFrg2 = new MyFrg(Color.RED);
        MyFrg myFrg3 = new MyFrg(Color.YELLOW);
        fragments.add(myFrg1);
        fragments.add(myFrg2);
        fragments.add(myFrg3);
        fm = getSupportFragmentManager();
        mFragAdapter = new FragAdapter(fm, fragments);
    }

}
