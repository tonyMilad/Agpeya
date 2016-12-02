package test.kiswahili.english.agpeya.christian.me.agpeya;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pray_Activity extends AppCompatActivity implements ItemPray_Fragment.OnFragmentInteractionListener
        ,Bible_Fragment.OnFragmentInteractionListener {

    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pray);

        intropray();
        Intent intent=getIntent();
        int i=intent.getIntExtra("selected pray",0);
        switch (i)
        {
            case 0:
                prepsalm();
                moringpsalm();
                moringbible();
                exmoring();
                break;
            case 1:
                hour3();
                break;
            case 2:
                hour6();
                break;
            case 3:
                hour9();
                break;
            case 4:
                hour11();
                break;
            case 5:
                hour12();
                break;
            case 6:
                midhour();
                break;

        }




    }//end of oncreate method
    public  void thrid_watch()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehourMidnight_3Watch_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehourMidnight_3Watch_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhourMidnight_3Watch_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhourMidnight_3Watch_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.biblehourMidnight_3Watch_eng);
        kis_text=getResources().getStringArray(R.array.biblehourMidnight_3Watch_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhourMidnight_3Watch_eng);
        kis_text=getResources().getStringArray(R.array.exhourMidnight_3Watch_kis);
        form(eng_text,kis_text);


        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exbiblehourMidnight_3Watch_eng);
        kis_text=getResources().getStringArray(R.array.exbiblehourMidnight_3Watch_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.creed_eng);
        kis_text=getResources().getStringArray(R.array.creed_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ABSOLUTION_Midnight_eng);
        kis_text=getResources().getStringArray(R.array.ABSOLUTION_Midnight_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.end_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.end_each_hour_kis);
        form(eng_text,kis_text);

    }//en d of method  secound watch

    public  void secound_watch()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehourMidnight_2Watch_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehourMidnight_2Watch_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhourMidnight_2Watch_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhourMidnight_2Watch_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.biblehourMidnight_2Watch_eng);
        kis_text=getResources().getStringArray(R.array.biblehourMidnight_2Watch_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhourMidnight_2Watch_eng);
        kis_text=getResources().getStringArray(R.array.exhourMidnight_2Watch_kis);
        form(eng_text,kis_text);


        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);



    }//en d of method  secound watch
    public  void first_watch()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehourMidnight_1Watch_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehourMidnight_1Watch_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhourMidnight_1Watch_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhourMidnight_1Watch_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.biblehourMidnight_1Watch_eng);
        kis_text=getResources().getStringArray(R.array.biblehourMidnight_1Watch_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhourMidnight_1Watch_eng);
        kis_text=getResources().getStringArray(R.array.exhourMidnight_1Watch_kis);
        form(eng_text,kis_text);


        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);



    }//en d of method  first watch

    public  void midhour()
    {
        first_watch();
        secound_watch();
        thrid_watch();
    }//en d of method midhour

    public  void hour12()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehour12_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehour12_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhour12_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhour12_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.biblehour12_eng);
        kis_text=getResources().getStringArray(R.array.biblehour12_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhour12_eng);
        kis_text=getResources().getStringArray(R.array.exhour12_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.end_exhour12_eng);
        kis_text=getResources().getStringArray(R.array.end_exhour12_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ABSOLUTION_12h_eng);
        kis_text=getResources().getStringArray(R.array.ABSOLUTION_12h_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.end_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.end_each_hour_kis);
        form(eng_text,kis_text);

    }//en d of method hour 12

    public  void hour11()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehour11_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehour11_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhour11_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhour11_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.biblehour11_eng);
        kis_text=getResources().getStringArray(R.array.biblehour11_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhour11_eng);
        kis_text=getResources().getStringArray(R.array.exhour11_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ABSOLUTION_11h_eng);
        kis_text=getResources().getStringArray(R.array.ABSOLUTION_11h_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.end_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.end_each_hour_kis);
        form(eng_text,kis_text);

    }//en d of method hour 11


    public  void hour9()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehour9_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehour9_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhour9_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhour9_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.biblehour9_eng);
        kis_text=getResources().getStringArray(R.array.biblehour9_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhour9_eng);
        kis_text=getResources().getStringArray(R.array.exhour9_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ABSOLUTION_9h_eng);
        kis_text=getResources().getStringArray(R.array.ABSOLUTION_9h_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.end_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.end_each_hour_kis);
        form(eng_text,kis_text);

    }//en d of method hour 9

    public  void hour6()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehour6_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehour6_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhour6_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhour6_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.biblehour6_eng);
        kis_text=getResources().getStringArray(R.array.biblehour6_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhour6_eng);
        kis_text=getResources().getStringArray(R.array.exhour6_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ABSOLUTION_6h_eng);
        kis_text=getResources().getStringArray(R.array.ABSOLUTION_6h_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.end_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.end_each_hour_kis);
        form(eng_text,kis_text);

    }//end of hour 6


    public  void hour3()
    {
        String[] title_eng=getResources().getStringArray(R.array.prehour3_eng);
        String[] title_kis=getResources().getStringArray(R.array.prehour3_kis);
        form(title_eng,title_kis);

        String[] eng_text=getResources().getStringArray(R.array.psalmhour3_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmhour3_kis);
        form(eng_text,kis_text);

         eng_text=getResources().getStringArray(R.array.biblehour3_eng);
         kis_text=getResources().getStringArray(R.array.biblehour3_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.exhour3_eng);
        kis_text=getResources().getStringArray(R.array.exhour3_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ex_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.ex_each_hour_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.ABSOLUTION_3h_eng);
        kis_text=getResources().getStringArray(R.array.ABSOLUTION_3h_kis);
        form(eng_text,kis_text);

        eng_text=getResources().getStringArray(R.array.end_each_hour_eng);
        kis_text=getResources().getStringArray(R.array.end_each_hour_kis);
        form(eng_text,kis_text);

    }//end of hour3

    public void exmoring()
    {
        String[] eng_text=getResources().getStringArray(R.array.exmoring_eng);
        String[] kis_text=getResources().getStringArray(R.array.exmoring_kis);
        form(eng_text,kis_text);
    }

    public void form(String [] eng,String [] kis)
    {
        String[] eng_text=eng;
        String[] kis_text=kis;

        for(int i=0;i<eng_text.length;i++)
        {
            Bundle bundle;
            if(i%2==0)
            {
                bundle=setbundle(getResources().getString(R.string.intro_title),true,kis_text[i],eng_text[i]);
                ItemPray_Fragment itemPray_fragment=new ItemPray_Fragment();
                itemPray_fragment.setArguments(bundle);
                fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.fragment_container,itemPray_fragment);

            }
            else
            {
                bundle=setbundle(getResources().getString(R.string.intro_title),false,kis_text[i],eng_text[i]);
                ItemPray_Fragment itemPray_fragment=new ItemPray_Fragment();
                itemPray_fragment.setArguments(bundle);
                fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.fragment_container,itemPray_fragment);

            }//end of if statment
            fragmentTransaction.commit();
        }//end of for loop
    }//end of method

    public void moringbible()
    {
        String[] eng_text=getResources().getStringArray(R.array.moringbible_eng);
        String[] kis_text=getResources().getStringArray(R.array.moringbible_kis);

        form(eng_text,kis_text);
    }//end of method


    public void moringpsalm()
    {
        String[] eng_text=getResources().getStringArray(R.array.psalmoring_eng);
        String[] kis_text=getResources().getStringArray(R.array.psalmoring_kis);

        form(eng_text,kis_text);
    }

public void prepsalm()
{
    String[] eng_text=getResources().getStringArray(R.array.prepsalm_eng);
    String[] kis_text=getResources().getStringArray(R.array.prepsalm_kis);

    form(eng_text,kis_text);

}//end of method


    public void intropray()
    {
        String[] engarray=getResources().getStringArray(R.array.introPray_eng);
        String[] kisarray=getResources().getStringArray(R.array.introPray_kis);

        form(engarray,kisarray);
    }//end of method

    public Bundle setbundle(String title,boolean main, String kis_text,String eng_text)
    {
        Bundle bundle=new Bundle();
        bundle.putString("title",title);
        bundle.putBoolean("main",main);
        bundle.putString("kis_text",kis_text);
        bundle.putString("eng_text",eng_text);
       // fragTitle.setText(title);
        return  bundle;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void changeTitle(String text) {

    }
}//end of class
