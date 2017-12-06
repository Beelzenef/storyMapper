package com.geekstorming.storymapper.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.geekstorming.storymapper.R;
import com.geekstorming.storymapper.ui.books.BookActivity;

/**
 * @author Elena Guzman Blanco (Beelzenef) - 3d10Mundos
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void onClick_EnterApp (View v) {

        Intent unIntent = null;

        switch (v.getId()) {
            case R.id.btn_SignIn:
                unIntent = new Intent(LoginActivity.this, BookActivity.class);
                break;
        }

        startActivity(unIntent);
    }
}
