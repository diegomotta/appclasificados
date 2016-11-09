package fragments;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.google.gson.Gson;
import com.misionesonline.clasificados.PostView;
import com.misionesonline.clasificados.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import wp_adlisting.Contenido;
import wp_adlisting.RestClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import wp_media.Wp_media;

/**
 * Created by diego on 27/10/16.
 */
public class SelectClasificado extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{
    private  RestClient restClient;

    private SliderLayout mDemoSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_clasificado);
        restClient = new RestClient();
        mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        ActionBar actionBar =getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        String titulo = getIntent().getExtras().getString("titulo");
        String fecha = getIntent().getExtras().getString("fecha");
        String contenido = getIntent().getExtras().getString("contenido");
        String autor = getIntent().getExtras().getString("autor");
        String idPost =  getIntent().getExtras().getString("idPost");

        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        TextView txtFecha = (TextView) findViewById(R.id.txtFecha);
        TextView txtAutor = (TextView) findViewById(R.id.txtAutor);
        TextView txtContenido = (TextView) findViewById(R.id.txtContenido);
        //final ImageView postImagen = (ImageView) findViewById(R.id.postImagen);
        txtTitulo.setText(titulo);
        txtFecha.setText(fecha);
        txtAutor.setText(autor);
        txtContenido.setText(contenido);
        Log.i("Contendios", "status response " +Integer.valueOf(idPost));
        Call<List<Wp_media>> loadSizeCall = restClient.getApiService().postimage(Integer.parseInt((idPost)));

        loadSizeCall.enqueue(new Callback<List<Wp_media>>() {
            @Override
            public void onResponse(Call<List<Wp_media>> call, Response<List<Wp_media>> response) {
                int statucode = response.code();
                Log.i("Contendios", "status response " + String.valueOf(statucode));
                List<Wp_media> contenidos = response.body();
                Log.i("Contendios", "response " + contenidos.toString());
                String json = new Gson().toJson(contenidos);
                Log.i("Contendios", "response json  " + json);
                //System.out.println(contenidos.getSource_url());
               // Picasso.with(getApplicationContext()).load(contenidos.getSource_url()).into(postImagen);

                //Type collectionType = new TypeToken<List<Contenido>>(){}.getType();
                // List<Contenido> lcs = (List<Contenido>) new Gson().fromJson( json , collectionType);
                for(Wp_media name : contenidos){
                    TextSliderView textSliderView = new TextSliderView(getApplicationContext());
                    // initialize a SliderLayout

                    textSliderView
                            .description("")
                            .image(name.getSource_url())
                            .setScaleType(BaseSliderView.ScaleType.FitCenterCrop);
                    //add your extra information
                    mDemoSlider.addSlider(textSliderView);
                }
                mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Default);
                mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
                //mDemoSlider.setCustomAnimation(new DescriptionAnimation());
                //mDemoSlider.setDuration(4000);
            }

            @Override
            public void onFailure(Call<List<Wp_media>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }

    @Override
    protected void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
}
