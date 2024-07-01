package com.example.hitomemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(context).apply {
            setContent {
                ThreeImagesLayout()
            }
        }
    }
}

@Composable
fun ThreeImagesLayout() {
    Box(modifier = Modifier.fillMaxSize()) {
        // 左上の画像
        Image(
            painter = painterResource(id = R.drawable.settings),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.TopStart)
        )

        // 左下の画像
        Image(
            painter = painterResource(id = R.drawable.create_new_folder),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.BottomStart)
        )

        // 右下の画像
        Image(
            painter = painterResource(id = R.drawable.person_add),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.BottomEnd)
        )
    }
}

@Preview
@Composable
fun PreviewThreeImagesLayout() {
    ThreeImagesLayout()
}