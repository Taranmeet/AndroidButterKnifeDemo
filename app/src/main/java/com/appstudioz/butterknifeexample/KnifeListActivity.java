package com.appstudioz.butterknifeexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by taranmeet on 27/10/15.
 *
 */
public class KnifeListActivity extends AppCompatActivity {

    @Bind(R.id.lv_knives)
    ListView mKnivesListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_knife);
        ButterKnife.bind(this);

        KnifeListAdapter adapter = new KnifeListAdapter(this);
        mKnivesListView.setAdapter(adapter);
    }
}
