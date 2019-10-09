package info.androidhive.activityrecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText emailET,passwordET;
    private Button loginBTN,signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailET = (EditText)findViewById(R.id.emailID);
        passwordET = (EditText)findViewById(R.id.password);

        loginBTN = (Button)findViewById(R.id.loginBTN);

        signupBtn = (Button)findViewById(R.id.signupBTn);




        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLogin();
            }
        });





    }

    private void startLogin() {

        String email = emailET.getText().toString();
        String pass = passwordET.getText().toString();


        if (email.equals("rethanyagiri@gmail.com")&& pass.equals("123456")){


            Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(LoginActivity.this,MainActivity.class));
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();

        }

    }
}
