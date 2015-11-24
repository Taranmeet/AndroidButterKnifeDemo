package com.appstudioz.butterknifeexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by taranmeet on 27/10/15.
 *
 */
public class KnifeFragment extends Fragment {

    private View mView;

    @Bind(R.id.tv_fragment)
    TextView mFragTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_knive, container, false);
        ButterKnife.bind(this, mView);

        mFragTextView.setText("Text Changed");

        return mView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
