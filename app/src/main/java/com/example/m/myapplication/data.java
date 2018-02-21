package com.example.m.myapplication;

import android.content.Context;

/**
 * Created by m on 20/02/18.
 */

public class data extends Asynctask<string,Void,String > {
    Context ctx;
    data (Context ctx)
    {
      this.ctx=ctx;

    }
    protected Void  doInBackground  (String...Params) {
        String reg_url = "";
        String update_url = "";
        String method = Params [0];
        if (method.equal("available "))
        {

            String name = Params[1];
            String User_name = Params[2];
            String User_pass = Params[3];
            String email = Params[4];
            String phone = Params[5];

        }


    }



}
