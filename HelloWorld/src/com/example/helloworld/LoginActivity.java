package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
