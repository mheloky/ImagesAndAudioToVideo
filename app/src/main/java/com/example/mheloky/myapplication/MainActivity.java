package com.example.mheloky.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.util.ArrayList;

import DataLayer.*;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int RESULT_LOAD_IMAGE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void btnSelectImages_Click(View view){

        Intent intent=new Intent();
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,"Choose Files"),RESULT_LOAD_IMAGE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){


        if(intent.getClipData()!=null) {
            if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK) {



            }
        }
        else{
            if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK) {



                Cursor returnCursor =
                        getContentResolver().query(intent.getData(), null, null, null, null);
                returnCursor.moveToNext();
                int nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                Uri selectedImage = intent.getData();
                File f = new File(selectedImage.getPath());
                Toast.makeText(MainActivity.this, "Selected one Files" + f.getName()+"--"+returnCursor.getString(nameIndex), Toast.LENGTH_SHORT).show();
            }

        }


    }

    private String getRealPathFromURI(Context context, Uri contentUri) {
        Cursor cursor = null;
        try {
            String[] proj = { MediaStore.Images.Media.DATA };
            cursor = context.getContentResolver().query(contentUri,  proj, null, null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        } catch (Exception e) {
            return "No File Found";
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
