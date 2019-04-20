package com.example.shameemkalluvalappil;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.kaopiz.kprogresshud.KProgressHUD;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class Key {
    public static final String OK = "OK";


    public static Calendar myCalendar;

    public static KProgressHUD hud1;



    public static String getformatedDate() {

        String pattern = "dd/MM/yyyy";
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }

    public static String getcurrentDate() {
        myCalendar = Calendar.getInstance();
        String myFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        String strDate = sdf.format(myCalendar.getTime());
        return strDate;
    }
    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }

    public static String getcurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
        String curndate = sdf.format(new Date());
        return curndate;
    }


    public static void kprogress_show(Context context) {
        hud1 = KProgressHUD.create(context)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Please wait")
                .setCancellable(true)
                .setAnimationSpeed(1)
                .setDimAmount(0.5f)
                .show();

    }

    public static void kprogressdismiss() {
        hud1.dismiss();
    }

}

