package com.appstudioz.butterknifeexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

/**
 * This class shows how to use butter knife in an Activity. This class show use of different click
 * events using butter knife base annotations. It also has a fragment to showcase the use of butter
 * knife there. It also invokes another activity on a button click that shows use of butter knife
 * with a List View and adapter.
 *
 */
public class KnifeActivity extends AppCompatActivity {

    // Views bound using butter knife.
    @Bind(R.id.btn_next)
    Button mHelloButton;
    @Bind(R.id.btn_fragment)
    Button mFragmentButton;
    @Bind(R.id.fl_frame)
    FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knife);
        // Method call initiates the views with @Bind annotation. Also other annotations such as
        // those related to events (@OnClick) are linked by this method.
        ButterKnife.bind(this);

    }

    /**
     * Method demonstrating the use of Long Click event using butter knife.
     *
     * @param view View on which long click was detected.
     * @return true when this method is handling long click false otherwise.
     */
    @OnLongClick(R.id.btn_next)
    public boolean longClickHello(View view) {
        Toast.makeText(KnifeActivity.this, "Long Hello", Toast.LENGTH_SHORT).show();
        return true;
    }

    /**
     * Method used to demonstrate use of on click event using butter knife library. Here we move
     * the user to next screen showing use of butter knife with a list view and adapter.
     *
     * @param view View on which on click was detected.
     */
    @OnClick(R.id.btn_next)
    public void clickList(View view) {
        Intent intent = new Intent("com.appstudioz.butterknife.KnifeListActivity");
        startActivity(intent);
    }

    /**
     * Method used to demonstrate use of on click annotation without using View parameter. Here we
     * add a fragment to current activity showing use of butter knife with a fragment.
     */
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
