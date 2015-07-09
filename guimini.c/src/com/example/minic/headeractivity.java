package com.example.minic;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import android.widget.*;

public class headeractivity extends MainActivity {
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.header);
		final TextView t33=(TextView) findViewById(R.id.textView22);
		final CheckBox c1=(CheckBox)findViewById(R.id.std);
		final CheckBox c2=(CheckBox)findViewById(R.id.con);
		final CheckBox c3=(CheckBox)findViewById(R.id.str);
		final CheckBox cm=(CheckBox)findViewById(R.id.math);
		
		Button bu3=(Button)findViewById(R.id.button3);	
		Button bu2=(Button)findViewById(R.id.button2);	
		Button bu1=(Button)findViewById(R.id.button1);
		bu3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				int c6 = 0,c4=0,c5=0,c7=0;
				if(c1.isChecked()==true){
					c4=1;
			}
				if(c2.isChecked()==true){
					c5=1;
			}
				if(c3.isChecked()==true){
					c6=1;
				}
				if(cm.isChecked()==true){
					c7=1;
				}
				t33.setText("");
				if(c4==1){
				t33.append("#include<stdio.h>\n");
				}
				if(c5==1){
				t33.append("#include<conio.h>\n");
				}
				if(c6==1){
					t33.append("#include<string.h>\n");
					}
				if(c7==1){
					t33.append("#include<math.h>\n");
					}
					
				}		
				});
		bu2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg1) {
				c1.setChecked(false);
				c2.setChecked(false);
				c3.setChecked(false);
				t33.setText(" ");
			}
		});
		
		bu1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				int c6 = 0,c4=0,c5=0;
				if(c1.isChecked()==true){
					c4=1;
			}
				if(c2.isChecked()==true){
					c5=1;
			}
				if(c3.isChecked()==true){
					c6=1;
				}
				t33.setText("");
							
				if(c4==1){
				t33.append("#include<stdio.h>\n");
				}
				if(c5==1){
				t33.append("#include<conio.h>\n");
				}
				if(c6==1){
				t33.append("#include<string.h>\n");
				}	
				int c7=0;
				if(c7==1){
					t33.append("#include<math.h>\n");
					}
				String b=t33.getText().toString();
				Bundle basket=new Bundle();
				basket.putString("s1", b);
				Intent a=new Intent(headeractivity.this,MainActivity.class);
				a.putExtras(basket);
				startActivity(a);
			}});
		
		
			}
		@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
