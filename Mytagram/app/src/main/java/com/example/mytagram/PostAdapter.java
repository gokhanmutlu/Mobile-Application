package com.example.mytagram;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    List<Post> posts;
    LayoutInflater layoutInflater;

    public PostAdapter(Activity activity, List<Post> posts) {
        this.posts = posts;
        layoutInflater = activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int i) {
        return posts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = layoutInflater.inflate(R.layout.row, null);
        EditText txtMessage = row.findViewById(R.id.txtMessage);
        TextView txtLocation = row.findViewById(R.id.txtLocation);
        ImageView imageView = row.findViewById(R.id.imageView2);
        Post post = posts.get(i);
        txtMessage.setText(post.getMessage());
        imageView.setImageBitmap(post.getImage());
        if(post.getLocation() != null){
            txtLocation.setText(post.getLocation().getLatitude() + " " + post.getLocation().getLongitude());

        }
        return row;
    }
}
