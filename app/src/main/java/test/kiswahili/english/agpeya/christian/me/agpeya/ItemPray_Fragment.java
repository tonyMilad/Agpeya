package test.kiswahili.english.agpeya.christian.me.agpeya;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ItemPray_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ItemPray_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ItemPray_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ItemPray_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ItemPray_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ItemPray_Fragment newInstance(String param1, String param2) {
        ItemPray_Fragment fragment = new ItemPray_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }





    TextView tveng,tvkis;
    View linesparet;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_item_pray, container, false);

        SharedPreferences sharedPreferences=getContext().getSharedPreferences("general Settings",0);
        int size=sharedPreferences.getInt("fontsize",20);
        String textlanguage=sharedPreferences.getString("language"," Kiswahili / English ");

        tveng=(TextView)view.findViewById(R.id.tveng);
        tvkis=(TextView)view.findViewById(R.id.tvkis);
        linesparet=(View)view.findViewById(R.id.linesparet);

        if(getArguments().getBoolean("main"))
        {
            //set Gravity
            tveng.setGravity(Gravity.CENTER);
            tvkis.setGravity(Gravity.CENTER);
            //set size
            tveng.setTextSize(size);
            tvkis.setTextSize(size);
            //set font bold
            Typeface type = Typeface.createFromAsset(getContext().getAssets(),"fonts/CALISTB.TTF");
            tveng.setTypeface(type);
            tvkis.setTypeface(type);
            //tveng.setTypeface(null, Typeface.BOLD);
            //tvkis.setTypeface(null, Typeface.BOLD);
            //change colour to red
            //
            tveng.setTextColor(Color.parseColor("#173f58"));
            tvkis.setTextColor(Color.parseColor("#173f58"));
        }
        else
        {
            //set font
            Typeface type = Typeface.createFromAsset(getContext().getAssets(),"fonts/CALIST.TTF");
            tveng.setTypeface(type);
            tvkis.setTypeface(type);
            //set size


            tveng.setTextSize(size);
            tvkis.setTextSize(size);
        }//end of if statment

        String eng_text=getArguments().getString("eng_text");
        String kis_text=getArguments().getString("kis_text");

        if(textlanguage.equals(" Kiswahili / English "))
        {


            tveng.setText(eng_text);
            tvkis.setText(kis_text);

        }
        else if(textlanguage.equals(" English "))
        {
            tveng.setText(eng_text);
            tveng.setWidth(getResources().getDisplayMetrics().widthPixels);
            linesparet.setVisibility(View.INVISIBLE);
            tvkis.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tvkis.setVisibility(View.INVISIBLE);
        }
        else if(textlanguage.equals(" Kiswahili "))
        {
            tvkis.setText(kis_text);
            tvkis.setWidth(getResources().getDisplayMetrics().widthPixels);
            linesparet.setVisibility(View.INVISIBLE);
            tveng.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tveng.setVisibility(View.INVISIBLE);
        }

        return view;
    }//end of method

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
        void changeTitle(String text);
    }
}
