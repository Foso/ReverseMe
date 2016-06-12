package jensklingenberg.de.ReverseMev1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edUsername;
    EditText edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin = (Button) findViewById(R.id.btnLogin);
        edUsername = (EditText) findViewById(R.id.edUsername);
        edPassword = (EditText) findViewById(R.id.edPassword);

       final String username = edUsername.getText().toString();
       final String password = edPassword.getText().toString();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkLogin(username,password)){
                    Intent intent = new Intent(MainActivity.this,SecretActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    public boolean checkLogin(String username,String password){

        //Imagine a network request here

        return false;
    }
}
