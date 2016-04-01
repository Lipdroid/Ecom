package lipdroid.ecom;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity implements View.OnClickListener {
    private TextInputLayout inputLayoutEmail = null;
    private TextInputLayout inputLayoutPass = null;
    private EditText inputEmail = null;
    private EditText inputPassword = null;
    private TextView signUp = null;
    private AppCompatButton login = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        inputLayoutEmail = (TextInputLayout) findViewById(R.id.input_layout_email);
        inputLayoutPass = (TextInputLayout) findViewById(R.id.input_layout_pass);
        inputEmail = (EditText) findViewById(R.id.input_email);
        inputPassword = (EditText) findViewById(R.id.input_password);
        signUp = (TextView) findViewById(R.id.link_signup);
        login = (AppCompatButton) findViewById(R.id.btn_login);

        signUp.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.link_signup:
                startActivity(new Intent(this, SignUpPage.class));
                break;
            case R.id.btn_login:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }

    }
}
