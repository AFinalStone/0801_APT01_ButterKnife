package com.afs.main;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.afs.app.R;
import com.afs.butterknife.annotation.BindView;
import com.afs.utils.AFButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_click)
    Button mBtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AFButterKnife.bind(this);
        mBtnClick.setText("按钮绑定成功");
    }
}