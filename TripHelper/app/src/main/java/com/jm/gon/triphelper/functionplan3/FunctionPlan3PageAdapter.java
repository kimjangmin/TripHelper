package com.jm.gon.triphelper.functionplan3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jm.gon.triphelper.DataModel;

/**
 * Created by 김장민 on 2017-02-21.
 */

public class FunctionPlan3PageAdapter extends FragmentStatePagerAdapter {
    private int tabCount;
    private DataModel dataModel;

    public FunctionPlan3PageAdapter(FragmentManager fm, int tabCount, DataModel dataModel) {
        super(fm);
        this.tabCount = tabCount;
        this.dataModel = dataModel;

    }

    //프래그먼트를 뷰페이저와 탭과 연결해주는 부분입니다.
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FunctionPlan3Fragment1 functionPlan3Fragment1 = new FunctionPlan3Fragment1();
                Bundle bundle1 = new Bundle();
                bundle1.putParcelable("model", dataModel);
                functionPlan3Fragment1.setArguments(bundle1);
                return functionPlan3Fragment1;
            case 1:
                FunctionPlan3Fragment2 functionPlan3Fragment2 = new FunctionPlan3Fragment2();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("model", dataModel);
                functionPlan3Fragment2.setArguments(bundle2);
                return functionPlan3Fragment2;
            case 2:
                FunctionPlan3Fragment3 functionPlan3Fragment3 = new FunctionPlan3Fragment3();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("model", dataModel);
                functionPlan3Fragment3.setArguments(bundle3);
                return functionPlan3Fragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}