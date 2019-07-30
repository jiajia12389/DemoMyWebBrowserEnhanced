package sg.edu.rp.c346.demomywebbrowserenhanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import sg.edu.rp.c346.mywebbrowserenhanced.R;

public class MainActivity extends AppCompatActivity {

    Button btnloadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage = findViewById(R.id.webViewMyPage);
        btnloadURL = findViewById(R.id.buttonLoad);
        etURL = findViewById(R.id.etURL);

        wvMyPage.setWebViewClient(new WebViewClient());


        btnloadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = etURL.getText().toString();

                wvMyPage.loadUrl(url);

                wvMyPage.getSettings().setJavaScriptEnabled(true);
                wvMyPage.getSettings().setAllowFileAccess(false);
                wvMyPage.getSettings().setBuiltInZoomControls(true);

            }
        });
    }
}
