package com.example.m.myapplication

import android.content.Context
import com.android.volley.Request
import com.android.volley.Response
import  com.android.volley.toolbox.StringRequest

/**
 * Created by m on 17/02/18.
 */
 class database  : StringRequest{

 companion object {
  private val dataname = ""
 }
 private var list :MutableMap<String,String> = HashMap()

 constructor (name:string,id:String,email:String,DateOfBirth:date, Phone:int,Code:String,listener:Response.Listener<String>)
         : super(Request.Method.POST,dataname,listener,null) {
list.put("name",name)
 list.put("id",id)
 list.put("email",email)
 list.put("DateOfBirth",DateOfBirth)
 list.put("Phone",Phone)
 list.put("Code",Code)
 }
override  fun getparams():MutableMap<String,String>{
 return list

}
}
