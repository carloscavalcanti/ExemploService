package com.example.exemploservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

public class ExemploService extends Service implements Runnable {

	@Override
	public void onCreate() {
		super.onCreate();
		new Thread(this).start();
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// Não queremos interagir com o serviço...
		return null;
	}
	
	@Override
	public void run() {
		int contador = 1;
		Looper.prepare();
		while (true) {
			Log.i("ExemploService","Oi, sou um serviço! Numero " + contador);
			contador++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
