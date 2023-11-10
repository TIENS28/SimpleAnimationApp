package oum.hutech.vn.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ball_image;
    Button zoom_bt, clockwise_bt, fade_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball_image = (ImageView) findViewById(R.id.ball_image);
        clockwise_bt = (Button) findViewById(R.id.bt_clock_wise);
        zoom_bt = (Button) findViewById(R.id.bt_zoom);
        fade_bt = (Button) findViewById(R.id.bt_fade);


        clockwise_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation clockwise;
                clockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
                ball_image.startAnimation(clockwise);

            }
        });

        zoom_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation zoom;
                zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                ball_image.startAnimation(zoom);

            }
        });

        fade_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fade;
                fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                ball_image.startAnimation(fade);

            }
        });

    }
}