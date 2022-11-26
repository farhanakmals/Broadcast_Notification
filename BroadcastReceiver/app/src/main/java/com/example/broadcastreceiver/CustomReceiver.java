package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String intenAction = intent.getAction();
        if(intenAction != null) {
            String toastMessage = "Unknow";
            switch (intenAction){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "power connected";
                    break;

                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "power disconnected";
                    break;

                    //case MainActivity.ACTION_CUSTOM_BROADCAST:
                case "action-custom-broadcast":
                    toastMessage = "BROADCAST";
                    break;
            }

            Toast.makeText(context,toastMessage,Toast.LENGTH_SHORT).show();
        }
    }
}
