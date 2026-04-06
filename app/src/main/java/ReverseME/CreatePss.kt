package ReverseME

import ViewModel.RView
import android.R
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun CreatePAss(cc: RView, navController: NavHostController){

    var  x = 150;

    val context = LocalContext.current
    Box(Modifier.fillMaxSize().background(
        brush = Brush.verticalGradient(
            colors = listOf(Color(0xFF006BC9), Color(0xFF3D0202))
        )
    )){}
    Column(Modifier.fillMaxSize().padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(Modifier.height(30.dp))
        Text("Challenge 2", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text("\n Create your own Username and password", fontSize = 16.sp, color = Color.White)
        Text("\nAlso change the value from 150 to 500",fontSize = 16.sp, color = Color.White)


    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var username by remember { mutableStateOf("") }
        var pass by remember { mutableStateOf("") }

        Text("Current  Value = ${x}", fontSize = 16.sp,  color = Color(0xFF03DAAF))

        Mytext(
            "Username",
            value = username,
            onValueChange = {username = it}
        )

        Spacer(Modifier.height(20.dp))

        Mytext(
            "Password",
            value = pass,
            onValueChange = {pass = it}
        )

        Spacer(Modifier.height(20.dp))

        Button(onClick = {
            if (username == cc.username && pass == cc.password  && x == 500) {
                navController.navigate("")
            }
            else{
                Toast.makeText(context,"❌ Oops babes ",Toast.LENGTH_LONG).show()
            }

        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            )
        )
         {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PRe(){
    CreatePAss(
        cc = RView(),
        navController = rememberNavController()
    )
}
