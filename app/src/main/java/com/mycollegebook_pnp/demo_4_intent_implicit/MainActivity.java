package com.mycollegebook_pnp.demo_4_intent_implicit;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final EditText editText1=(EditText)findViewById(R.id.editText1);
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String url=editText1.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));

                startActivity(intent);

                // Give Input http://www.google.com
                Toast.makeText(getApplicationContext(),String.valueOf("Implicit Intent Started"),Toast.LENGTH_LONG).show();
            }
        });
    }
}