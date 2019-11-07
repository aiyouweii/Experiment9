package com.example.experiment9;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreat(){
        super.onCreate();
    }

    public int onStartCommand(Intent intent,int flags,int startID){
        return super.onStartCommand(intent,flags,startID);
    }

    public void onDestroy(){
        super.onDestroy();
    }
}
