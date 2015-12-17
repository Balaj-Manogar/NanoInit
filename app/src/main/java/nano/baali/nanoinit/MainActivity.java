package nano.baali.nanoinit;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button spotify, scores, library, bigger, bacon, myApp;

        spotify = (Button) findViewById(R.id.spotify);
        scores = (Button) findViewById(R.id.scores);
        library = (Button) findViewById(R.id.library);
        bigger = (Button) findViewById(R.id.bigger);
        bacon = (Button) findViewById(R.id.bacon);
        myApp = (Button) findViewById(R.id.myApp);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        bigger.setOnClickListener(this);
        bacon.setOnClickListener(this);
        myApp.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v)
    {
        Context context = getApplicationContext();
        String message;

        switch (v.getId())
        {
            case R.id.spotify:
                message = "This button will launch my Spotify app";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                message = "This button will launch my Scores app";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                message = "This button will launch my Library app";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.bigger:
                message = "This button will launch my Build It Bigger app";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.bacon:
                message = "This button will launch my Bacon Reader app";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.myApp:
                message = "This button will launch my Capstone app";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
