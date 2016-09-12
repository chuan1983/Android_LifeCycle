package org.iii.tw.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     public MainActivity(){
         Log.d("chuan", "MainActivity");
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("chuan", "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("chuan", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("chuan", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("chuan", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("chuan", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("chuan", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("chuan", "onDestroy");
    }

    public void gotopage2(View v){

    }
}
