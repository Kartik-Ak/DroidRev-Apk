package ReverseME

import ViewModel.RView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.reverse_me.R
import com.example.reverse_me.ui.theme.message
import kotlinx.coroutines.launch

@Composable
fun Loginme(
    view: RView,
    navcontroller: NavHostController
){
    val f = FontFamily(Font(R.font.f1))
    val s = FontFamily(Font(R.font.s1))

    Column(Modifier.fillMaxSize().background(
        brush = Brush.verticalGradient(
            colors = listOf(Color(0xFF9D0000), Color(0xFF000000))
        )
    ).padding(25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        val snackbarHostState = remember { SnackbarHostState() }
        val scope = rememberCoroutineScope()
        val  mypass  = stringResource(R.string.Password)


        Text("\nChallenge 1 ", fontSize = 22.sp, color = Color.White, fontWeight = FontWeight.Bold, fontFamily = s)
              Spacer(Modifier.height(15.dp))
        Text(stringResource(R.string.Task), fontSize = 20.sp,color=Color.White, fontFamily = f)

        Column(Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            SnackbarHost(hostState = snackbarHostState)
            Spacer(Modifier.height(15.dp))

            Mytext("Username",
                view.username,
                onValueChange = {view.username=it})


            Spacer(Modifier.height(15.dp))


            Mytext("Password",
                value = view.password,
                onValueChange = {view.password=it})


            Spacer(Modifier.height(30.dp))

            Button(onClick = {
                if (view.username == "Kartik" && view.password == mypass) {
                    navcontroller.navigate("Pass")
                }else{

                    scope.launch {
                        snackbarHostState.showSnackbar(" Wrong Nooby try again 🎃 ")
                    }

                }
            },
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color(0xFF73153B)
                )) {

                Text("Submit")

            }

        }

    }

}


@Composable
fun Mytext(
    name : String,
    value: String,
    onValueChange: (String) -> Unit = {},


){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {Text(name, color = Color.White)},
        singleLine = true,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            cursorColor = Color.White,
            focusedBorderColor = Color(0xFFFFFBFB),
            unfocusedBorderColor = Color.White,
            focusedLeadingIconColor = Color.White,
            focusedTextColor = Color(0xFF0FBE20),
            unfocusedTextColor = Color(0xFFFFFFFF),
            focusedPlaceholderColor = Color.White,
            unfocusedPlaceholderColor = Color(0xFFFFFFFF),
            )

    )
}


@Composable
fun HiddenScreen(){
    val f = FontFamily(Font(R.font.f1))
    val s = FontFamily(Font(R.font.s1))
    Box(Modifier.fillMaxSize()){
        Image(painter = painterResource(R.drawable.news),
            contentDescription = "null",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize())

        Column(Modifier.fillMaxSize().padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text("\nMission Successful", fontWeight = FontWeight.Bold, fontSize = 24.sp, color = Color.White, fontFamily = s )


            Column(Modifier.fillMaxSize().padding(20.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        containerColor = Color(0xFF038F20)
                    ),
                    modifier = Modifier.width(200.dp)) {
                    Text("Hack on")
                }
            }
        }
        Column(Modifier.fillMaxSize().padding(10.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {

            val message = message()
            Spacer(Modifier.height(80.dp))
            Text(message.ss, fontSize = 14.sp, color = Color.White, fontFamily = f)
            Text(message.f, fontSize = 14.sp, color = Color.White, fontFamily = f)
        }

    }
}