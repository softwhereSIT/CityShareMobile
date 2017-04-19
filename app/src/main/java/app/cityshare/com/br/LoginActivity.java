package app.cityshare.com.br;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    ImageView img_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img_logo = (ImageView)findViewById(R.id.img_logo);
    }
    public void Cadastrar (View view){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);

    }

    public void Entrar (View view){

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }
}
