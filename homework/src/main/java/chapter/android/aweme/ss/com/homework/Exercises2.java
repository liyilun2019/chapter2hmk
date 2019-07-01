package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {
    public static final String TAG = "EXE2";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe1);
        View inflate = LayoutInflater.from(this).inflate(R.layout.vie_group,null);
        int cnt = getViewCount(inflate);
        TextView textView = findViewById(R.id.exe1_text);
        textView.setText(""+cnt);
        textView.setTextSize(32);
    }

    public static int getViewCount(View view) {
        Log.d(TAG,view.toString());
        if(!(view instanceof ViewGroup)){
            return 1;
        }else{
            ViewGroup viewGroup = (ViewGroup) view;
            int sz = viewGroup.getChildCount();
            int cnt=0;
            for(int i=0 ;i<sz;i++){
                cnt+=getViewCount(viewGroup.getChildAt(i));
            }
            return cnt+1;
        }
    }
}
