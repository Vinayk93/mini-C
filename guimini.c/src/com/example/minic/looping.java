package com.example.minic;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class looping extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.looping);
		
        final RadioButton r1=(RadioButton)findViewById(R.id.radioButton1);
		final RadioButton r2=(RadioButton)findViewById(R.id.radioButton2);
		final RadioButton r3=(RadioButton)findViewById(R.id.radioButton3);
		r1.setChecked(false);
		r2.setChecked(false);
		r3.setChecked(false);

		final EditText init=(EditText)findViewById(R.id.linit);
		init.setText("int i=0");
		final EditText inc=(EditText)findViewById(R.id.linc);
	    inc.setText("i++");
		final EditText cond=(EditText)findViewById(R.id.lcond);
		cond.setText("i<0");
		final TextView tv=(TextView)findViewById(R.id.ledit);
		final String s=tv.getText().toString();
		Button check=(Button)findViewById(R.id.lbutton2);
		
		check.setOnClickListener(new View.OnClickListener() {
				
			public void onClick(View arg0) {
					
					if(r1.isChecked()==true){
						tv.append("for("+init.getText()+";"+cond.getText()+";"+inc.getText()+";"+"){\n }");
					}
					if(r2.isChecked()==true){
						tv.append(init.getText()+";\ndo{"+"\n"+inc.getText()+";\n} \nwhile("+cond.getText()+");");
					}
					if(r3.isChecked()==true){
						tv.append(init.getText()+";\nwhile("+cond.getText()+"){"+"\n"+inc.getText()+";\n}");
						
					}
					
					
				}	
		});
		final EditText tx=(EditText)findViewById(R.id.ledit);
		
		Button done=(Button)findViewById(R.id.lbutton1);
		done.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
			
				//code for 
				String ss=tx.getText().toString();
				Intent data = new Intent();
				  data.putExtra("returnKey1", ss);
				  setResult(RESULT_OK, data);
				  finish();
			
		}

			
		});
		
	}
	
	

	
	
	
		// TODO Auto-generated method stub
			
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
