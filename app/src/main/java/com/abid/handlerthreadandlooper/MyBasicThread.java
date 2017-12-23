package com.abid.handlerthreadandlooper;

/**
 * Created by abid on 23/12/17.
 */

public class MyBasicThread extends Thread {
    DownloadThreadListener downloadThreadListener;
   public MyBasicThread(DownloadThreadListener downloadThreadListener){
       this.downloadThreadListener=downloadThreadListener;
   }
    @Override
    public void run() {
        super.run();
    }
}
