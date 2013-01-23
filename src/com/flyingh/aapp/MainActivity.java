package com.flyingh.aapp;

import android.app.Activity;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void addContent(View view) {
		Uri url = Uri
				.parse("content://com.flyingh.providers.PersonProvider/person");
		ContentValues values = new ContentValues();
		values.put("name", "haha");
		values.put("age", 25);
		values.put("amount", 5000);
		getContentResolver().insert(url, values);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
