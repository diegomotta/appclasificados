package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.misionesonline.clasificados.PostView;
import com.misionesonline.clasificados.R;

import java.util.List;

import wp_adlisting.Contenido;
import wp_adlisting.RestClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ListPost extends Fragment {
    private PostView mAdapter;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    public RestClient restClient;
    private int page = 1;
    private int previousTotal = 0; // The total number of items in the dataset after the last load
    private boolean loading = true; // True if we are still waiting for the last set of data to load.
    private int visibleThreshold = 2; // The minimum amount of items to have below your current scroll position before loading more.
    int pastVisiblesItems, visibleItemCount, totalItemCount;
    private int current_page = 1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        restClient = new RestClient();
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_post);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getActivity(),2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new PostView(getActivity(),null);
        mRecyclerView.setAdapter(mAdapter);
        loadSize(page);

        mRecyclerView
                .addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrolled(RecyclerView recyclerView,
                                           int dx, int dy) {
                        super.onScrolled(recyclerView, dx, dy);


                            visibleItemCount = mLayoutManager.getChildCount();
                            totalItemCount = mLayoutManager.getItemCount();
                            pastVisiblesItems = mLayoutManager.findFirstVisibleItemPosition();

                            if (loading)
                            {
                                if ( (visibleItemCount + pastVisiblesItems) >= totalItemCount)
                                {
                                    loading = false;
                                    Log.v("...", "Last Item Wow !");
                                    current_page = current_page + 1;
                                    loadSize(current_page);
                                    //Do pagination.. i.e. fetch new data
                                }
                            }
                        }


                });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return  inflater.inflate(R.layout.activity_list, container, false);

    }

    private void loadSize(int page) {
        Call<List<Contenido>> loadSizeCall = restClient.getApiService().posts(page);

        loadSizeCall.enqueue(new Callback <List<Contenido>>() {
            @Override
            public void onResponse(Call <List<Contenido>> call, Response<List<Contenido>> response) {
                int statucode = response.code();
                Log.i("Contendios", "status response " + String.valueOf(statucode));
                List<Contenido> contenidos = response.body();
                Log.i("Contendios", "response " +contenidos.toString());

                String json = new Gson().toJson(contenidos);
                Log.i("Contendios", "response json  " +json);
                //Type collectionType = new TypeToken<List<Contenido>>(){}.getType();
               // List<Contenido> lcs = (List<Contenido>) new Gson().fromJson( json , collectionType);
                if (contenidos.size()> 0){
                    getmAdapter().getPosts().addAll(contenidos);
                    mRecyclerView.getAdapter().notifyDataSetChanged();
                    //mAdapter.notifyDataSetChanged();
                    loading = true;
                }



            }

            @Override
            public void onFailure(Call<List<Contenido>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }


    public PostView getmAdapter() {
        return mAdapter;
    }

    public void setmAdapter(PostView mAdapter) {
        this.mAdapter = mAdapter;
    }
}


