package app.cityshare.com.br;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView img_bicicleta;
    ImageView img_carro;
    ImageView img_moto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        img_bicicleta = (ImageView)findViewById(R.id.img_bicicleta);
        img_carro = (ImageView)findViewById(R.id.img_carro);
        img_moto = (ImageView)findViewById(R.id.img_moto);

        /*utilizo a biblioteca picasso para arredondar a imagem*/
        Picasso.with(this)
                .load(R.drawable.menu_motera)
                .transform(new CircleTransform())
                .into(img_moto);

        Picasso.with(this)
                .load(R.drawable.menu_carro)
                .transform(new CircleTransform())
                .into(img_carro);

        Picasso.with(this)
                .load(R.drawable.menu_bike)
                .transform(new CircleTransform())
                .into(img_bicicleta);


       // img_bicicleta.setImageResource(R.drawable.ic_directions_bike_black_24dp);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_editar_dados) {

        } else if (id == R.id.nav_fale_conosco) {

        } else if (id == R.id.nav_acompanhamento) {

        } else if (id == R.id.nav_cadastro) {

        } else if (id == R.id.nav_quem_somos) {

        } else if (id == R.id.nav_sair) {


       // Sair();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

   /* private void Sair() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }*/


}
