package sdu.cs.chaiyakit.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Explicit ประกาศตัวแปร
    MediaPlayer mediaPlayer;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร

        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);


    }

    public void playSound(View view) {
        mediaPlayer = MediaPlayer.create(this,R.raw.elephant);
        mediaPlayer.start();
    }

    public void clickPhone(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0849754883"));
        startActivity(mobileIntent);
    }

    public void clickMap(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.216298, 101.056642(สวนสัตว์เปิดเขาเขียว)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void playSound2(View view) {
        mediaPlayer = MediaPlayer.create(this,R.raw.horse);
        mediaPlayer.start();
    }

    public void playSound3(View view) {
        mediaPlayer = MediaPlayer.create(this,R.raw.lion);
        mediaPlayer.start();
    }
}
