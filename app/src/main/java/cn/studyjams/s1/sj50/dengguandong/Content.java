package cn.studyjams.s1.sj50.dengguandong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.tv_conten);
        if (textView != null) {
            textView.setText(getResources().getString(intent.getIntExtra("resId",0)));
        }
        Picasso.with(this).load(intent.getStringExtra("pic")).into((ImageView) findViewById(R.id.imageView));
    }
}
