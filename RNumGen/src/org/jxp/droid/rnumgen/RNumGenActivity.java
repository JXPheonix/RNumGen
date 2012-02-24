package org.jxp.droid.rnumgen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class RNumGenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView numtv = (TextView) findViewById(R.id.textViewNum);
        numtv.setText(gen() + "!");
        Button sdhandle = (Button) findViewById(R.id.sdhandle);
    }

	private String gen() {
		Random randomizer = new Random();
		int randomnum = randomizer.nextInt();
		String result = Integer.toString(randomnum);
		return result;
	}
	
	private void makegen(View v) {
		TextView numtv = (TextView) findViewById(R.id.textViewNum);
		numtv.setText(gen() + "!");
	}
}