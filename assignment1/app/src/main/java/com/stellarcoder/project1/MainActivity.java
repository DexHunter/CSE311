package com.stellarcoder.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView email;
    ImageView avatar;
    TextView team_info;
    TextView members;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.name);
        email = (TextView)  findViewById(R.id.email);
        avatar = (ImageView)  findViewById(R.id.avatar);
        team_info = (TextView) findViewById(R.id.team_info);
        members = (TextView) findViewById(R.id.members);
        team_info.setVisibility(View.GONE);
        members.setVisibility(View.GONE);
    }

    public void btnClick(View view) {
        //display team info when button is clicked
        name.setVisibility(View.GONE);
        email.setVisibility(View.GONE);
        avatar.setVisibility(View.GONE);
        team_info.setVisibility(View.VISIBLE);
        members.setVisibility(View.VISIBLE);
    }

    public void backhome(View view) {
        name.setVisibility(View.VISIBLE);
        email.setVisibility(View.VISIBLE);
        avatar.setVisibility(View.VISIBLE);
        team_info.setVisibility(View.GONE);
        members.setVisibility(View.GONE);

    }
}
