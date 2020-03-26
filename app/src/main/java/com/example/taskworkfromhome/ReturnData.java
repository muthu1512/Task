package com.example.taskworkfromhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReturnData extends AppCompatActivity {
    TextView display;
    public static final String mReply = "messageReply";
    private static final String LOG_TAG = ReturnData.class.getSimpleName();
    private EditText replyEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_data);
        display = findViewById(R.id.text_header);
        replyEditText = findViewById(R.id.ReplyMessage);
        Intent intent = getIntent();
        String getMessage = intent.getStringExtra(SendData.SendMessage);
        display.setText(getMessage);
    }
    public void returnReply(View view) {
        String reply = replyEditText.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(mReply, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "End ReturnDataActivity");
        finish();
    }
}
