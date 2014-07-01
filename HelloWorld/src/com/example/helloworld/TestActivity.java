package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends Activity {
	private TextView text1;
	private MyApp myApp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		text1 = (TextView) findViewById(R.id.text1);
		myApp = (MyApp) getApplication();
		text1.setText(myApp.getName());
	}

}
