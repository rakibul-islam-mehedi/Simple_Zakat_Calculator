package com.lamusoft.simplezakatcalculator;

import static androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout obosthan, adaikarir_hukum, hikmat, fozilat, condition, aday;
    TextView obosthanD, adaikarir_hukumD, hikmatD, fozilatD, conditionD,  adayD;
    ImageView dropdownBtn1, dropdownBtn2, dropdownBtn3, dropdownBtn4, dropdownBtn5, dropdownBtn6;
    CardView card1, card2, card3, card4, card5, card6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.white));
            setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

            initialize();

            doWork(obosthan, obosthanD, dropdownBtn1, card1);
            doWork(adaikarir_hukum, adaikarir_hukumD, dropdownBtn2, card2);
            doWork(fozilat, fozilatD, dropdownBtn3, card3);
            doWork(hikmat, hikmatD, dropdownBtn4, card4);
            doWork(condition, conditionD, dropdownBtn5, card5);
            doWork(aday, adayD, dropdownBtn6, card6);

            return insets;
        });
    }

    private void doWork(ConstraintLayout layout, TextView textView, ImageView dropdownBtn, CardView cardView){
        layout.setOnClickListener(v -> {
            int visibility = (textView.getVisibility() == View.GONE)? View.VISIBLE:View.GONE;
            textView.setVisibility(visibility);

            if (visibility == View.GONE){
                dropdownBtn.setImageResource(R.drawable.down);
            } else {
                dropdownBtn.setImageResource(R.drawable.up_arrow);
            }
            cardView.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        });
    }
    private void initialize() {
        obosthan = findViewById(R.id.obosthan);
        obosthanD = findViewById(R.id.obosthanD);
        dropdownBtn1 =findViewById(R.id.dropdownBtn1);

        adaikarir_hukum = findViewById(R.id.adaikarir_hukum);
        adaikarir_hukumD = findViewById(R.id.adaikarir_hukumD);
        dropdownBtn2 =findViewById(R.id.dropdownBtn2);

        hikmat = findViewById(R.id.hikmat);
        hikmatD = findViewById(R.id.hikmatD);
        dropdownBtn3 =findViewById(R.id.dropdownBtn3);

        fozilat = findViewById(R.id.fozilat);
        fozilatD = findViewById(R.id.fozilatD);
        dropdownBtn4 =findViewById(R.id.dropdownBtn4);

        condition = findViewById(R.id.condition);
        conditionD = findViewById(R.id.conditionD);
        dropdownBtn5 =findViewById(R.id.dropdownBtn5);

        aday = findViewById(R.id.aday);
        adayD = findViewById(R.id.adayD);
        dropdownBtn6 =findViewById(R.id.dropdownBtn6);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);

    }

}