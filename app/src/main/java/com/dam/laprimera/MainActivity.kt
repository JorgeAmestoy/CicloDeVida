package com.dam.laprimera

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam.laprimera.ui.theme.LaPrimeraTheme

class MainActivity : ComponentActivity() {

//DEFINICION DE VARIABLES
   val TAG : String = "estado"
   val name : String ="Android"
//MIS METODOS (FUNCIONES)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaPrimeraTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting(name)
                }
            }
        }
        Log.d(TAG, "Estoy en on Create");
    }
    //SOBRESCRIBO METODOS DE LA CLASE ComponentActivity

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"He llegado al onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"He llegado al onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"He llegado al onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"He llegado al onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"He llegado al onDestroy")
    }


    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row {
        Column {
            Text(
                //Atributos separados por coma
                text = "Hello $name!",
                fontSize = 50.sp,
                color = Color.Blue,
                modifier = modifier
            )
            Text(
                //Atributos separados por coma
                text = "Holaa!",
                fontSize = 50.sp,
                color = Color.Blue,
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LaPrimeraTheme {
        Greeting("Android")
    }
}