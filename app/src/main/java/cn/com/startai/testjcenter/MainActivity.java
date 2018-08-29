package cn.com.startai.testjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.com.startai.startai_log.StartaiLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StartaiLog.info("TEST", "startaiLog");

    }
}
