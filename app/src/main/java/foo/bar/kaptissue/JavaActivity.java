package foo.bar.kaptissue;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;

/**
 * Created by Adrian Pascu on 04.07.2016.
 * mail@adipascu.ro
 */

final public class JavaActivity extends Activity {
    @BindView(R.id.automatic)
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(0);
        View x = findViewById(0);
        setContentView(x);

        String str = DaggerKotlinComponent.create().string();
    }
}
