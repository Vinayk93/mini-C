package com.example.minic;

import android.app.Activity;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class code extends Activity{
	private static final int REQUEST_CODE = 14;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		
Button k3=(Button)findViewById(R.id.button5);
		
		k3.setOnClickListener(new View.OnClickListener() {


			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final EditText matxt=(EditText) findViewById(R.id.mainedit);
				matxt.setText(" ");
				
			}
			
		});

		
		
		
		Button k=(Button)findViewById(R.id.button3);
		Button k2=(Button)findViewById(R.id.button7);
		
		k.setOnClickListener(new View.OnClickListener() {


			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button3(v);
				
			}
			
		});
		
		k2.setOnClickListener(new View.OnClickListener() {


			@Override
			public void onClick(View v5) {
				// TODO Auto-generated method stub
				button4(v5);
				
			}
			
		});
		
	}
	

public void k(View vv){
	final EditText mtxt=(EditText) findViewById(R.id.mainedit);
	
	String b=mtxt.getText().toString();
	Bundle basket=new Bundle();
	basket.putString("s2", b);
	Intent a=new Intent(code.this,MainActivity.class);
	a.putExtras(basket);
	startActivity(a);
	finish();

}

public void button3(View vv){
	final EditText mtxt=(EditText) findViewById(R.id.mainedit);
	//code for result
	Intent i = new Intent(this, looping.class);
	  i.putExtra("Value1", "This value one for ActivityTwo ");
	  i.putExtra("Value2", "This value two ActivityTwo");
	  // set the request code to any code you like,
	  // you can identify the callback via this code
	  startActivityForResult(i, REQUEST_CODE);
	  
}
public void button4(View vvs){
	final EditText mtxt=(EditText) findViewById(R.id.mainedit);
	//code for result
	Intent i = new Intent(this, io.class);
	  i.putExtra("Value1", "This value one for ActivityTwo ");
	  i.putExtra("Value2", "This value two ActivityTwo");
	  // set the request code to any code you like,
	  // you can identify the callback via this code
	  startActivityForResult(i, REQUEST_CODE);
	  
	
}


@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
  if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
    if (data.hasExtra("returnKey1")) {
    	final EditText mtxt=(EditText) findViewById(R.id.mainedit);
    	mtxt.append(data.getExtras().getString("returnKey1"));
    
    }   
    }
    if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
    if(data.hasExtra("returnKey2")){
    	final EditText mtxt=(EditText) findViewById(R.id.mainedit);
    	mtxt.append(data.getExtras().getString("returnKey2"));
    
    }
  }
  
} 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
