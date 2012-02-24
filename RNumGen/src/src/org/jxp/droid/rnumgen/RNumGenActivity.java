package org.jxp.droid.rnumgen;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class RNumGenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView numtv = (TextView) findViewById(R.id.textViewNum);
        numtv.setText(gen(1) + "!");
        Button sdhandle = (Button) findViewById(R.id.button1);
        sdhandle.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				makegen(v);
				
			}
		});
    }

	private String gen(int seed) {
		Random randomizer = new Random(seed);
		int randomnum = randomizer.nextInt();
		String result = Integer.toString(randomnum);
		return result;
	}
	
	private void makegen(View v) {
		EditText seed = (EditText) findViewById(R.id.editText1);
		Editable seededitable = seed.getText();
		String seedstring = seededitable.toString();
		int seednum = Integer.parseInt(seedstring);
		TextView numtv = (TextView) findViewById(R.id.textViewNum);
		numtv.setText(gen(seednum) + "!");
	}
}