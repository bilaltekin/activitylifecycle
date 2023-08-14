package mobil.tekin.com.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("cds","OnCreate çalıştı aktivite nesnesi oluşturuldu");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("cds","OnResume çalıştı aktivite nesnesi stackte ön plana geldi");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("cds","OnDestroy  çalıştı aktivite nesnesi yok ediildi");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("cds","OnPause çalıştı aktivite nesnesi stackte arka plana gitti");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("cds","OnRestart çalıştı aktivite nesnesi yeniden çalıştı");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("cds","Onstart çalıştı aktivite nesnesiçalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("cds","Onstop çalıştı aktivite nesnesi durdu");
    }
}
