package com.example.formulariobasico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends Activity {

	private EditText nome;
	private EditText tel;
	private EditText email;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_layout);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_form, menu);
        return true;
    }
    
    public void validarForm(View view) {
		nome = (EditText) findViewById(R.id.nome_edt);
		tel = (EditText) findViewById(R.id.tel_edt);
		email = (EditText) findViewById(R.id.email_edt);
		
		Intent it = new Intent(getApplicationContext(), FormApresentationActivity.class);
		
		it.putExtra("nome", nome.getText().toString());
		it.putExtra("tel", tel.getText().toString());
		it.putExtra("email", email.getText().toString());
		
		startActivityForResult(it, 1);
	}
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	super.onActivityResult(requestCode, resultCode, data);
    	
    	Bundle bundle = data.getExtras();
    	String nome = bundle.getString("nome");
    	String tel = bundle.getString("tel");
    	String email = bundle.getString("email");
    	
    	Log.i("Result", "Nome recebido: "  + nome);
    	Log.i("Result", "Tel recebido: "   + tel);
    	Log.i("Result", "Email recebido: " + email);
    }
    
}
