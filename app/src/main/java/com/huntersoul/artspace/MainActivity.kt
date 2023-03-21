package com.huntersoul.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.huntersoul.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpace()
                }
            }
        }
    }
}
@Composable
fun ArtSpace(modifier: Modifier = Modifier){
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.artpic1), contentDescription = null)
            Text(text = stringResource(id = R.string.picname1))
            Text(text = stringResource(id = R.string.autor1))
            Spacer(
                modifier = Modifier.height((16.dp))
            )
            Row() {
                Button(onClick = { /*TODO*/ }) { Text(stringResource(R.string.preview)) }
                Button(onClick = { /*TODO*/ }) { Text(stringResource(R.string.next)) }
            }
        }



    //Button(
      //  onClick = {
        //    d1 = (1..6).random()
          //  d2 = (1..6).random()
        //}
    //) {
      //  Text(stringResource(R.string.roll))
    //}
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpace()
    }
}