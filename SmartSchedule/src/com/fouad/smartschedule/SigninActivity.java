package com.fouad.smartschedule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SigninActivity extends Activity implements OnClickListener {

	EditText edEmail, edPassword;
	TextView tvSignup, tvForgotpassword;
	CheckBox cbRememberme;
	Button btnLogin, btnfacebooklogin, btngoogleplusLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signin);
		getIds();
	}

	private void getIds() {
		edEmail = (EditText) findViewById(R.id.editTextEmail);
		edPassword = (EditText) findViewById(R.id.editTextPassword);
		btnLogin = (Button) findViewById(R.id.buttonLogin);
		btnfacebooklogin = (Button) findViewById(R.id.buttonFacebook);
		btngoogleplusLogin = (Button) findViewById(R.id.buttonGoogle);
		tvForgotpassword = (TextView) findViewById(R.id.textViewForgotpassword);
		tvSignup = (TextView) findViewById(R.id.textViewSignup);
		
		//Set onClick events for views
		btnLogin.setOnClickListener(this);
		btnfacebooklogin.setOnClickListener(this);
		btngoogleplusLogin.setOnClickListener(this);
		tvForgotpassword.setOnClickListener(this);
		tvSignup.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonLogin:
			Toast.makeText(getApplicationContext(), "Work in progress",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.buttonFacebook:
			Toast.makeText(getApplicationContext(), "Work in progress",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.buttonGoogle:
			Toast.makeText(getApplicationContext(), "Work in progress",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.textViewForgotpassword:
			Toast.makeText(getApplicationContext(), "Work in progress",
					Toast.LENGTH_LONG).show();
		case R.id.textViewSignup:
			Intent loginIntent = new Intent(SigninActivity.this,
					SignupActivity.class);
			startActivity(loginIntent);
		default:
			break;
		}

	}

}
