package com.nhc.cuongnguyen.trip;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    CheckBox checkbox;
    Button btn_login,btn_login_fb,btn_login_gg;
    TextView txt_signup,txt_get_password;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        checkbox = (CheckBox) findViewById(R.id.check_box);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login_fb = (Button) findViewById(R.id.btn_login_fb);
        btn_login_gg = (Button) findViewById(R.id.btn_login_gg);
        txt_signup = (TextView) findViewById(R.id.txt_signup);
        txt_get_password = (TextView) findViewById(R.id.get_password);

        sharedPreferences = getSharedPreferences("dataLogin",MODE_PRIVATE);

        username.setText(sharedPreferences.getString("username",""));
        password.setText(sharedPreferences.getString("password",""));
        checkbox.setChecked(sharedPreferences.getBoolean("checked",false));

//        if(checkbox.isChecked()){
//            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//            startActivity(intent);
//        }
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("admin")&&pass.equals("admin")){
                    if(checkbox.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username",user);
                        editor.putString("password",pass);
                        editor.putBoolean("checked",true);
                        editor.commit();
                    }else{
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("username");
                        editor.remove("password");
                        editor.remove("checked");
                        editor.commit();
                    }
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }else
                    Toast.makeText(MainActivity.this, "Sai tài khoản rồi nhé (tài khoản và mật khẩu: admin )", Toast.LENGTH_SHORT).show();
            }
        });

        txt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });


    }
}
