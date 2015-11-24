package com.appstudioz.butterknifeexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;


public class KnifeActivity extends AppCompatActivity {

    @Bind(R.id.btn_hello)
    Button mHelloButton;
    @Bind(R.id.btn_fragment)
    Button mFragmentButton;
    @Bind(R.id.fl_frame)
    FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knife);
        ButterKnife.bind(this);

    }

    @OnLongClick(R.id.btn_hello)
    public boolean longClickHello() {
        Toast.makeText(KnifeActivity.this, "Long Hello", Toast.LENGTH_SHORT).show();
        return true;
    }

    @OnClick(R.id.btn_hello)
    public void clickHello() {
        Intent intent = new Intent("com.appstudioz.butterknife.KnifeListActivity");
        startActivity(intent);
    }

    @OnClick(R.id.btn_fragment)
    public void clickFragment() {
        Toast.makeText(KnifeActivity.this, "Fragment", Toast.LENGTH_SHORT).show();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl_frame, new KnifeFragment(), "TAG");
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
