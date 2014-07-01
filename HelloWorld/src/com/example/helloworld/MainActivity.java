package com.example.helloworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button btn1;
	private MyApp myApp;
	public final String TAG = "main";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView myTextView = (TextView) findViewById(R.id.myTextView);
		myTextView.setText("我的textView");
		Button myButton = (Button) findViewById(R.id.myButton);
		myButton.setText("我的按钮" + "\n" + "换行");
		myButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// new AlertDialog.Builder(MainActivity.this)
				// .setTitle("ceshi")
				// .setMessage("ceshi")
				// .setPositiveButton("ceshi",
				// new DialogInterface.OnClickListener() {
				// public void onClick(
				// DialogInterface dialoginterface,
				// int i) {
				// }
				// }).show();

				Intent intent = new Intent();
				intent.setClass(MainActivity.this, ListActivity.class);
				startActivity(intent);

			}
		});

		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				myApp = (MyApp) getApplication();
				myApp.setName("李四");
				Log.i(TAG, "李四");
				Intent intent = new Intent(MainActivity.this,
						TestActivity.class);
				startActivity(intent);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
