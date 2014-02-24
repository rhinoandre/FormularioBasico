package com.example.formulariobasico;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormApresentationActivity extends Activity{
	
	private TextView nome;
	private TextView tel;
	private TextView email;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.form_apresentation_layout);
		
		Bundle bundle = getIntent().getExtras();
		
		nome  = (TextView) findViewById(R.id.nome);
		nome.setText(bundle.getString("nome"));
		tel   = (TextView) findViewById(R.id.tel);
		tel.setText(bundle.getString("tel"));
		email = (TextView) findViewById(R.id.email);
		email.setText(bundle.getString("email"));
	}
	
	public void returnValues(View view){
//		Bundle bundle = new Bundle();
//		bundle.putString("nome",  nome.getText().toString());
//		bundle.putString("tel",   tel.getText().toString());
//		bundle.putString("email", email.getText().toString());
//		
//		getIntent().putExtras(bundle);
		
		setResult(1, getIntent());
		finish();
	}
	
}
