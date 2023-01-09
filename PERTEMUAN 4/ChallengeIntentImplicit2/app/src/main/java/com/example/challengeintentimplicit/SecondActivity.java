package com.example.challengeintentimplicit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    final static String EXTRA_ITEM_VALUE = "SecondActivity.extra.itemValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    // in this method a returnIntent with the key for the item value of this act is passed with the right button text
    // the intent is set as result and the activity finished
    // in the main act the result will be fetched  in

    public void addItemToMainAct(View view) {
        Intent returnIntent = new Intent();
        Button b = (Button) view;
        returnIntent.putExtra(EXTRA_ITEM_VALUE, b.getText().toString());
        setResult(RESULT_OK, returnIntent);
        finish();
    }

}
