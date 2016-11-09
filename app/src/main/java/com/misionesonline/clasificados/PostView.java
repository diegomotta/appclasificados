package com.misionesonline.clasificados;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jsoup.Jsoup;

import java.util.ArrayList;
import java.util.List;

import wp_adlisting.Contenido;
import fragments.SelectClasificado;

/**
 * Created by diego on 21/10/16.
 */
/**
 * Created by diego on 12/08/16.
 */
public class PostView extends  RecyclerView.Adapter<PostView.ViewHolder>  {

    private List<Contenido> posts;
    private static Context context;

    public PostView(Context context, List<Contenido> contenidos) {
        this.posts =  new ArrayList<>();
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Contenido> getPosts() {
        return posts;
    }

    public void setPosts(List<Contenido> posts) {
        this.posts = posts;
    }

    @Override
    public PostView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Log.i("Contenidos dimension", String.valueOf(html2text(posts.get(position).getContent().getRendered())));
        // - get element from your dataset at this position
        holder.txtFecha.setText(html2text(posts.get(position).getDate()));
        final String autor = (html2text(posts.get(position).getAuthor()));
        final Integer idPost = posts.get(position).getId();
        holder.txtTitulo.setText(html2text(posts.get(position).getTitle().getRendered()));
        holder.txtContenido.setText(html2text(posts.get(position).getContent().getRendered()));

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, SelectClasificado.class);
                intent.putExtra("fecha", holder.txtFecha.getText());
                intent.putExtra("titulo", holder.txtTitulo.getText());
                intent.putExtra("contenido", holder.txtContenido.getText());
                intent.putExtra("autor", autor);
                intent.putExtra("idPost",idPost.toString());
                        context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        // return  0;
        //posts  != null ? posts.size() : 0;
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public final CardView cv;
        private TextView txtFecha;
        private TextView txtAutor;
        private TextView txtTitulo;
        private TextView txtContenido;

        //public View mView;
        public ViewHolder(View v) {
            super(v);
            cv = (CardView) v.findViewById(R.id.card_view);
            txtFecha = (TextView) v.findViewById(R.id.txtFecha);

            txtContenido = (TextView) v.findViewById(R.id.txtContenido);
            txtTitulo = (TextView) v.findViewById(R.id.txtTitulo);
            //mView = v;
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    public static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
}
