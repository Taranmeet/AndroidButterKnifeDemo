package com.taranmeet.butterknifeexample;

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
 * This Class represents a fragment which is used to showcase the use of butter knife library.
 */
public class KnifeFragment extends Fragment {


    // View bounded by butter knife.
    @Bind(R.id.tv_fragment)
    TextView mFragTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View masterView = inflater.inflate(R.layout.fragment_knive, container, false);
        // Method called to initiate the views bound by butter knife. Always call this before you
        // start using the bounded views.
        ButterKnife.bind(this, masterView);
        // Change text of Text View bound by butter knife.
        mFragTextView.setText(R.string.text_new);

        return masterView;
    }

    /**
     * It is important to note that we must unbind the views in case a fragment is destroyed.
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
