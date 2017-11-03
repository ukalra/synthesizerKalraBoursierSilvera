package com.pltw.example.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private final int HALF = 500;
    private final int QUA = 250;

    private static final String TAG = SynthesizerActivity.class.getName();
    private Button mEButton;
    private Button mFButton;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCS;
    private MediaPlayer mpD;
    private MediaPlayer mpDS;
    private MediaPlayer mpF;
    private MediaPlayer mpFS;
    private MediaPlayer mpG;
    private MediaPlayer mpGS;
    private MediaPlayer mphE;
    private MediaPlayer mphF;
    private MediaPlayer mphFS;
    private MediaPlayer mphG;
    private MediaPlayer mpE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        //mEButton = (Button)findViewById(R.id.eButton);
        //mFButton = (Button)findViewById(R.id.fButton);


        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mphE = MediaPlayer.create(this, R.raw.scalehighe);
        mphF = MediaPlayer.create(this, R.raw.scalehighf);
        mphFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mphG = MediaPlayer.create(this, R.raw.scalehighg);
    }

    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }
    public void firstChallenge(View v){ // Noah
        try {
            mpE.start();
            delayPlaying(HALF);
            mpFS.start();
            delayPlaying(HALF);
            mpG.start();
            delayPlaying(HALF);
            mpA.start();
            delayPlaying(HALF);
            mpB.start();
            delayPlaying(HALF);
            mpCS.start();
            delayPlaying(HALF);
            mpD.start();
            delayPlaying(HALF);
            mpE.start();
            delayPlaying(HALF);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void playTone(MediaPlayer mp, int time){
        try {
            mp.seekTo(0);
        mp.start();
            delayPlaying(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void firstVerse(){
        playTone(mpA, HALF);
        playTone(mpA, HALF);
        playTone(mphE, HALF);
        playTone(mphE, HALF);
        playTone(mphFS, HALF);
        playTone(mphFS, HALF);
        playTone(mphE, WHOLE_NOTE);
        playTone(mpD, HALF);
        playTone(mpD, HALF);
        playTone(mpCS, HALF);
        playTone(mpCS, HALF);
        playTone(mpB, HALF);
        playTone(mpB, HALF);
        playTone(mpA, WHOLE_NOTE);


    }
    public void secondChallenge(View v){ // Uday
            firstVerse();
    }
    public void secondVerse(){
        playTone(mphE, HALF);
        playTone(mphE, HALF);
        playTone(mpD, HALF);
        playTone(mpD, HALF);
        playTone(mpCS, HALF);
        playTone(mpCS, HALF);
        playTone(mpB, WHOLE_NOTE);


    }
    public void thirdChallenge(View v){  // Gustavo
        firstVerse();
        secondVerse();
        secondVerse();
        firstVerse();
    }

    public void onButtonAClick(View v){
        mpA.seekTo(0);
        mpA.start();
    }
    public void onButtonBClick(View v){
        mpB.seekTo(0);
        mpB.start();
    }
    public void onButtonBBClick(View v){
        mpBB.seekTo(0);
        mpBB.start();
    }
    public void onButtonCClick(View v){
        mpC.seekTo(0);
        mpC.start();
    }
    public void onButtonCSClick(View v){
        mpCS.seekTo(0);
        mpCS.start();
    }
    public void onButtonDClick(View v){
        mpD.seekTo(0);
        mpD.start();
    }
    public void onButtonDSClick(View v){
        mpDS.seekTo(0);
        mpDS.start();
    }
    public void onButtonEClick(View v){
        mpE.seekTo(0);
        mpE.start();
    }
    public void onButtonFClick(View v) {
        mpF.seekTo(0);
        mpF.start();
    }
    public void onButtonFSClick(View v){
        mpFS.seekTo(0);
        mpFS.start();
    }
    public void onButtonGClick(View v){
        mpG.seekTo(0);
        mpG.start();
    }
    public void onButtonGSClick(View v){
        mpGS.seekTo(0);
        mpGS.start();
    }
    public void onButtonhEClick(View v){
        mphE.seekTo(0);
        mphE.start();
    }
    public void onButtonhFClick(View v){
        mphF.seekTo(0);
        mphF.start();
    }
    public void onButtonhFSClick(View v){
        mphFS.seekTo(0);
        mphFS.start();
    }
    public void onButtonhGClick(View v){
        mphG.seekTo(0);
        mphG.start();
    }

}
