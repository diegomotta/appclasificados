package com.misionesonline.clasificados;

import java.util.List;

import wp_adlisting.Contenido;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import wp_media.Wp_media;

/**
 * Created by diego on 21/10/16.
 */

//http://clasificados.misionesonline.net/wp-json/wp/v2/ad_listing
public interface ClasificadoService {

    @GET("wp-json/wp/v2/ad_listing")
    Call<List<Contenido>> posts(@Query("page") int page);

    //http://clasificados.misionesonline.net/media?parent=12996
    @GET("wp-json/wp/v2/media")
    Call<List<Wp_media>> postimage(@Query("parent") int parent);
}
