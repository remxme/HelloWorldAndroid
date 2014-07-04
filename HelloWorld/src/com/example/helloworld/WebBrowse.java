package com.example.helloworld;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class WebBrowse extends Activity {

	private WebView webview;
	private EditText urlInput;
	private Button gotoUrl;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web_browse);
		webview = (WebView) findViewById(R.id.webview);
		urlInput = (EditText) findViewById(R.id.webviewurl);
		gotoUrl = (Button) findViewById(R.id.gotourl);
		webview.getSettings().setJavaScriptEnabled(true);

		gotoUrl.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				webview.loadUrl(urlInput.getText().toString());
			}
		});
	}

}
