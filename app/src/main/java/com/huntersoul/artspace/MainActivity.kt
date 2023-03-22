package com.huntersoul.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
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
fun ArtSpace(modifier: Modifier = Modifier,){
    var index by remember { mutableStateOf(0) }
    val images = listOf(R.drawable.artpic1, R.drawable.artpic2, R.drawable.artpic3, R.drawable.artpic4, R.drawable.artpic5)
    val names = listOf(R.string.picname1,R.string.picname2,R.string.picname3,R.string.picname4,R.string.picname5)
    val autor = listOf(R.string.autor1,R.string.autor2,R.string.autor3,R.string.autor4,R.string.autor5)
    //
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = images[index]), contentDescription = null)
            Text(text = stringResource(id = names[index]))
            Text(text = stringResource(id = autor[index]))
            Spacer(
                modifier = Modifier.height((16.dp))
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = {
                        if (index == 0) {
                            index = (4)
                        } else {
                            index = (index - 1)
                        }
                    },
                    modifier = Modifier.size(120.dp, 40.dp),
                ) { Text(stringResource(R.string.preview)) }
                Button(
                    onClick = {
                        if (index==4){
                            index = (0)
                        }else{
                            index = (index + 1)
                        }
                    },
                    modifier = Modifier.size(120.dp, 40.dp)
                ) { Text(stringResource(R.string.next)) }
            }
        }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpace()
    }
}