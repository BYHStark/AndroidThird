package com.example.myclient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity{
	
	private EditText etxtUserName;
	private EditText etxtPassword;
	private Button btnRegister;
	
	private static final String ipAdress="172.30.85.22";
	
	//////////////////
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
     
        etxtUserName=(EditText) findViewById(R.id.NewUserName);
        etxtPassword=(EditText) findViewById(R.id.NewPassword);
        
        btnRegister=(Button) findViewById(R.id.btnRegister);
        
        btnRegister.setOnClickListener(new MyButtonOnClickListener());
	}
    
/////////////////////////////////////////////////////////////////////////////////////
	class MyButtonOnClickListener implements OnClickListener {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			switch (arg0.getId()) {
			case R.id.btnRegister:
				try{        	
		        	Socket s1=new Socket(ipAdress,6666);
		        	OutputStream os=s1.getOutputStream();
		        	DataOutputStream dos=new DataOutputStream(os);
					dos.writeUTF(etxtUserName.getText().toString() + " "
							+ etxtPassword.getText().toString());// 传给服务器账号和密码
					dos.close();
		        	s1.close();
		        }catch(UnknownHostException e){
		        	e.printStackTrace();
		        	Toast.makeText(getApplicationContext(), "注册失败",
		        		     Toast.LENGTH_SHORT).show();
		        }catch(IOException e){
		        	e.printStackTrace();
		        	Toast.makeText(getApplicationContext(), "注册失败",
		        		     Toast.LENGTH_SHORT).show();
		        }
				intent.setClass(Register.this,
						LogIn.class);
				break;
			}
			Register.this.startActivity(intent);
			finish();
		}
	}
}
