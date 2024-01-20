package com.example.kaspresso

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    var counterText = KTextView { withId(R.id.counter) }
    var incrementButton = KButton { withId(R.id.increment) }
    var decrementButton = KButton { withId(R.id.decrement) }
    var clearButton = KButton { withId(R.id.clear) }
}