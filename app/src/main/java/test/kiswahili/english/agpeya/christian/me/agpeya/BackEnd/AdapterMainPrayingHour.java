package test.kiswahili.english.agpeya.christian.me.agpeya.BackEnd;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import test.kiswahili.english.agpeya.christian.me.agpeya.R;

/**
 * Created by Tony on 31/07/2016.
 */
public class AdapterMainPrayingHour extends BaseAdapter {

    Context ctx;
    String [] items;
    //constructor
    public AdapterMainPrayingHour(Context ctx,String [] items)
    {
        this.ctx=ctx;
        this.items=items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    //comp
    TextView tv_item;
    ImageView iv;

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootview = inflater.inflate(R.layout.listitemprayerhour, null);

        tv_item=(TextView)rootview.findViewById(R.id.TVItem);
        iv=(ImageView)rootview.findViewById(R.id.prayicon);

        Typeface type = Typeface.createFromAsset(ctx.getAssets(),"fonts/CALIST.TTF");

        tv_item.setTypeface(type);
        tv_item.setText(items[i]);

        switch (i)
        {
            case 0:
                iv.setImageResource(R.drawable.mh_1);
                break;
            case 1:
                iv.setImageResource(R.drawable.h3_3);
                break;
            case 2:
                iv.setImageResource(R.drawable.h6_1);
                break;
            case 3:
                iv.setImageResource(R.drawable.h9);
                break;
            case 4:
                iv.setImageResource(R.drawable.h11_2);
                break;
            case 5:
                iv.setImageResource(R.drawable.h11_1);
                break;
            case 6:
                iv.setImageResource(R.drawable.h12);
                break;
        }


        return rootview;
    }//end of view
}//end of class
