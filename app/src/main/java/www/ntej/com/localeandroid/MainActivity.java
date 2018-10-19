package www.ntej.com.localeandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView localeTVandroid;
    TextView localeTVjava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localeTVandroid = findViewById(R.id.localeTVandroid);
        localeTVjava = findViewById(R.id.localeTVjava);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Locale currentLocaleAndroid = getResources().getConfiguration().locale;

        localeTVandroid.setText("Locale:" + currentLocaleAndroid.toString()+"\n"
                + "|Language:" + currentLocaleAndroid.getLanguage() + "(" + currentLocaleAndroid.getDisplayLanguage() + ")"+"\n"
                + "|country:" + currentLocaleAndroid.getCountry() + "(" + currentLocaleAndroid.getDisplayCountry() + ")");



        Locale currentLocaleJava = Locale.getDefault();

        localeTVjava.setText("Locale:" + currentLocaleJava.toString()+"\n"
                + "|Language:" + currentLocaleJava.getLanguage() + "(" + currentLocaleJava.getDisplayLanguage() + ")"+"\n"
                + "|country:" + currentLocaleJava.getCountry() + "(" + currentLocaleJava.getDisplayCountry() + ")");
    }

}
