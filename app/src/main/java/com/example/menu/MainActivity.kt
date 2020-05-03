package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate: MenuInflater = menuInflater
        inflate.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == R.id.menu) {
//            Toast.makeText(
//                this, "hello you clicked menu",
//                Toast.LENGTH_SHORT
//            ).show()
//            return true
//        }
//            else if (item.itemId == R.id.settings){
//                Toast.makeText(
//                    this, "hello you clicked settings",
//                    Toast.LENGTH_SHORT
//                ).show()
//        }
//        return super.onOptionsItemSelected(item)}

        when (item.itemId) {
            R.id.menu -> {
//                Toast.makeText(
//                    this, "hello you clicked menu",
//                    Toast.LENGTH_LONG).show()
//               AlertDialog.Builder(this)
//                    .setTitle("menu")
//                    .setMessage("you choose menu")
//                    .setNeutralButton("okay,",null)
//                    .show()
                toast("hello from home")
                alert ("welcome to menu"){
                    title="Menu"
                    positiveButton("okay"){
                        toast("okay clicked")
                    }
                    negativeButton( "cancel"){
                        toast("cancel clicked")
                    }
                }.show()
            }
            R.id.settings->{
//                Toast.makeText(
//                    this,"hello you clicked settings",
//                    Toast.LENGTH_SHORT).show()
//                AlertDialog.Builder(this)
//                    .setTitle("menu")
//                    .setMessage("you choose settings")
//                    .setNeutralButton("okay,",null)
//                    .show()
                alert ("welcome to settings"){
                    title="Menu"
                    positiveButton("okay"){
                        toast("okay clicked")
                    }
                    negativeButton( "cancel"){
                        toast("cancel clicked")
                    }
                }.show()
            }
            R.id.call->{
                sendSMS("rada")

            }
            R.id.google->{
                browse("https://google.com")
            }
            R.id.Instagram->{
                browse("https://instagram.com/challoh_")
            }
            R.id.youtube->{
            browse("https://youtube.com")
        }
        }
        return super.onOptionsItemSelected(item)
        }
    }



