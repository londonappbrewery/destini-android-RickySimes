package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyText;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 0 || mStoryIndex == 1){
                    storyText.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                }else if (mStoryIndex == 2){
                    storyText.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex== 0) {
                    storyText.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex++;
                }else if(mStoryIndex==1){
                    storyText.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                }else if (mStoryIndex == 2 || mStoryIndex == 3){
                    storyText.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

            }
        });

    }
}
