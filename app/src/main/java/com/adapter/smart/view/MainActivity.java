package com.adapter.smart.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import com.adapter.smart.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.id_no_obj)
    Button mIdNoObj;
    @BindView(R.id.id_one_obj)
    Button mIdOneObj;
    @BindView(R.id.id_mutil_obj)
    Button mIdMutilObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.id_no_obj)
    public void onMIdNoObjClicked() {
        startActivity(new Intent(this,NoObjActivity.class));
    }

    @OnClick(R.id.id_one_obj)
    public void onMIdOneObjClicked() {
        startActivity(new Intent(this,OneObjActivity.class));
    }

    @OnClick(R.id.id_mutil_obj)
    public void onMIdMutilObjClicked() {
        startActivity(new Intent(this,MutilObjActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("xxx", "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("xxx", "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("xxx", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("xxx", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("xxx", "onStop: ");
    }

}
