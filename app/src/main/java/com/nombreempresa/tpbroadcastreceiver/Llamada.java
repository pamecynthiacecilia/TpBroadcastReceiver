package com.nombreempresa.tpbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;


    public class Llamada extends BroadcastReceiver {


        @Override
        public void onReceive(Context context, Intent intent) {

            boolean c = intent.getExtras().getBoolean("connected");
            //intent.getAction().equals(Intent.ACTION_POWER_CONNECTED);


            if(c) {
                //lo que quiero hacer cuando se produzca el evento
                Toast.makeText(context, "detección de USB, inicio de llamada", Toast.LENGTH_LONG).show();
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 02657611047"));
                context.startActivity(i);
            }

        }







}
