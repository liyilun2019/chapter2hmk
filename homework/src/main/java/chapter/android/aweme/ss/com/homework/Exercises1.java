package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.logging.LogManager;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * onPause --> onStop --> onDestroy --> onStart --> onResume
 */
public class Exercises1 extends AppCompatActivity {

    private static final String TAG = "Exercises1";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe1);
        TextView textView = findViewById(R.id.exe1_text);
        textView.setText("onPause --> onStop --> onDestroy --> onStart --> onResume");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart() called");
        super.onRestart();
    }
}
