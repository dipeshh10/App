package com.example.firstproject.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstproject.R
import com.example.firstproject.ui.theme.ui.theme.FirstprojectTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                LoginBody(innerPadding)
            }
        }
    }


}

@Composable
fun LoginBody(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            //method 1
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
//            tint = Color.Green,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Text(
                text = "Andrew",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
//                    textDecoration = TextDecoration.Underline
                )
            )
            //method 2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
//            tint = Color.Green,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.apple),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp).clip(
                        shape = RoundedCornerShape(100.dp)
                    )
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "174")
                Text(text = "Posts")
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "772k")
                Text(text = "Followers")
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )  {
                Text(text = "600k")
                Text(text = "Followings")
            }
        }
    }
}


@Preview
@Composable
fun PreviewBody() {
    LoginBody(innerPadding = PaddingValues(0.dp))
}