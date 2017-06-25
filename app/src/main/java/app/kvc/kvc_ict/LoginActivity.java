package app.kvc.kvc_ict;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText txtUsername;
    private EditText txtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //clearLoginForm();

        btnLogin = (Button) findViewById(R.id.btn_login);
        txtUsername = (EditText) findViewById(R.id.input_username);
        txtPassword = (EditText) findViewById(R.id.input_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    public boolean validate() {
        boolean valid = true;

        String email = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();

        if (email.isEmpty()) {
            txtUsername.setError("enter a valid username");
            valid = false;
        } else {
            txtUsername.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            txtPassword.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            txtPassword.setError(null);
        }

        return valid;
    }


    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
    }


    public void login() {

        if (!validate()) {
            onLoginFailed();
            return;
        }


        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.Theme_AppCompat_Light_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();

        // TODO: Implement your own authentication logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onLoginSuccess or onLoginFailed
                        //onLoginSuccess();
                        // onLoginFailed();
                        //Toast.makeText(getBaseContext(), "Login success", Toast.LENGTH_LONG).show();
                        progressDialog.dismiss();
                        Intent i = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                        //clearLoginForm();
                    }
                }, 3000);
    }

    private void clearLoginForm() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtUsername.setError(null);
        txtPassword.setError(null);
        txtUsername.clearFocus();
        txtPassword.clearFocus();
        //txtUsername.setFocusableInTouchMode(true);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        clearLoginForm();
    }
}
