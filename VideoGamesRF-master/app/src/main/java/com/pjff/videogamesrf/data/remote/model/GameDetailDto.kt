package com.pjff.videogamesrf.data.remote.model

import com.google.gson.annotations.SerializedName

data class GameDetailDto(

    /*Y aqui es cuando nos concentramos en al que le haremos click

    {
    "title": "Zelda: Breath of the wild",
    "image": "https://www.serverbpw.com/cm/games/imgs/zelda_botw.png",
    "long_desc": "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam volutpat metus
     in diam sceleorttitor malesuada consequat. Mauris arcu velit, aliquam in justo vel"
     }
    */
    /*  @SerializedName("title")
      var title: String? = null,
      @SerializedName("image")
      var image: String? = null,
      @SerializedName("long_desc")
      var longDesc: String? = null
  )*/

//---------------------------------PR2------------------------------

    @SerializedName("name")
    var name: String? = null,
    @SerializedName("image")
    var image: String? = null,
    @SerializedName("long_desc")
    var longDesc: String? = null,
    @SerializedName("Level")
    var levelX: String? = null,
    @SerializedName("First Time")
    var first_Time: String? = null,
    @SerializedName("Power")
    var power: String? = null,
    @SerializedName("vid_desc")
    var vidDesc: String? = null
)

/*
{
    "name":"Jean Gray",
    "Level":"Omega",
    "First Time":"Uncanny X-Men # 1 (1963)",
    "Power":"La fuerza del fÃ©nix",
    "image": "https://static.wikia.nocookie.net/marveldatabase/images/4/4d/A.X.E._Judgment_Day_Vol_1_3_Women_of_A.X.E._Variant_Textless.jpg/revision/latest?cb=20220711112817",
    "long_desc": "Es una mutante nivel Omega que posee grandes poderes telepÃ¡ticos, telequineticos, pyroquinesis y manipulaciÃ³n molecular entre otros. TambiÃ©n es la reencarnaciÃ³n fÃ­sica de la Fuerza FÃ©nix, una poderosa entidad cÃ³smica que le dio vida a los universos y que en tiempos atrÃ¡s destruyÃ³ planetas. Dicha entidad representa la creaciÃ³n, destrucciÃ³n y resurrecciÃ³n."

}
* */