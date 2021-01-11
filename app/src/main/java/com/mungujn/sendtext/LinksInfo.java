package com.mungujn.sendtext;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.ActionBarActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nickson on 14/01/2015.
 */
public class LinksInfo extends ActionBarActivity {
    TextView three,four;
    Button generate,rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linksinfo);
        three = (TextView)findViewById(R.id.editText3);
        four = (TextView)findViewById(R.id.editText10);
        rate = (Button)findViewById(R.id.rate);
        three.setMovementMethod(LinkMovementMethod.getInstance());
        four.setMovementMethod(LinkMovementMethod.getInstance());
        generate=(Button)findViewById(R.id.generateActivity);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(v.getContext(),SendAsset.class);
                startActivity(Intent);
            }
        });
        rate.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchMarket();
            }
        });
    }
    private void launchMarket() {
        //Uri uri2 = Uri.parse("https://play.google.com/store/apps/details?id=com.mungujn.simplevlcremote");
        Uri uri1 = Uri.parse("market://details?id=" + "com.mungujn.sendtext");
        //Uri uri = Uri.parse("market://details?id=" + getPackageName());
        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri1);
        try {
            startActivity(myAppLinkToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, " unable to find market app", Toast.LENGTH_LONG).show();
        }
    }
}
