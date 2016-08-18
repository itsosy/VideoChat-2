package netroxtech.com.videochat;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText name, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
    }

    public void RegisterNow(View view) {

        String n = name.getText().toString();
        String e = email.getText().toString();
        String p = password.getText().toString();

        if (n.equals("")) {
            Toast.makeText(this, "please enter user name", Toast.LENGTH_LONG).show();
        } else if (e.equals("")) {
            Toast.makeText(this, "please enter email", Toast.LENGTH_LONG).show();
        } else if (p.equals("")) {
            Toast.makeText(this, "please enter password", Toast.LENGTH_LONG).show();
        }  else {

            BackgroundTask t = new BackgroundTask(this);
            t.execute("register", n, e, p);
            name.setText("");
            email.setText("");
            password.setText("");
        }

    }
}
