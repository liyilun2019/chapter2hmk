package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe1);
        cnt = getIntent().getIntExtra("IND",0);
        TextView textView = findViewById(R.id.exe1_text);
        textView.setText(""+cnt);
        textView.setTextSize(32);
    }

}
