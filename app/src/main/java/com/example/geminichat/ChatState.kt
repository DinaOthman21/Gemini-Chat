package com.example.geminichat

import android.graphics.Bitmap
import com.example.geminichat.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)