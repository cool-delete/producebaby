package cn.studyjams.s1.sj50.dengguandong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;



import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TabHost tabHost;
    private CardView handle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

//.
    }

    private void init() {
        handle = (CardView) findViewById(R.id.cv_handel_face);
        CardView environment = (CardView) findViewById(R.id.cv_environment);
        CardView game = (CardView) findViewById(R.id.cv_game);
        CardView health = (CardView) findViewById(R.id.cv_health);
        CardView skills = (CardView) findViewById(R.id.cv_skills);

        if (handle != null) {
            handle.setOnClickListener(this);
            Picasso.with(this).load("http://c.hiphotos.baidu.com/baike/s%3D220/sign=a0b57524b3de9c82a265fe8d5c8080d2/d31b0ef41bd5ad6eef29f5f781cb39dbb7fd3cde.jpg")
                    .into((ImageView) findViewById(R.id.im_baby_handel_face));
        }
        if (environment != null) {
            Picasso.with(this).load("http://2.im.guokr.com/-0kGJwO8u4DGSr_A_dr6S4-MWv3Hw0csXvq_nfX_lKp8AgAAYwEAAEpQ.jpg")
                    .into((ImageView) findViewById(R.id.im_environment));
            environment.setOnClickListener(this);
        }
        if (game != null) {
            Picasso.with(this).load("http://www.mababy.com/Uploads/ContentsImages/default/0bb23683-9705-4d8a-9907-1630366539b1.jpg")
                    .into((ImageView) findViewById(R.id.im_game));
            game.setOnClickListener(this);
        }
        if (health != null) {

            Picasso.with(this).load("http://b.hiphotos.baidu.com/baike/s%3D220/sign=8c89ff10f3deb48fff69a6dcc01e3aef/c83d70cf3bc79f3d89af8141baa1cd11728b2970.jpg")
                    .into((ImageView) findViewById(R.id.im_health));
            health.setOnClickListener(this);
        }
        if (skills != null) {
            Picasso.with(this).load("http://img1.gtimg.com/baby/pics/hv1/189/184/651/42378384.jpg")
                    .into((ImageView) findViewById(R.id.im_skills));
            skills.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cv_handel_face:
                startInten("http://c.hiphotos.baidu.com/baike/s%3D220/sign=a0b57524b3de9c82a265fe8d5c8080d2/d31b0ef41bd5ad6eef29f5f781cb39dbb7fd3cde.jpg",R.string.baby_hand__language);

                break;

            case R.id.cv_skills:

                startInten("http://img1.gtimg.com/baby/pics/hv1/189/184/651/42378384.jpg",R.string.skille);

                break;

            case R.id.cv_health:
                startInten("http://b.hiphotos.baidu.com/baike/s%3D220/sign=8c89ff10f3deb48fff69a6dcc01e3aef/c83d70cf3bc79f3d89af8141baa1cd11728b2970.jpg",R.string.health);

                break;
            case R.id.cv_game:
                startInten("http://www.mababy.com/Uploads/ContentsImages/default/0bb23683-9705-4d8a-9907-1630366539b1.jpg",R.string.game);
                break;
            case R.id.cv_environment:
                startInten("http://2.im.guokr.com/-0kGJwO8u4DGSr_A_dr6S4-MWv3Hw0csXvq_nfX_lKp8AgAAYwEAAEpQ.jpg",R.string.environment);
                break;
        }

    }

    private void startInten(String pic,int resId) {
        Intent intent = new Intent(this, Content.class);
        intent.putExtra("pic", pic);
        intent.putExtra("resId", resId);
        startActivity(intent);

    }


}
