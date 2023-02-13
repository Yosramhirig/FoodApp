package com.example.feb13


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.feb13.ui.theme.Feb13Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Feb13Theme() {
                Column(modifier = Modifier
                    .background(Color(32, 76, 59, 255))
                    .fillMaxSize()
                    .paint(
                        painter = painterResource(R.drawable.rectangle_17),
                        contentScale = ContentScale.Crop
                    )

                )
                {
                    Row() {
                        Image(
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(10.dp, 10 .dp, 310.dp, 10.dp)

                        .paint(
                            painter = painterResource(R.drawable.back)
                        ))

                        Image(
                            painter = painterResource(id = R.drawable.group_1),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(10.dp)

                                .paint(
                                    painter = painterResource(R.drawable.group_1)
                                ))
                    }
//                Image(
//                    painter = painterResource(id = R.drawable.ggg),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .padding(0.dp)
//                        .fillMaxWidth()
//                        .fillMaxHeight()
//                        .paint(
//                            painter = painterResource(R.drawable.ggg)
//                        )
////                        .fillMaxSize()
//
//                )


                    Card(modifier = Modifier
                        .fillMaxSize()
                        .padding(0.dp, 250.dp, 0.dp, 0.dp),
                        shape = RoundedCornerShape(46.dp , 46.dp, 0.dp, 0.dp)

                        )
                    {
                        Row(
                            modifier = Modifier
                                .padding(40.dp, 40.dp, 40.dp, 40.dp),
                        ) {
                            Text(
                                modifier = Modifier,
                                color = Color(64, 106, 82, 255),
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold,
                                text = "Borsch",
                            )


                        }
                        Row(
                            modifier = Modifier
                                .padding(40.dp, 75.dp, 40.dp, 40.dp),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.vector),
                                contentDescription = null,
                            )
                            Image(
                                painter = painterResource(id = R.drawable.vector),
                                contentDescription = null,
                            )
                            Image(
                                painter = painterResource(id = R.drawable.vector),
                                contentDescription = null,
                            )
                            Image(
                                painter = painterResource(id = R.drawable.vector),
                                contentDescription = null,
                            )
                            Image(
                                painter = painterResource(id = R.drawable.vector__2_),
                                contentDescription = null,
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(40.dp, 100.dp, 40.dp, 40.dp),
                        ) {
                            Text(
                                modifier = Modifier,
                                color = Color(64, 106, 82, 255),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                text = "$11.99",
                            )


                        }
                        Row(
                            modifier = Modifier
                                .padding(40.dp, 130.dp, 40.dp, 40.dp),
                        ) {
                            Text(
                                modifier = Modifier,
                                color = Color(153, 153, 153, 255),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                text = "About",
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(40.dp, 170.dp, 20.dp, 40.dp)
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(320.dp, 66.dp),
                                shape = RoundedCornerShape(30.dp, 30.dp, 30.dp, 30.dp),
                                backgroundColor = Color(236, 236, 236, 255),

                                ) {
                                Text(
                                    modifier = Modifier.padding(10.dp, 10.dp, 5.dp, 0.dp),
                                    color = Color(64, 106, 82, 255),

                                    fontSize = 14.sp,


                                    text = "Hot dressing soup based on beetroot, which gives the characteristic red color."
                                )
                            }
                        }

                        Row(
                            modifier = Modifier
                                .padding(40.dp, 260.dp, 40.dp, 40.dp),
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(0.dp, 0.dp, 40.dp, 0.dp),
                                painter = painterResource(id = R.drawable.frame_87),
                                contentDescription = null,

                                )
                            Image(
                                painter = painterResource(id = R.drawable.frame_88),
                                contentDescription = null,
                            )


                            ////////////////////////////////


                        }
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 340.dp, 0.dp, 0.dp),
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.frame_95),
                                contentDescription = null,
                            )
                        }
                    }





                }



                ////////////////////////////////////////////////////////////////
                
            }
              }

    }
}

@Composable
fun Greeting(name: String) {

    Text(
        text = "Hello $name!"
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Feb13Theme {
        Greeting("Yosra")
    }
}