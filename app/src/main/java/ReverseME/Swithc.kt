package ReverseME

import androidx.compose.foundation.Image
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.reverse_me.R

@Composable
fun Screens(navController: NavController){
    val f = FontFamily(Font(R.font.f1))
    val s = FontFamily(Font(R.font.s1))
Box(Modifier.fillMaxSize().background(color = Color.Black)){}
    Column(Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally){

        Spacer(Modifier.height(50.dp))

       Text("Challenge 3 ", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White, fontFamily = s)
        Text("\nFind the Hidden Screen  ", fontSize = 16.sp, color = Color.White, fontFamily = f)
        Text("\nWe have left a message for you",fontSize = 16.sp, color = Color.White)

    }

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Button(onClick = {navController.navigate("Normal")},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFF6800B2)
            )) {

            Text("Let's Go")

        }
    }
}

@Composable
fun NormalScreen(){
Box(Modifier.fillMaxSize()){
    Image(painter = painterResource(R.drawable.mm),
        contentDescription = "Null",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize())
}
}



@Composable
@Preview(showBackground = true, showSystemUi = true)
fun  Preview(){
    NormalScreen()
}
