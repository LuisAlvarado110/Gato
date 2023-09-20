package uabc.luis.gatote

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate


class MainActivity : AppCompatActivity() {
    private var turnoJugador = true
    private var A1disp = true
    var A2disp = true
    var A3disp = true
    var B1disp = true
    var B2disp = true
    var B3disp = true
    var C1disp = true
    var C2disp = true
    var C3disp = true
//titulo.text =  simbolo2.text  <- extraer texto del elemento, recrear el objeto y acceder al elemento

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)
    }

    private fun presionarBoton(boton : Button){
        var texto = ""
        if (boton.isEnabled){
            boton.text = simbolizar()
            boton.isEnabled = false
            texto = boton.text as String
            comprobarGanador(texto)
        }
    }

    fun ponerSimboloA1(view : View): Boolean{
        if (A1disp){
            val simbolo: Button = findViewById(R.id.a1)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }

            A1disp = false
        }
        return A1disp
    }
    fun ponerSimboloA2(view : View): Boolean {
        if (A2disp){
            val simbolo: Button = findViewById(R.id.a2)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            A2disp = false
        }
        return A2disp
    }
    fun ponerSimboloA3(view : View):Boolean{
        if(A3disp){
            val simbolo: Button = findViewById(R.id.a3)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            A3disp = false
        }
        return A3disp

    }
    fun ponerSimboloB1(view : View):Boolean{
        if (B1disp){
            val simbolo: Button = findViewById(R.id.b1)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            B1disp = false
        }
        return B2disp
    }
    fun ponerSimboloB2(view : View):Boolean{
        if (B2disp){
            val simbolo: Button = findViewById(R.id.b2)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            B2disp = false
        }
        return B2disp
    }
    fun ponerSimboloB3(view : View):Boolean{
        if (B3disp){
            val simbolo: Button = findViewById(R.id.b3)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            B3disp = false
        }
        return B3disp
    }
    fun ponerSimboloC1(view : View):Boolean{
        if (C1disp){
            val simbolo: Button = findViewById(R.id.c1)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            C1disp = false
        }
        return C1disp
    }

    fun ponerSimboloC2(view : View):Boolean{
        if (C2disp){
            val simbolo: Button = findViewById(R.id.c2)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            C2disp = false
        }
        return C2disp
    }

    fun ponerSimboloC3(view : View):Boolean{
        if (C3disp){
            val simbolo: Button = findViewById(R.id.c3)
            presionarBoton(simbolo)
            if(!turnoJugador){
                //celuJugar(view)
                return true
            }
            C3disp = false
        }
        return C3disp
    }


    fun comprobarGanador(letra : String) {
        val simA1: Button = findViewById(R.id.a1)
        val simA2: Button = findViewById(R.id.a2)
        val simA3: Button = findViewById(R.id.a3)
        val simB1: Button = findViewById(R.id.b1)
        val simB2: Button = findViewById(R.id.b2)
        val simB3: Button = findViewById(R.id.b3)
        val simC1: Button = findViewById(R.id.c1)
        val simC2: Button = findViewById(R.id.c2)
        val simC3: Button = findViewById(R.id.c3)
        //comprobando renglones
        if (simA1.text.equals("$letra")&&simA2.text.equals("$letra")&&simA3.text.equals("$letra")||
            simB1.text.equals("$letra")&&simB2.text.equals("$letra")&&simB3.text.equals("$letra")||
            simC1.text.equals("$letra")&&simC2.text.equals("$letra")&&simC3.text.equals("$letra")){
            if ("$letra".equals("X")){
                //Gana jugador
                Toast.makeText(applicationContext, "Gana Jugador", Toast.LENGTH_LONG).show()
            }else{
                //Gana celu
                Toast.makeText(applicationContext, "Gana Celu",Toast.LENGTH_LONG).show()
            }
        }
        //comprobando columnas
        if (simA1.text.equals("$letra")&&simB1.text.equals("$letra")&&simC1.text.equals("$letra")||
            simA2.text.equals("$letra")&&simB2.text.equals("$letra")&&simC2.text.equals("$letra")||
            simA3.text.equals("$letra")&&simB3.text.equals("$letra")&&simC3.text.equals("$letra")){
            if ("$letra".equals("X")){
                //Gana jugador
                Toast.makeText(applicationContext, "Gana Jugador", Toast.LENGTH_LONG).show()
            }else{
                //Gana celu
                Toast.makeText(applicationContext, "Gana Celu",Toast.LENGTH_LONG).show()
            }
        }
        //comprobando diagonales
        if (simA1.text.equals("$letra")&&simB2.text.equals("$letra")&&simC3.text.equals("$letra")||
            simA3.text.equals("$letra")&&simB2.text.equals("$letra")&&simC1.text.equals("$letra")){
            if ("$letra".equals("X")){
                //Gana jugador
                Toast.makeText(applicationContext, "Gana Jugador", Toast.LENGTH_LONG).show()
            }else{
                //Gana celu
                Toast.makeText(applicationContext, "Gana Celu",Toast.LENGTH_LONG).show()
            }
        }
    }

    fun simbolizar(): String{//funcion que retorna el simbolo que se debe usar por turno
        
        if (turnoJugador){
            val simX = "X"
            turnoJugador = false
            return "$simX"
        }else{
            val simO = "O"
            turnoJugador = true
            return "$simO"
        }
    }

    fun celuJugar(view: View){ //celu jugando
        //val delay = (400L..2000L).random()
        var accionRealizada = false
        var num = 0
        do {
            num = rand(1, 9)
            when(num){
                1 -> accionRealizada = ponerSimboloA1(view)
                2 -> accionRealizada = ponerSimboloA2(view)
                3 -> accionRealizada = ponerSimboloA3(view)
                4 -> accionRealizada = ponerSimboloB1(view)
                5 -> accionRealizada = ponerSimboloB2(view)
                6 -> accionRealizada = ponerSimboloB3(view)
                7 -> accionRealizada = ponerSimboloC1(view)
                8 -> accionRealizada = ponerSimboloC2(view)
                9 -> accionRealizada = ponerSimboloC3(view)
            }
        }while (accionRealizada)


    }




    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }

    fun iniciar(view: View){
        val simA1: Button = findViewById(R.id.a1)
        val simA2: Button = findViewById(R.id.a2)
        val simA3: Button = findViewById(R.id.a3)
        val simB1: Button = findViewById(R.id.b1)
        val simB2: Button = findViewById(R.id.b2)
        val simB3: Button = findViewById(R.id.b3)
        val simC1: Button = findViewById(R.id.c1)
        val simC2: Button = findViewById(R.id.c2)
        val simC3: Button = findViewById(R.id.c3)
        simA1.text = " "
        simA2.text = " "
        simA3.text = " "
        simB1.text = " "
        simB2.text = " "
        simB3.text = " "
        simC1.text = " "
        simC2.text = " "
        simC3.text = " "
        simA1.setEnabled(true)
        simA2.setEnabled(true)
        simA3.setEnabled(true)
        simB1.setEnabled(true)
        simB2.setEnabled(true)
        simB3.setEnabled(true)
        simC1.setEnabled(true)
        simC2.setEnabled(true)
        simC3.setEnabled(true)
        A1disp = true
        A2disp = true
        A3disp = true
        B1disp = true
        B2disp = true
        B3disp = true
        C1disp = true
        C2disp = true
        C3disp = true
        turnoJugador = true
    }

}