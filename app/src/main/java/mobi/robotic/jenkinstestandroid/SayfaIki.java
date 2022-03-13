package mobi.robotic.jenkinstestandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SayfaIki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa_iki);

        findViewById(R.id.btnIki).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SayfaIki.this, "Sayfa Iki", Toast.LENGTH_SHORT).show();
            }
        });
    }
}