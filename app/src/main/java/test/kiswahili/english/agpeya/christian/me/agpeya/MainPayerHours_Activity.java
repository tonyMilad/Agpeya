package test.kiswahili.english.agpeya.christian.me.agpeya;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import test.kiswahili.english.agpeya.christian.me.agpeya.BackEnd.AdapterMainPrayingHour;

public class MainPayerHours_Activity extends AppCompatActivity {

    ListView LVPrayerHour;
    TextView agpeyatitle;
    ImageButton ibsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_payer_hours);

        ibsettings=(ImageButton)findViewById(R.id.ibsetting);
        ibsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPayerHours_Activity.this,SettingActivity.class);
                startActivity(intent);
            }//end of methode onclick
        });

        LVPrayerHour=(ListView)findViewById(R.id.lvParyingHours);
        LVPrayerHour.setAdapter(new AdapterMainPrayingHour(this,getResources().getStringArray(R.array.payerhours)));

        agpeyatitle=(TextView)findViewById(R.id.agpeyamainpraytitle);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/CALIST.TTF");
        agpeyatitle.setTypeface(type);



        LVPrayerHour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainPayerHours_Activity.this,Pray_Activity.class);
                intent.putExtra("selected pray",i);
                startActivity(intent);

            }
        });

    }//end of method
}//end of class
