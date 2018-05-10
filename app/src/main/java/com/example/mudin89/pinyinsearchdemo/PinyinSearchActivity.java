package com.example.mudin89.pinyinsearchdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.pinyinsearch.model.PinyinSearchUnit;
import com.pinyinsearch.util.PinyinUtil;
import com.pinyinsearch.util.QwertyUtil;

import java.util.ArrayList;

public class PinyinSearchActivity extends AppCompatActivity {
    TextView tvResult, etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        tvResult = findViewById(R.id.tvResult);
        etSearch = findViewById(R.id.etPinyinSearch);

        ImageView btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                checkPinyin();

            }
        });
    }

    public void checkPinyin() {
        ArrayList<String> chineseList = new ArrayList<>();

        String keyword = etSearch.getText().toString();
        //英文网页

        PinyinSearchUnit pinyinSearchUnit = new PinyinSearchUnit();
        pinyinSearchUnit.setBaseData("我"); // testinng for wo character
        PinyinUtil.parse(pinyinSearchUnit);

//        QwertyUtil.match(pinyinSearchUnit,)


        boolean match = QwertyUtil.match(pinyinSearchUnit, keyword);

        if (match) {
            tvResult.setText(pinyinSearchUnit.getBaseData());
        }


    }

}
