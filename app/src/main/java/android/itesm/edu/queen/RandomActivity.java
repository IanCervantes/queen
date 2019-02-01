package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {
    private TextView textView;
    private String[] canciones={"Under Pressure","Bohemian Rhapsody","We are the Champions","A Kind of Magic","Don't Stop Me Now",
    "Killer Queen","We will Rock You","Another One Bites the Dust","Somebody to Love","I Want to Break Free","I Want it All"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }
    public void done(View view){
        Intent intent = new Intent();
        int random=(int)(Math.random()* canciones.length);
        String value = canciones[random];
        ((TextView)findViewById(R.id.textView)).setText(value);
        intent.putExtra("random", value);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}
