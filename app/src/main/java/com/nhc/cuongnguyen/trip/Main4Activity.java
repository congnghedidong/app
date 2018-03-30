package com.nhc.cuongnguyen.trip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

public class Main4Activity extends AppCompatActivity {

    private Button logout,back;
    private EditText user,email;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        logout = (Button)findViewById(R.id.logout_button);
        user = (EditText)findViewById(R.id.username);
        email = (EditText)findViewById(R.id.email);
        img = (ImageView)findViewById(R.id.image);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String mail = intent.getStringExtra("email");
        String url = intent.getStringExtra("url");
        user.setText(username+"");
        email.setText(mail+"");
        Picasso.get().load(url).into(img);
    }

    public void logout(View view) {
        LoginManager.getInstance().logOut();
        FirebaseAuth.getInstance().signOut();
        user.setText("");
        email.setText("");
        img.setImageResource(R.drawable.defaultuser);
        logout.setText("BACK");
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this,MainActivity.class);
                finish();
            }
        });
    }
}
