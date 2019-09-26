package windows.example.m.cvandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AppsInfoActivity extends AppCompatActivity {
    private RecyclerView rvApp;
    private ArrayList<App> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_info);

        rvApp = findViewById(R.id.rv_app);
        rvApp.setHasFixedSize(true);

        list.addAll(AppData.getListApp());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvApp.setLayoutManager(new LinearLayoutManager(this));
        ListAppAdapter ListInfoAdapter = new ListAppAdapter(list);
        rvApp.setAdapter(ListInfoAdapter);
    }

}
