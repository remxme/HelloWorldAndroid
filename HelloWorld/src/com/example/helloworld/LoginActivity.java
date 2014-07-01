package com.example.helloworld;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloworld.R;

public class LoginActivity extends Activity {
	private Button submit;
	private EditText username;
	private EditText password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.example.helloworld.R.layout.login);
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);
		submit = (Button) findViewById(R.id.submit);

		addActionListener();

	}

	public void addActionListener() {
		submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				System.out.println(username.getText() + "--"
						+ password.getText());
				if (!checkForm()) {
					return;
				}
				// 判断
				// String url = "http://www.baidu.com";
				// try {
				// URL u = new URL(url);
				// HttpURLConnection conn = (HttpURLConnection) u.getContent();
				// } catch (MalformedURLException e) {
				// e.printStackTrace();
				// } catch (IOException e) {
				// e.printStackTrace();
				// }

				// 跳转
				Intent intent = new Intent();
				intent.setClass(LoginActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});
	}

	public boolean checkForm() {
		if ("".equals(username.getText().toString())
				|| "".equals(password.getText().toString())) {
			Toast.makeText(LoginActivity.this, "用户名密码不能为空", Toast.LENGTH_SHORT)
					.show();
			return false;
		} else {
			return true;
		}
	}

}
