package wp_adlisting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.misionesonline.clasificados.ClasificadoService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by diego on 25/10/16.
 */
public class RestClient
{
    private static final String BASE_URL = "http://clasificados.misionesonline.net/";
    private ClasificadoService service;

    public RestClient()
    {

        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        service = retrofit.create(ClasificadoService.class);

    }

    public ClasificadoService getApiService()
    {
        return service;
    }
}
