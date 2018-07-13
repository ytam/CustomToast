package io.github.ytam.customtoast;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class CustomToast {

    public static void customToast(Context context, String message){


        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        View view = toast.getView();
        view.setBackgroundResource(R.drawable.custom_background);
//        TextView text = (TextView) view.findViewById(android.R.id.message);findViewById
        /*Here you can do anything with above textview like text.setTextColor(Color.parseColor("#000000"));*/
        toast.show();
    }

}
