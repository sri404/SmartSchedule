package com.fouad.smartschedule;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SignupActivity extends Activity implements OnClickListener {

	EditText etFirstName, etlastName, etContactNumber, etemail, etpassword,
			etconformpassword;
	CheckBox cbRegularuser, cbInchargeUser, cbUltimateUser;
	ImageView btnBack;
	TextView textTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		getIds();
		textTitle.setText(getResources().getString(R.string.signuptext));
		btnBack.setOnClickListener(null);
	}

	private void getIds() {
		btnBack = (ImageView) findViewById(R.id.img_back);
		textTitle = (TextView) findViewById(R.id.tv_title);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.img_back:
			finish();
			break;

		default:
			break;
		}

	}

}
