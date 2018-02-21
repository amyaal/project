package com.example.m.myapplication


import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_2.*
import android.view.View
import java.lang.Exception
import java.util.jar.Manifest

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
per()
    }
    fun per(){
      if (ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED){

          if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)){


          }
          else{
              ActivityCompat.requestPermissions(this,arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),30 )

          }
      }



    }
   fun button2 (view:View){

       // but function to upload cv
       val int = Intent(Intent.ACTION_PICK, MediaStore.Files.Media.EXTERNAL_CONTENT_URI)
       startActivityForResult(int,50)
   }
  override fun onActivityResult (requestCode:Int,resultCode:Int,data:Intent?) {

      super.onActivityResult(requestCode,resultCode,data)

      if (requestCode == 50&& resultCode == Activity.RESULT_OK) {
       try{   val e = data!!.data
          button2.setFileUri(e)


      }catch (rx:Exception){
       }
      }
  }

    fun button3 (view:View) {
        var intent = Intent (this,Upload::class.java)
        startActivity(intent)
    }









}

