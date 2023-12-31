package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        EditText playerOne=findViewById(R.id.playerOne);
        EditText playerTwo=findViewById(R.id.playerTwo);
        Button startGameButton=findViewById(R.id.startGameButton);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getPLayerOneName=playerOne.getText().toString();
                String getPLayerTwoName=playerTwo.getText().toString();

                if(getPLayerOneName.isEmpty() || getPLayerTwoName.isEmpty()){
                    Toast.makeText(AddPlayers.this,"Please enter player name",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(AddPlayers.this, MainActivity.class);
                    intent.putExtra("playerOne",getPLayerOneName);
                    intent.putExtra("playerTwo",getPLayerTwoName);
                    startActivity(intent);


                }
            }
        });

    }
}