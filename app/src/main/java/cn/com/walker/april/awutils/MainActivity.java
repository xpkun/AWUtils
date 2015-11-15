package cn.com.walker.april.awutils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.common.utils.RippleView.RippleView;

public class MainActivity extends Activity {
    RippleView mButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RippleView bl = null;
        setContentView(R.layout.activity_main);
        mButton = (RippleView)findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ripples Yo! :D", Toast.LENGTH_LONG).show();
            }
        });
    }
}
