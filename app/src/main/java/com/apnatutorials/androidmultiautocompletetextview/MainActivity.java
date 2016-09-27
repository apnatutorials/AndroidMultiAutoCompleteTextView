package com.apnatutorials.androidmultiautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String months[] = null;
    ArrayAdapter<String> monthAdapter = null;
    MultiAutoCompleteTextView multiAutoCompleteTvMonth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        months = getResources().getStringArray(R.array.months);
        monthAdapter = new ArrayAdapter<String>(this, R.layout.hint_completion_layout, R.id.tvHintCompletion, months);
        // monthAdapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item, months);
        multiAutoCompleteTvMonth = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTvMonth);
        multiAutoCompleteTvMonth.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTvMonth.setAdapter(monthAdapter);
    }
}
