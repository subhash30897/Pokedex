package com.example.pokedex;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PokemonActivity extends AppCompatActivity {
  private TextView nameTextView;
  private TextView numberTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pokemon);

    String name = getIntent().getStringExtra("name");
    int number = getIntent().getIntExtra("number", 0);

    nameTextView = findViewById(R.id.pokemon_name);
    numberTextView = findViewById(R.id.pokemon_number);

    nameTextView.setText(name);
    numberTextView.setText(String.format("#%03d", number));

  }
}
