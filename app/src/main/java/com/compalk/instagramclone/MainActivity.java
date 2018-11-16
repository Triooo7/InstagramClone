package com.compalk.instagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView edtParseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtParseText = findViewById(R.id.edtParsetText);
        edtParseText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ParseQuery<ParseObject> parseQuery = ParseQuery.getQuery("KickBoxer");
               parseQuery.getInBackground("VCiMCzDlod", new GetCallback<ParseObject>() {
                   @Override
                   public void done(ParseObject object, ParseException e) {
                       if (object != null && e == null){
                           edtParseText.setText(object.get("KickPower")+"");
                       }
                   }
               });




            }
        });



    }

    @Override
    public void onClick(View view) {

    }
}
