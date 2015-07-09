package com.example.minic;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;




public class io extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.io);
		
	
		Button btn1=(Button)findViewById(R.id.iobtn1);
		Button btn2=(Button)findViewById(R.id.iobtn2);
		final CheckBox c1=(CheckBox)findViewById(R.id.checkBox1);
		final CheckBox c2=(CheckBox)findViewById(R.id.checkBox2);
		final	CheckBox c3=(CheckBox)findViewById(R.id.checkBox3);
		final	CheckBox c4=(CheckBox)findViewById(R.id.checkBox4);
		final	CheckBox c5=(CheckBox)findViewById(R.id.checkBox5);
		final EditText txt=(EditText)findViewById(R.id.iotxt);
		btn1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
			if(c1.isChecked()==true){
			txt.append("printf(\"%d \",&d);\n");
			
			}
			if(c2.isChecked()==true){
				txt.append("printf(\"%c\",&c);\n");
			}
			if(c3.isChecked()==true){
				txt.append("printf(\"%f\",&f);\n");
			}
			if(c4.isChecked()==true){
				txt.append("printf(\"%s\",s);\n");
			}
			if(c5.isChecked()==true){
				txt.append("printf(\"%f\",&f);\n");
			}
			
						
			}
			
		});
		btn2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				if(c1.isChecked()==true){
					txt.append("scanf(\"%d\",&d);\n");
						
					}
					if(c2.isChecked()==true){
						txt.append("scanf(\"%c\",&c);\n");
					}
					if(c3.isChecked()==true){
						txt.append("scanf(\"%f\",&f);\n");
					}
					if(c4.isChecked()==true){
						txt.append("scanf(\"%s\",s);\n");
					}
					if(c5.isChecked()==true){
						txt.append("scanf(\"%f\",&f);\n");
					}										
			}		
	});
		Button btn11=(Button)findViewById(R.id.iors);
		Button btn12=(Button)findViewById(R.id.iod);
		
		btn11.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				c1.setChecked(false);
				c2.setChecked(false);
				c3.setChecked(false);
				c4.setChecked(false);
				c5.setChecked(false);
				txt.setText("");
								
			}
			
		});
		btn12.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				//code for 
				
				String ss=txt.getText().toString();
				Intent data = new Intent();
				  data.putExtra("returnKey2", ss);
				  setResult(RESULT_OK, data);
				  finish();		
			}
			
		});
		
		
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
