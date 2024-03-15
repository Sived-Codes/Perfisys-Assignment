package prashant.synksys.perfisys.margh.model

import kotlin.random.Random

class QuoteData {

    companion object {
        private val imageUrlList = listOf(
            "https://i.pinimg.com/236x/c4/db/c9/c4dbc90643503737a9ad8d658e30b751--so-true-quotes-quotes-quotes.jpg",
            "https://e0.pxfuel.com/wallpapers/198/69/desktop-wallpaper-wisdom-words-of-wisdom-wisdom-and-words-wisdom-rainbow-quote-thumbnail.jpg",
            "https://e1.pxfuel.com/desktop-wallpaper/704/208/desktop-wallpaper-inspirational-and-motivational-quotes-phone-backgrounds-discipline-quote-phone-thumbnail.jpg",
            "https://e1.pxfuel.com/desktop-wallpaper/704/208/desktop-wallpaper-inspirational-and-motivational-quotes-phone-backgrounds-mobile-discipline-thumbnail.jpg",
            "https://e1.pxfuel.com/desktop-wallpaper/566/1000/desktop-wallpaper-seducing-michael-scofield-new-tattoo-bridesmaidsincorporated-thumbnail.jpg",
        )

        fun getList(): List<QuoteModel> {
            val dataList = mutableListOf<QuoteModel>()

            for (i in 1..10) { // Generating 10 QuoteModel objects for demonstration
                val imageUrl = getRandomImageUrl() // Get a random URL from the list
                val id = "ID_$i"
                dataList.add(QuoteModel(imageUrl, id))
            }

            return dataList
        }

        private fun getRandomImageUrl(): String {
            // Get a random index to select a URL from the list
            val randomIndex = Random.nextInt(imageUrlList.size)
            return imageUrlList[randomIndex]
        }
    }
}