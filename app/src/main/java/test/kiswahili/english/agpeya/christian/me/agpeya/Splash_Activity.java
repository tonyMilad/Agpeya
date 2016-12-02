package test.kiswahili.english.agpeya.christian.me.agpeya;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Splash_Activity extends AppCompatActivity {
    TextView tvtitle,tvdescription,agy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tvtitle=(TextView)findViewById(R.id.splashtvtitle);
        tvdescription=(TextView)findViewById(R.id.splashtvdescription);
        agy=(TextView) findViewById(R.id.agpeyatitle);


        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/CALIST.TTF");
        tvtitle.setTypeface(type);
        tvdescription.setTypeface(type);
        agy.setTypeface(type);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(Splash_Activity.this,MainPayerHours_Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();

    }//ed of oncreate method

}//end of class
