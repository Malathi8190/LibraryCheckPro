package com.librarycheckpro;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

//import chehara.mylibapplication.MainActivity;


public class EXclass{
    public static void testToast(Context context, String Msg) {
        Toast.makeText(context, "library", Toast.LENGTH_LONG).show();    }
    public static void testActivity(Context context) {

        Intent intent = new Intent(context, Main1Activity.class);
        context.startActivity(intent);

    }
}

