package com.gov.espressotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button nextActivityB, changeTextB;
    private TextView displayText;
    private EditText inputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nextActivityB = (Button) findViewById(R.id.next_activity_button);
        changeTextB = (Button) findViewById(R.id.change_text_button);
        displayText = (TextView) findViewById(R.id.information_text);
        inputField = (EditText) findViewById(R.id.enter_text_input_field);

        nextActivityB.setOnClickListener(this);
        changeTextB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.next_activity_button:
                break;
            case R.id.change_text_button:
                String input = String.valueOf(inputField.getText());
                displayText.setText(input);
                break;
        }
    }
}
