package com.librarycheckpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/*import org.xwalk.core.XWalkHttpAuthHandler;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;*/


public class Main1Activity extends AppCompatActivity {
   /* private XWalkView xWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);*/
      /*  xWalkWebView = (XWalkView) findViewById(R.id.xwalkWebView);
        xWalkWebView.load("https://mail.zoho.com/zm/#mail/folder/inbox", null);

        // turn on debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
        xWalkWebView.setUIClient(new XWalkUIClient(xWalkWebView) {
            public boolean onConsoleMessage(ConsoleMessage cm) {
                Log.e("MyApplication", cm.message() + " -- From line "
                        + cm.lineNumber() + " of "
                        + cm.sourceId());
                return true;
            }

            @Override
            public void onPageLoadStarted(XWalkView view, String url) {
                System.out.println("onPageLoadStarted  " + url);
            }

            @Override
            public void onPageLoadStopped(XWalkView view, String url,
                                          XWalkUIClient.LoadStatus status) {
                System.out.println("onPageLoadStopped  " + status);
            }
        });
        xWalkWebView.setResourceClient(new XWalkResourceClient(xWalkWebView) {
            @Override
            public void onReceivedHttpAuthRequest(XWalkView view, XWalkHttpAuthHandler handler, String host, String realm) {
                System.out.println("onReceivedHttpAuthRequest");
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        if (xWalkWebView != null) {
            xWalkWebView.pauseTimers();
            xWalkWebView.onHide();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (xWalkWebView != null) {
            xWalkWebView.resumeTimers();
            xWalkWebView.onShow();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (xWalkWebView != null) {
            xWalkWebView.onDestroy();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (xWalkWebView != null) {
            xWalkWebView.onActivityResult(requestCode, resultCode, data);
        }
    }

    protected void onNewIntent(Intent intent) {
        if (xWalkWebView != null) {
            xWalkWebView.onNewIntent(intent);
        }*/
        //Declaring our ImageView
        private ImageView imageView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main1);

            //Initializing the ImageView
            imageView = (ImageView) findViewById(R.id.imageView);

            //Loading Image from URL
            Picasso.with(this)
                    .load("https://www.simplifiedcoding.net/wp-content/uploads/2015/10/advertise.png")
                    .placeholder(R.drawable.placeholder)   // optional
                    .error(R.drawable.wrong)      // optional
                    .resize(400,400)                        // optional
                    .into(imageView);
        }
    }

