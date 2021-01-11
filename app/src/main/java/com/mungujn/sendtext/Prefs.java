package com.mungujn.sendtext;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;

/**
 * Created by Nickson on 11/01/2015.
 */
public class Prefs extends PreferenceFragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // addContentView;

        addPreferencesFromResource(R.xml.prefs);
    }
}
