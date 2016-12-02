package test.kiswahili.english.agpeya.christian.me.agpeya;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class SettingActivity extends AppCompatActivity {

    // Strings to Show In Dialog with Radio Buttons
    final String[] items = {" English "," Kiswahili "," Kiswahili / English "};
    final String[] fontsizeitems={" Small "," Medium "," Large "," Huge "};
    AlertDialog langDialog,fontsizeDialog;
    TextView lang,fontsize;
    SharedPreferences sharedpreferences;
    int defualt_size=0,defualt_lang=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        lang=(TextView)findViewById(R.id.tvlanguage);
        fontsize=(TextView)findViewById(R.id.tvfontsize);
        sharedpreferences = getSharedPreferences("general Settings", 0);
        defualt_size=sharedpreferences.getInt("defualt_size",0);
        defualt_lang=sharedpreferences.getInt("defualt_lang",2);
        final SharedPreferences.Editor editor = sharedpreferences.edit();
        lang.setText(sharedpreferences.getString("language"," Kiswahili / English "));
        fontsize.setText(sharedpreferences.getString("font"," Small "));


        // Creating and Building the Dialog
        AlertDialog.Builder langbuilder = new AlertDialog.Builder(this);
        langbuilder.setTitle("lugha  Language");
        langbuilder.setSingleChoiceItems(items, defualt_lang, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                switch(i)
                {
                    case 0:
                        // Your code when first option seletced
                        editor.putString("language",items[i].toString());
                        editor.putInt("defualt_lang",0);
                        lang.setText(items[i]);
                        defualt_lang=0;
                        break;
                    case 1:
                        // Your code when 2nd  option seletced
                        editor.putString("language",items[i].toString());
                        editor.putInt("defualt_lang",1);
                        lang.setText(items[i]);
                        defualt_lang=1;
                        break;
                    case 2:
                        // Your code when 3rd option seletced
                        editor.putString("language",items[i].toString());
                        editor.putInt("defualt_lang",2);
                        lang.setText(items[i]);
                        defualt_lang=2;
                        break;

                }
                editor.commit();
                langDialog.dismiss();

            }//end of onclick methode
        });

        langDialog = langbuilder.create();

        lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                langDialog.show();
            }
        });


        AlertDialog.Builder fontsizebuilder = new AlertDialog.Builder(this);
        fontsizebuilder.setTitle(" Nakala Size   Font Size ");
        fontsizebuilder.setSingleChoiceItems(fontsizeitems,defualt_size, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


                switch(i)
                {
                    case 0:
                        // Your code when first option seletced
                        editor.putInt("fontsize",20);
                        editor.putString("font"," Small ");
                        editor.putInt("defualt_size",0);
                        fontsize.setText(fontsizeitems[i]);
                        defualt_size=0;
                        break;
                    case 1:
                        // Your code when 2nd  option seletced
                        editor.putInt("fontsize",22);
                        editor.putString("font"," Medium ");
                        editor.putInt("defualt_size",1);
                        fontsize.setText(fontsizeitems[i]);
                        defualt_size=1;
                        break;
                    case 2:
                        // Your code when 3rd option seletced
                        editor.putInt("fontsize",26);
                        editor.putString("font"," Large ");
                        editor.putInt("defualt_size",2);
                        fontsize.setText(fontsizeitems[i]);
                        defualt_size=2;
                        break;
                    case 3:
                        // Your code when 3rd option seletced
                        editor.putInt("fontsize",34);
                        editor.putString("font"," Huge ");
                        editor.putInt("defualt_size",3);
                        fontsize.setText(fontsizeitems[i]);
                        defualt_size=3;
                        break;

                }
                editor.commit();
                fontsizeDialog.dismiss();
            }
        });

        fontsizeDialog = fontsizebuilder.create();
        fontsize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fontsizeDialog.show();
            }
        });

    }//end of methode



}//end of classs
