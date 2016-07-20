package com.mobstudio.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity
        extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        final Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        final Button scoreButton = (Button) findViewById(R.id.score_button);
        final Button libraryButton = (Button) findViewById(R.id.library_button);
        final Button biggerButton = (Button) findViewById(R.id.bigger_button);
        final Button readerButton = (Button) findViewById(R.id.reader_button);
        final Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        assert spotifyButton != null;
        spotifyButton.setOnClickListener(this);
        assert scoreButton != null;
        scoreButton.setOnClickListener(this);
        assert libraryButton != null;
        libraryButton.setOnClickListener(this);
        assert biggerButton != null;
        biggerButton.setOnClickListener(this);
        assert readerButton != null;
        readerButton.setOnClickListener(this);
        assert capstoneButton != null;
        capstoneButton.setOnClickListener(this);
    }

    /**
     * Respond to click events
     *
     * @param v get the view id to assert in which button is clicked
     */
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify_button:
                mySnackbar(R.string.spotify);
                break;
            case R.id.score_button:
                mySnackbar(R.string.score);
                break;
            case R.id.library_button:
                mySnackbar(R.string.library);
                break;
            case R.id.bigger_button:
                mySnackbar(R.string.bigger);
                break;
            case R.id.reader_button:
                mySnackbar(R.string.reader);
                break;
            case R.id.capstone_button:
                mySnackbar(R.string.capstone);
                break;
            default:
                throw new IllegalArgumentException("Something weird happened");
        }
    }

    /**
     * Creates a common Snackbar implementation
     *
     * @param i string of the title of the app project
     */
    private void mySnackbar(int i) {
        Snackbar
                .make(this.findViewById(android.R.id.content),
                        "This will open " + getResources().getString(i),
                        Snackbar.LENGTH_SHORT)
                .show();
    }
}
