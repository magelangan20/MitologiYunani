package com.example.picodiploma.mitologiyunani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageList = listOf<Image>(
                Image(R.drawable.zeus,
                        "Zeus",
                        "Berdasarkan mitologi Yunani klasik, Zeus adalah penguasa Olimpus yang juga merupakan raja dan pemimpin dari para dewa. Padanan Zeus dalam mitologi Romawi adalah dewa Jupiter. Meskipun Zeus memiliki banyak konflik seperti yang dikisahkan dalam mitologi, namun ia adalah dewa yang abadi dan tidak bisa terjerat dalam masalah fana.\n" +
                                "\n" +
                                "Zeus adalah anak termuda dari Titan Cronos dan Titaness Rhea dan dibesarkan oleh Mother Earth atau Gaia, setelah dewasa ia menggulingkan ayahnya untuk menguasai dunia. Zeus memiliki kekuatan untuk mengendalikan langit dan bumi, ia disebut juga sebagai dewa iklim, dewa cuaca, dan dewa takdir.",
                        "Petir, elang, pohon ek",
                        "Petir"
                ),
                Image(R.drawable.poseidon,
                        "Poseidon",
                        "Dalam mitologi Romawi, Poseidon dikenal sebagai Neptunus. Ia merupakan penguasa laut dan tinggal di bawah laut bersama istrinya, Aigeia. Ia juga dikenal sebagai dewa gempa bumi dan pembawa badai, karena ia mampu mengendalikan lautan dan dunia bawah laut.\n" +
                                "\n" +
                                "Selalu digambarkan sebagai dewa perkasa yang menaiki kuda setengah ikan serta mengacungkan trisulanya, Poseidon sangat dihormati oleh para nelayan dan orang-orang yang melakukan pelayaran pada zaman dulu. Sama seperti Zeus adiknya, Poseidon juga memiliki banyak hubungan dengan wanita.",
                        "Trisula, ikan, lumba-lumba, kuda dan banteng",
                        "Trisula"
                ),
                Image(R.drawable.hera,
                        "Hera",
                        "Hera merupakan ratu para dewa, ia juga anak dari Titans Cronos dan Titaness Rhea, yang mana adalah kakak perempuan Zeus, sekaligus istrinya.\n" +
                                "\n" +
                                "Hera adalah dewi perlindungan bagi pernikahan, kelahiran dan persalinan, para wanita dan pengatur bintang-bintang di angkasa. Dari pernikahannya dengan Zeus, ia memiliki tiga orang anak yaitu Ares, Hephaestus dan Eileithyia.",
                        "Delima, bulu merak, mahkota, apel, sapi, singa, gagak",
                        "Tongkat lotus"
                ),
                Image(R.drawable.demeter,
                        "Demeter",
                        "Demeter merupakan dewi pertanian, dewi bunga dan kesuburan tanah. Ia mengendalikan musim panen dan rambutnya melambangkan untaian bulir-bulir gandum. Demeter disebut sebagai pengganti Hades di Olimpus karena Hades lebih menyukai untuk tinggal di Dunia Bawah.\n" +
                                "\n" +
                                "Demeter juga disebut sebagai dewi pembawa musim, ini terjadi ketika anaknya Persefone dinikahi oleh Hades dan dibawa untuk tinggal di Dunia Bawah. Saat Demeter sedih, bumi mengalami musim dingin dan saat Persefone mengunjunginya, ia sangat bahagia dan pada saat itulah terjadi musim semi.",
                        "Obor, gandum, keranjang, babi, dan jelai",
                        "Sabit"
                ),
                Image(R.drawable.ares,
                        "Ares",
                        "Ares merupakan anak Zeus dan Hera, ia merupakan dewa perang yang terkenal karena kebrutalannya dalam bertempur. Masyarakat Romawi kuno menyebut Ares sebagai dewa Mars.\n" +
                                "\n" +
                                "Meskipun Ares dikenal sebagai dewa perang, namun banyak kerajaan yang tidak ingin menyembahnya karena dianggap terlalu kejam dan tidak memiliki belas kasihan.\n" +
                                "\n" +
                                "Ia dikenal sebagai dewa yang penuh kemarahan. Penggambaran dirinya adalah diliputi api, biasanya mengenakan baju zirah perang dan helm serta memegang tombak. Amazon, Harmoni dan Eros atau biasa disebut Cupid, adalah anak-anak Ares dan Aphrodite.",
                        "Burung Hering, obor, babi hutan, dan anjing.",
                        "Tombak, helm, perisai"
                ),
                Image(R.drawable.aphrodite,
                        "Aphordite",
                        "Dewi Aphrodite adalah dewi cinta Yunani, ia selalu digambarkan memiliki paras yang cantik rupawan sehingga membuat siapa pun yang melihatnya akan jatuh cinta. Ia merupakan lambang nafsu, kecantikan, bujuk rayu, kebahagiaan dan dipuja sebagai dewi kesuburan bagi wanita.\n" +
                                "\n" +
                                "Ia memiliki suami yaitu dewa Hephaestus namun memiliki anak dengan kekasihnya, yaitu Ares sang dewa perang. Orang Romawi menyamakan Aphrodite dengan dewi Venus.",
                        "mawar, kerang, tanaman myrtle, burung dara, burung gereja, korset dan angsa",
                        "Belati, cermin"
                ),
                Image(R.drawable.athena,
                        "Athena",
                        "Athena adalah dewi kebijaksanaan juga penyusun strategi perang yang handal. Selain itu, ia juga dikenal sebagai dewi seni, keindahan jiwa dan dewi kepandaian serta pendidikan. Ia merupakan anak Zeus dan Metis.\n" +
                                "\n" +
                                "Digambarkan sebagai wanita dengan aura kecerdasan yang kuat, mengenakan baju perang lengkap dengan pelindung kepala dan memegang perisai serta tombak. Hewan kesayangannya adalah burung hantu.\n" +
                                "\n" +
                                "Athena juga merupakan pelindung bagi gadis-gadis perawan sebab dirinya sendiri juga adalah dewi yang perawan. Persamaannya dalam kepercayaan Romawi kuno adalah dewi Minerva.",
                        "Burung hantu, pohon zaitun, ular, laba-laba",
                        "Aigis, Baju perang, helm perang, tombak"
                ),
                Image(R.drawable.hephaestus,
                        "Hephaestus",
                        "Hephaestus adalah dewa api dan juga merupakan suami dari dewi Aphrodite. Sebagai salah satu dari anak Zeus, Hephaestus dikarunai kepandaian dalam mengolah besi dan menciptakan benda-benda luar biasa, contohnya membuat petir bagi Zeus, Aegis bagi Athena dan baju perang bagi Achilles.\n" +
                                "\n" +
                                "Ia adalah dewa yang pincang dengan wajah yang buruk rupa. Saat mengetahui istrinya berselingkuh dengan Ares, ia membuat jaring jebakan dan memanggil semua dewa untuk menjadi saksi perselingkuhan keduanya.\n" +
                                "\n" +
                                "Ia digambarkan sebagai dewa yang kuat dan simbolnya adalah palu, pelengkung dan besi landasan.",
                        "Palu, pelengkung dan besi landasan.",
                        "Kapak"
                ),
                Image(R.drawable.apollo,
                        "Apollo",
                        "Apollo adalah dewa matahari, cahaya, musik, ramalan, panahan, penyembuhan dan pelindung kaum muda. Ia memiliki saudari kembar yaitu Artemis dan merupakan anak dari Zeus dan Leto.\n" +
                                "\n" +
                                "Ia secara khusus dianugerahi kuasa untuk mengatur pergerakan matahari di langit dan cahaya di bumi. Karena ketampanannya, Apollo menjadi sangat angkuh dan mengira semua wanita akan jatuh cinta kepadanya. Namun kenyataannya, semua kisah cinta Apollo berakhir buruk, ia juga dikenal sebagai salah satu dewa pemarah.",
                        "Lira, tanaman salam, gagak",
                        "Busur dan anak panah"
                ),
                Image(R.drawable.artemis,
                        "Artemis",
                        "Artemis adalah dewi bulan, pelindung alam dan hewan liar, ia senang berburu bersama saudaranya, Apollo. Ia juga merupakan dewi kesucian dan kesuburan, untuk itu para pengikutnya pun diharuskan untuk menjaga kesuciannya.\n" +
                                "\n" +
                                "Ia digambarkan sebagai gadis muda yang cantik selalu membawa busur dan panah serta dikelilingi oleh hewan-hewan kesayangannya seperti rusa, serigala dan babi hutan. Ia dan saudaranya memiliki kemampuan memanah terbaik di antara para dewa Olimpus.",
                        "Serigala, Babi hutan, rusa, anjing",
                        "Busur dan anak panah"
                ),
                Image(R.drawable.hermes,
                        "Hermes",
                        "Hermes dikenal sebagai dewa yang cerdas dan tampan, padanannya dalam mitologi Romawi adalah dewa Merkurius. Hermes adalah putra Zeus dengan istrinya yang bernama Maia. Ia merupakan dewa pengantar pesan, dewa penunjuk jalan, dewa pelindung para petualang, dan dewa penuntun arwah.\n" +
                                "\n" +
                                "Dijuluki sebagai Psykopompos yang berarti dewa pengantar arwah menuju dunia bawah, ia dapat melintasi tiga dunia yaitu dunia para dewa, dunia manusia dan dunia kematian atau dunia bawah.",
                        "kura-kura, ayam jantan, kadukeus",
                        "Sandal bersayap, topi bersayap"
                ),
                Image(R.drawable.hestia,
                        "Hestia",
                        "Hestia adalah kakak sulung Zeus, ia adalah dewi perapian dan pelindung keluarga. Ia digambarkan sebagai perempuan bersahaja mengenakan penutup kepala putih. Singgasananya pun sangat sederhana, berbentuk kayu polos dengan bantal wol putih.\n" +
                                "\n" +
                                "Hestia dihormati oleh dewa dan manusia karena keberadaannya di mana-mana, baik itu di kuil maupun rumah. Setiap kota di Yunani kuno, memiliki perapian yang besar di tengah kota dan dijaga agar terus menyala.\n" +
                                "\n" +
                                "Api ini akan dibawa apabila mereka ingin mendirikan sebuah kota baru. Dalam mitologi Romawi, Hestia dikenal dengan nama Vesta.",
                        "Perapian, babi, keledai, ceret, dan bangau",
                        "Tidak ada"
                ),
        )
        val profil: ImageView = findViewById(R.id.profil)
        profil.setOnClickListener{
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.Olympians)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
        }
    }