package windows.example.m.cvandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
        FrameLayout app, about, portofolio, experience, contact, skill;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            app = findViewById(R.id.apps_info);
            about = findViewById(R.id.about_this);
            portofolio = findViewById(R.id.portofolio_this);
            experience = findViewById(R.id.experience);
            contact = findViewById(R.id.contact_this);
            skill = findViewById(R.id.skill_this);

            app.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent app_intent = new Intent(MainActivity.this, AppsInfoActivity.class);
                    startActivity(app_intent);
                }
            });
            about.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent about_intent = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(about_intent);
                }
            });
            portofolio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent porto_intent = new Intent(MainActivity.this, WebActivity.class);
                    startActivity(porto_intent);
                }
            });
            experience.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent exp_intent = new Intent(MainActivity.this, ExpActivity.class);
                    startActivity(exp_intent);
                }
            });
            contact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent contact_intent = new Intent(MainActivity.this, ContactActivity.class);
                    startActivity(contact_intent);
                }
            });
            skill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent skill_intent = new Intent(MainActivity.this, SkillActivity.class);
                    startActivity(skill_intent);
                }
            });
        }

    }


