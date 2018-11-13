package io.github.ytam.customtoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends Toast {

    public CustomToast(Context context) {
        super(context);
    }

    /**
     * Show success toast message.
     *
     * @param context a {@link Context} object.
     * @param message
     * @param duration
     * @return success toast message.
     */
    public static Toast success(Context context,String message,int duration){

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout=(LinearLayout) layout.findViewById(R.id.toast_layout);
        ImageView img=(ImageView) layout.findViewById(R.id.toast_icon);
        l1.setText(message);
        linearLayout.setBackgroundResource(R.drawable.bg_success);
        img.setImageResource(R.drawable.ic_done_black_24dp);
        toast.setView(layout);
        toast.show();
        return toast;
    }

    /**
     * Show error toast message.
     *
     * @param context a {@link Context} object.
     * @param message
     * @param duration
     * @return error toast message.
     */
    public static Toast error(Context context,String message,int duration){

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout=(LinearLayout) layout.findViewById(R.id.toast_layout);
        ImageView img=(ImageView) layout.findViewById(R.id.toast_icon);
        l1.setText(message);
        linearLayout.setBackgroundResource(R.drawable.bg_error);
        img.setImageResource(R.drawable.ic_error_black_24dp);
        toast.setView(layout);
        toast.show();
        return toast;
    }

    /**
     * Show info toast message.
     *
     * @param context a {@link Context} object.
     * @param message
     * @param duration
     * @return info toast message.
     */
    public static Toast info(Context context,String message,int duration){

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout=(LinearLayout) layout.findViewById(R.id.toast_layout);
        ImageView img=(ImageView) layout.findViewById(R.id.toast_icon);
        l1.setText(message);
        linearLayout.setBackgroundResource(R.drawable.bg_info);
        img.setImageResource(R.drawable.ic_info_black_24dp);
        toast.setView(layout);
        toast.show();
        return toast;
    }

    /**
     * Show warning toast message.
     *
     * @param context a {@link Context} object.
     * @param message
     * @param duration
     * @return warning toast message.
     */
    public static Toast warning(Context context,String message,int duration){

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout=(LinearLayout) layout.findViewById(R.id.toast_layout);
        ImageView img=(ImageView) layout.findViewById(R.id.toast_icon);
        l1.setText(message);
        linearLayout.setBackgroundResource(R.drawable.bg_warning);
        img.setImageResource(R.drawable.ic_warning_black_24dp);
        toast.setView(layout);
        toast.show();
        return toast;
    }

    /**
     * Show normal system toast message.
     *
     * @param context a {@link Context} object.
     * @param message
     * @param duration
     * @return normal system toast message.
     */
    public static Toast normal(Context context,String message,int duration){

        Toast toast = Toast.makeText(context, message, duration);
        View view = toast.getView();
        TextView text = (TextView) view.findViewById(android.R.id.message);
        toast.setText(text.getText());
        toast.show();

        return toast;
    }

    /**
     * Show custom icon and custom color toast message.
     *
     * @param context a {@link Context} object.
     * @param message
     * @param duration
     * @param color
     * @param ImageResource
     * @return  custom icon and custom color toast message.
     */
    public static Toast iconToast(Context context,String message,int duration,int color,int ImageResource){

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        layout.setBackgroundColor(color);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout=(LinearLayout) layout.findViewById(R.id.toast_layout);
        ImageView img=(ImageView) layout.findViewById(R.id.toast_icon);
        l1.setText(message);
        img.setImageResource(ImageResource);
        linearLayout.setBackgroundColor(color);

        toast.setView(layout);
        toast.show();
        return toast;
    }
}
