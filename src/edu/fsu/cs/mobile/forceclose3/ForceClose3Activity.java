package edu.fsu.cs.mobile.forceclose3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ForceClose3Activity extends Activity {
	
	Button mButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mButton = (Button) findViewById(R.id.button1);
        mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ForceClose3Activity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
    }
}