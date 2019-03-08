package com.example.userinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements UserView {

    private TextView userName;
    private UserPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.userName);
        presenter = new UserPresenterImplementer(this);
        presenter.onCreate();
    }

    @Override
    public void updateUserInfo(String userInfo) {
        userName.setText(userInfo);
    }
}