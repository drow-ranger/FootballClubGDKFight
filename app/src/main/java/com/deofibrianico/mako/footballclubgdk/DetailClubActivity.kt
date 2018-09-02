package com.deofibrianico.mako.footballclubgdk

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import org.jetbrains.anko.*

class DetailClubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var namaClub = intent.getStringExtra("name")
        var imageClub = intent.getIntExtra("image", 0)
        DetailActivityUI().setContentView(this)

        toast(namaClub)

        verticalLayout{

            imageView(imageClub).
                    lparams(width= matchParent, height = 500) {
                        padding = dip(20)
                        margin = dip(15)
                    }

            textView(namaClub).
                    lparams(width = matchParent){
                        gravity = Gravity.CENTER
                    }
        }
    }

    class DetailActivityUI() : AnkoComponent<DetailClubActivity> {
        //        override fun createView(ui: AnkoContext<DetailClubActivity>): View {
        override fun createView(ui: AnkoContext<DetailClubActivity>) = with(ui){

            verticalLayout {

            }
        }
    }
}