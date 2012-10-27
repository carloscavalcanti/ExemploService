package com.example.exemploservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button btnExecutarServico;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExecutarServico = (Button) findViewById(R.activity_main.btnExecutarServico);
        btnExecutarServico.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		Intent intent = new Intent("SERVICE1");
		startService(intent);
	}

    
}
