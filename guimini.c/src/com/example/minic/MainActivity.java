package com.example.minic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {
	protected static final String FILE1 = "header";
	protected static final String FILE2 = "main";
 	
	public TextView t31;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		initialise();
		}	
	
 	private void initialise() {
		
 		final TextView t31=(TextView) findViewById(R.id.textView2);
 		final TextView log=(TextView) findViewById(R.id.log);
		
				Button buu1=(Button)findViewById(R.id.r1);	
//refresh header
					buu1.setOnClickListener(new View.OnClickListener() {

				public void onClick(View arg0) {
				
					Bundle gb=getIntent().getExtras();
					String ss1=gb.getString("s1");
					try{
					log.setText("header is updated as "+ss1);
					t31.setText(ss1);
					String s1=t31.getText().toString();
					FileOutputStream fos = openFileOutput(FILE1, Context.MODE_PRIVATE);
					fos.write(s1.getBytes());
					fos.close();
					}catch(Exception e){
						t31.setText("");
						
					}
					
					}
				});
					
					
					//next 
					Button b13=(Button)findViewById(R.id.in);
					b13.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
						WebView our=(WebView)findViewById(R.id.wv);
						our.setWebViewClient(new ourViewClient());
						our.loadUrl("http://ideone.com/");
						our.setInitialScale(1);
						our.getSettings().setJavaScriptEnabled(true);
						our.getSettings().setLoadWithOverviewMode(true);
						our.getSettings().setUseWideViewPort(true);
						our.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
						our.setScrollbarFadingEnabled(false);
				    
						}
						
					
					});
					
			 Button buus1=(Button)findViewById(R.id.r2);	
//refresh code
				buus1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Bundle gb=getIntent().getExtras();
						String ss2=gb.getString("s2");
						try{
						log.setText("main is updated as"+ss2);
						t31.setText(ss2);
						
						String s2=t31.getText().toString();
						FileOutputStream fos = openFileOutput(FILE2, Context.MODE_PRIVATE);
						fos.write(s2.getBytes());
						fos.close();
						}catch(Exception e){
							t31.setText("");
						}
					}
					
					
				});
				

					  Button ss2=(Button)findViewById(R.id.all);	
//saved all
					  
						ss2.setOnClickListener(new View.OnClickListener() {

						
							public void onClick(View arg0) {
								//1 phase
								t31.setText(" ");
								try {
							            InputStream inputStream = openFileInput("header");
							             
							            if ( inputStream != null ) {
							                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
							                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
							                String receiveString = "";
							                StringBuilder stringBuilder = new StringBuilder();
							                 
							                while ( (receiveString = bufferedReader.readLine()) != null ) {
							                    stringBuilder.append(receiveString);
							                }
							                 
							                inputStream.close();
							                t31.append(stringBuilder.toString());
							            }
							        }
							        catch (FileNotFoundException e) {
							            
							        } catch (IOException e) {
							            
							        }
							 
								
								t31.append("\nmain(){\n");	
								//1 phase
								try{
								InputStream inputStream = openFileInput("main");
					             
					            if ( inputStream != null ) {
					                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
					                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
					                String receiveString = "";
					                StringBuilder stringBuilder = new StringBuilder();
					                 
					                while ( (receiveString = bufferedReader.readLine()) != null ) {
					                    stringBuilder.append(receiveString);
					                }
					                 
					                inputStream.close();
					                t31.append(stringBuilder.toString());
					            }
					        }
					        catch (FileNotFoundException e3) {
					            
					        } catch (IOException e3) {
					            
					        }		
								//2nd phase

								t31.append("\ngetch();\n}");
							
								
						
	
								
								}
							});
		
	}
 	
public void	header1(View view){
		
		Intent r4=new Intent("com.example.minic.headeractivity");
		startActivity(r4);
	}	
	public void	main1(View view){
		Intent r1=new Intent("com.example.minic.code");
		startActivity(r1);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
