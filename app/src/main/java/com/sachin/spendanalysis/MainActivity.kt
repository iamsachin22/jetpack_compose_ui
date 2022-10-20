package com.sachin.spendanalysis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sachin.spendanalysis.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpendAnalysisTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SpendAnalysis()
                }
            }
        }
    }
}

@Composable
fun SpendAnalysis(){
    Column(modifier = Modifier.background(Green200).padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)) {
            Column {
                Text(text = "User Name",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 24.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Hi Welcome Back ! ",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 20.sp)
            }
                Spacer(modifier = Modifier.width(90.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_men),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp, top = 10.dp)
                        .size(50.dp)
                        .clip(CircleShape)
                        .border(2.dp, Green100, CircleShape)
                )
        }

        Card(
            modifier = Modifier
                .padding(8.dp),
            elevation = 4.dp,) {
            Row (verticalAlignment = Alignment.CenterVertically){
                Column(modifier = Modifier.padding(26.dp)) {
                    Text(text = "Account Balance",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "$ 20,000",
                        color= Green100,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 24.sp)
                }
                Image(painter = painterResource(id = R.drawable.ic_men),
                    contentDescription = null,
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth()
                        .size(64.dp))
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Card(elevation = 4.dp, modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.Add,
                        contentDescription = null,
                        tint = Blue100,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(64.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Gray, CircleShape))
                    Text(text = "New",fontWeight = FontWeight.Bold,
                        fontSize = 20.sp, color = Green100, modifier = Modifier.padding(8.dp))
                }
            }
            Card(elevation = 4.dp, modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.MoreVert,
                        contentDescription = null,
                        tint = Blue100,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(64.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Gray, CircleShape))
                    Text(text = "Spend",fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,color = Green100, modifier = Modifier.padding(8.dp))
                }
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Card(elevation = 4.dp, modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.Done,
                        contentDescription = null,
                        tint = Blue100,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(64.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Gray, CircleShape))
                    Text(text = "Borrow",fontWeight = FontWeight.Bold,
                        fontSize = 20.sp, color = Green100,modifier = Modifier.padding(8.dp))
                }
            }
            Card(elevation = 4.dp, modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.Notifications,
                        contentDescription = null,
                        tint = Blue100,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(64.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Gray, CircleShape))
                    Text(text = "Save",fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,color = Green100, modifier = Modifier.padding(8.dp))
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SpendAnalysisTheme {
        SpendAnalysis()
    }
}