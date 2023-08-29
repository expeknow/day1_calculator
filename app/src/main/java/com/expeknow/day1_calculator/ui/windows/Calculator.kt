package com.expeknow.day1_calculator.ui.windows

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.expeknow.day1_calculator.R
import com.expeknow.day1_calculator.ui.theme.anton


@OptIn(ExperimentalMaterial3Api::class, ExperimentalTextApi::class)
@Composable
fun Calculator() {

    var displayText by remember {
        mutableStateOf("")
    }

    Scaffold(
        Modifier
            .fillMaxSize(),
    containerColor = Color.Black) {
        Card(shape = RoundedCornerShape(30.dp),
        modifier = Modifier.padding(it),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )) {
            Column(
                Modifier
                    .padding(vertical = 20.dp, horizontal = 20.dp)
                    .background(Color.White)) {

                //heading and settings row
                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 10.dp, horizontal = 5.dp)) {
                    Text(text = "Simple Calc Using Figma Variables".uppercase(),
                    fontFamily = anton,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(4f),
                    letterSpacing = (-0.8).sp,
                    lineHeight = 45.sp,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, colorResource(id = R.color.gradient), Color.Black),
                            start = Offset(15f, 100f),
                            end = Offset(500f, 60f)
                        )
                    )
                    )

                    Button(onClick = {  },
                    contentPadding = PaddingValues(5   .dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                    ),
                    modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = R.drawable.gear_icon),
                            contentDescription = "settings icon",
                        )
                    }
                }


                //output display
                Card(shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 20.dp, horizontal = 5.dp),
                    colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.resultDisplay),

                )) {
                    Text(text = displayText,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Right,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 20.dp))
                }

                Column(Modifier.weight(1f)) {

                    val modifierForBtn = Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .padding(5.dp)
                    Row(
                        Modifier
                            .weight(1f)
                            .fillMaxWidth()) {

                        Button(modifier = modifierForBtn, onClick = { displayText += "1" },
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "1")
                        }

                        Button(modifier = modifierForBtn, onClick = {displayText += "2"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "2")
                        }
                        Button(modifier = modifierForBtn, onClick = {displayText += "3"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "3")
                        }
                        Button(modifier = modifierForBtn, onClick = {},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.operators),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "/")
                        }

                    }
                    Row(
                        Modifier
                            .weight(1f)
                            .fillMaxWidth()) {
                        Button(modifier = modifierForBtn, onClick = {displayText += "4"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "4")
                        }

                        Button(modifier = modifierForBtn, onClick = {displayText += "5"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "5")
                        }
                        Button(modifier = modifierForBtn, onClick = {displayText += "6"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "6")
                        }
                        Button(modifier = modifierForBtn, onClick = {},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.operators),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "x")
                        }
                    }
                    Row(
                        Modifier
                            .weight(1f)
                            .fillMaxWidth()) {
                        Button(modifier = modifierForBtn, onClick = {displayText += "7"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "7")
                        }

                        Button(modifier = modifierForBtn, onClick = {displayText += "8"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "8")
                        }
                        Button(modifier = modifierForBtn, onClick = {displayText += "9"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "9")
                        }
                        Button(modifier = modifierForBtn, onClick = {},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.operators),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "-")
                        }
                    }
                    Row(
                        Modifier
                            .weight(1f)
                            .fillMaxWidth(),
                        ) {
                        Button(modifier = modifierForBtn, onClick = {displayText = ""},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.clear),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "c")
                        }

                        Button(modifier = modifierForBtn, onClick = {displayText += "0"},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.numerics),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "0")
                        }
                        Button(modifier = modifierForBtn, onClick = {},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.operators),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "=")
                        }
                        Button(modifier = modifierForBtn, onClick = {},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.operators),
                                contentColor = Color.Black
                            )){
                            TextForButtons(text = "+")
                        }
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 20.dp)){
                    Divider(
                        Modifier
                            .weight(1f)
                            .padding(10.dp), thickness = 3.dp)
                    Text(text = "MADE WITH ",
                        fontSize = 14.sp, fontFamily = anton)
                    Icon(imageVector = Icons.Filled.Favorite, contentDescription = "love",
                        tint = Color.Red, modifier = Modifier.size(16.dp))
                    Divider(
                        Modifier
                            .weight(1f)
                            .padding(10.dp), thickness = 3.dp)
                }

            }
        }
    }
}


@Composable
fun TextForButtons(text: String){
    Text(text = text,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
    )
}
@Preview(showBackground = true)
@Composable
fun Preview() {
    Calculator()
}