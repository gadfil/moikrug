package ru.moikrug.app.model

import org.simpleframework.xml.Root
import java.util.*

/**
 * Created by oleg on 04.06.2016.
 */

@Root(name = "rss")
data class Rss(val channel: RssChannel)

@Root(name = "channel")
data class RssChannel(val item: ArrayList<RssItem>)

@Root(name = "item")
data class RssItem(
        val title: String,
        val description: String,
        val author: String,
        val pubDate: String,
        val link: String,
        val guid: Long,
        val image: String
)