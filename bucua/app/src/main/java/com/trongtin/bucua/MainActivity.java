package com.trongtin.bucua;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Files;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
 Button but1;
 ImageView image1,image2,image3,bg;
 TextView t1,t2,t3,t4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.superidol);
        music.start();
        init();

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }

    public void init()
   {


       but1=(Button)findViewById(R.id.button1);
       image1=(ImageView)findViewById(R.id.imageView1);
       image2=(ImageView)findViewById(R.id.imageView2);
       image3=(ImageView)findViewById(R.id.imageView3);
       t1=(TextView)findViewById(R.id.textView1);
       t2=(TextView)findViewById(R.id.textView2);
       t3=(TextView)findViewById(R.id.textView3);
       t4=(TextView)findViewById(R.id.textView4);
       bg=(ImageView)findViewById(R.id.background);
       bg.setImageResource(R.drawable.phao);
       image1.setImageResource(R.drawable.bau);
       image2.setImageResource(R.drawable.bau);
       image3.setImageResource(R.drawable.bau);
               CountDownTimer countDownTimer=new CountDownTimer(4000,100) {
                   @Override
                   public void onTick(long l) {
                       Random random=new Random();
                       int so1=random.nextInt(6)+1;
                       switch (so1)
                       {
                           case 1:
                           {
                               image1.setImageResource(R.drawable.bau);
                               t1.setText("Bầu");
                               break;
                           }
                           case 2:
                           {
                               image1.setImageResource(R.drawable.cua);
                               t1.setText("Cua");
                               break;
                           }
                           case 3:
                           {
                               image1.setImageResource(R.drawable.tom);
                               t1.setText("Tôm");
                               break;
                           }
                           case 4:
                           {
                               image1.setImageResource(R.drawable.ca);
                               t1.setText("Cá");
                               break;
                           }
                           case 5:
                           {
                               image1.setImageResource(R.drawable.ga);
                               t1.setText("Gà");
                               break;
                           }
                           case 6:
                           {
                               image1.setImageResource(R.drawable.nai);
                               t1.setText("Nai");
                               break;
                           }
                       }
                       int so2=random.nextInt(6)+1;
                       switch (so2)
                       {
                           case 1:
                           {
                               image2.setImageResource(R.drawable.bau);
                               t2.setText("Bầu");
                               break;
                           }
                           case 2:
                           {
                               image2.setImageResource(R.drawable.cua);
                               t2.setText("Cua");
                               break;
                           }
                           case 3:
                           {
                               image2.setImageResource(R.drawable.tom);
                               t2.setText("Tôm");
                               break;
                           }
                           case 4:
                           {
                               image2.setImageResource(R.drawable.ca);
                               t2.setText("Cá");
                               break;
                           }
                           case 5:
                           {
                               image2.setImageResource(R.drawable.ga);
                               t2.setText("Gà");
                               break;
                           }
                           case 6:
                           {
                               image2.setImageResource(R.drawable.nai);
                               t2.setText("Nai");
                               break;
                           }
                       }
                       int so3=random.nextInt(6)+1;
                       switch (so3)
                       {
                           case 1:
                           {
                               image3.setImageResource(R.drawable.bau);
                               t3.setText("Bầu");
                               break;
                           }
                           case 2:
                           {
                               image3.setImageResource(R.drawable.cua);
                               t3.setText("Cua");
                               break;
                           }
                           case 3:
                           {
                               image3.setImageResource(R.drawable.tom);
                               t3.setText("Tôm");
                               break;
                           }
                           case 4:
                           {
                               image3.setImageResource(R.drawable.ca);
                               t3.setText("Cá");
                               break;
                           }
                           case 5:
                           {
                               image3.setImageResource(R.drawable.ga);
                               t3.setText("Gà");
                               break;
                           }
                           case 6:
                           {
                               image3.setImageResource(R.drawable.nai);
                               t3.setText("Nai");
                               break;
                           }
                       }

                   };

                   @Override
                   public void onFinish() {
                       but1.setEnabled(true);
                   }
               };

           but1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   but1.setEnabled(false);
                   countDownTimer.start();

               }
           });

   }
}