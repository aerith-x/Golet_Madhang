package com.kiki.myapplication.data

import com.kiki.myapplication.model.Makan

object MakanDataSource {


    fun createMakanData(): MutableList<Makan> {
        val touristData = mutableListOf<Makan>()
        val makans = listOf(
            Makan(
                name = "Decora Cafe",
                locationName = "Jl. Brigjen. Katamso No.27, Kauman Lama, Purwokerto Lor, Kec. Purwokerto Tim., Kabupaten Banyumas, Jawa Tengah 53114",
                description = "Salah satu tempat nongkrong di Purwokerto yang lumayan cozy karena kita bisa memilih berbagai macam jenis tempat duduk yang ada di sana. Mau duduk di tempat semacam sofa ada, kursi panjang ada, duduk intim berdua ada, indoor maupun outdoor semuanya ada.\n" +
                        "\n" +
                        "Tempat ini ada di lantai dua, satu lantai dengan mebel. Selain bisa nongkrong di sini, kamu bisa melihat-lihat furniture yang dijual.\n",
                imageUrl = "https://s3.ap-southeast-1.amazonaws.com/cdn.orbit/wp-content/uploads/2022/08/09235112/view-1-7-580x408.jpeg",
                rating = 4.5,
                category = "Cafe",
                latitude = -7.42632923130403,
                longitude =  109.24844848220587,
                isFavorite = true,
            ),
            Makan(
                name = "The Soeds Coffee Eats & Spaces",
                locationName = "Jl. Jatiwinangun No.25, Jatiwinangun, Purwokerto Lor, Kec. Purwokerto Tim., Kabupaten Banyumas, Jawa Tengah 53114",
                description = "Tempat nongkrong asik di purwokerto, suasananya nyaman, ada tempat parkir motor dan mobilnya. Menu makanan dan minumannya banyak dan bervariasi, rasanya enak, harganya lumayan terjangkau. Tersedia smoking room area dan ada area outdoor juga. Lumayan nyaman untuk nongkrong bersama teman-teman.\n" +
                        "\n" +
                        "Tipe coffee shop yang bisa bikin betah meskipun sendirian buat nugas ataupun baca buku. Buat ramean sama temen pun asik. Menunya pun banyak banget.",
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipMk-1YNcBFlIIk1nYdSV3gO3t7DTnGiXhkR4Dzh=w530-h298-k-no",
                rating = 4.6,
                category = "Cafe",
                latitude = -7.420223070299063,
                longitude =  109.2429868889395,
                isFavorite = true,
            ),
            Makan(
                name = "Society Coffee House",
                locationName = "Jl. Prof. Dr. Suharso No.9B, Arcawinangun, Kec. Purwokerto Tim., Kabupaten Banyumas, Jawa Tengah 53113",
                description = "Ketika tempat ngopi belum booming di Purwokerto pada tahun 2015, Society Coffee sudah ada dengan konsep coffee shop nya. Memang saat itu sudah ada beberapa tempat ngopi yang terkenal lainnya, namun mungkin tidak semewah ini.\n" +
                        "\n" +
                        "Lokasinya yang dekat dengan Gor Satria Purwokerto menjadikan tempat ini mudah dijangkau oleh siapa saja. Bisa dibilang ada di tengah kota. Dekat pula dari Universitas Jenderal Soedirman.",
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipP5-9GBtk0Z5fds-DhMwVGZon3-pyYpVgVchZgI=w408-h271-k-no",
                rating = 4.5,
                category = "Cafe",
                latitude = -7.417685584164008,
                longitude = 109.25218496348954,
            ),
            Makan(
                name = "Taman Coffee",
                locationName = "Jl. Gn. Muria No.985, Karang Bawang, Grendeng, Kec. Purwokerto Utara, Kabupaten Banyumas, Jawa Tengah 53122",
                description = "Tempat nya luas dan cozy. Pas buat nongkrong bareng temen-temen. Harga standar coffeeshop pada umumnya.\n" +
                        "\n" +
                        "Taman Coffe menyajikan berbagai racikan kopi dan non kopi yang cocok nemenin kamu hangout atau sekedar nongki ngerjain tugas.  Harga disini juga terjangkau dan pas dikantong anak kuliahan. Taman Coffee memiliki 4 ruangan pilihan 1 indor, 1 outdoor dan 2 rooftop, dengan view yang pas dan instagramable.",
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipPThJnNnjUPf8G5yEhoBXNybIGbXFCKlqvg8bes=w426-h240-k-no",
                rating = 4.6,
                category = "Cafe",
                latitude = -7.406516069880208,
                longitude = 109.24904344408635,
            ),
            Makan(
                name = "Warmindo Bogarasa",
                locationName = "Jl. Cendrawasih, Brubahan, Grendeng, Kec. Purwokerto Utara, Kabupaten Banyumas, Jawa Tengah 53122",
                description = "Warung makan sederhana yang letaknya sangat strategis dan dekat dengan kampus Unsoed. Disertakan dengan rasa yang tidak kalah nikmat dan harga terjangkau untuk kalangan mahasiswa. Magelangan dan orak-arik nya yang sangat recomended dengan cita rasa bumbu pilihan yang diberikan. Tidak hanya magelangan dan orak-arik saja yang menjadi menu recomended, melainkan masih ada banyak menu yang enak lainnya seperti omlet, mie dokdok, mie tektek, dan masih banyak lainnya yang tidak kalah nikmat. ",
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipPNbqX3NUnyYhnmkzUM5o40mpX_XT2XLh3JzKD9=s1360-w1360-h1020",
                rating = 4.7,
                category = "Warmindo",
                latitude = -7.405683462458072,
                longitude = 109.24808064921396,
                isFavorite = true,
            ),
            Makan(
                name = "Warmindo Bucking Ham (Bapake)",
                locationName = "Dukuhbandong, Grendeng, Purwokerto Utara, Banyumas Regency, Central Java 53122",
                description = "Warung makan sederhana yang letaknya bersebrangan dengan warmindo boga rasa yang secara tidak langsung sangat strategis juga karena kawasannya masih dalam satu lingkup kampus Unsoed. Dengan aneka raga olahan mie yang dimasak oleh “Bapake”. Memiliki cita rasa nikmat khas. Disebut “Bapake” karena diolah langsung oleh si bapak pemilik warung tersebut. Mempunyai tempat makan yang sangat luas. Tidak hanya luas, warmindo ini menyediakan tempat duduk lesehan bagi pengunjung yang ingin duduk lesehan. \n" +
                        "\n" +
                        "Makanan yang paling recomended menurut banyak pengunjung adalah omlet dan magelangan. Dengan harga yang terjangkau dan ukuran porsi yang sangat mengenyangkan. Sehingga tidak perlu khawatir dalam mencari makanan yang mengenyangkan dengan harga yang terjangkau. Varian menunya pun sangat bervariasi sehingga pengunjung tidak akan bingung dalam memilih olahan mie yang diinginkan.\n"                       ,
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipNzKXuelFmpsh0re9-0ykIv1yszp58OA9FGTiiM=s1360-w1360-h1020",
                rating = 4.8,
                category = "Warmindo",
                latitude = -7.4056352869136415,
                longitude = 109.24798798708512,
                isFavorite = true,
            ),
            Makan(
                name = "Warmindo Primadona",
                locationName = "Jl. Gn. Muria 8, Dukuhbandong, Grendeng, Kec. Purwokerto Utara, Kabupaten Banyumas, Jawa Tengah 53122",
                description = "Warung makan sederhana dengan berbagai macam olahan mie yang berletak di sekitaran kampus Unsoed. Dengan berbagai macam menu olahan dengan dasar mie ini sangat menjanjikan mahasiswa. Harganya yang sangat terjangkau dengan rasa yang cocok bagi semua kalangan terutaman mahasiswa. Tempatnya yang cukup nyaman dan strategis menjadikan warmindo ini banyak didatangi banyak mahasiswa yang lapar. \n" +
                        "\n" +
                        "Tidak hanya mahasiswa, dari berbagai kalangan pun dapat mengunjunginya dan sangat cocok dan sangat ramah di kantong. Karena harga yang terjangkau dengan rasa yang tidak kalah nikmat tentunya. Menunya pun sangat bervarian mulai dari omlet, magelangan, orak-arik, dll. Serta berbagai macam minuman sachet yang disediakan sehingga penugunjung dapat memilihnya sesuai dengan keinginannya. ",
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipNu7UMmpujlJVE-8JnGFtD9n44tE0hNi3Ir74Ni=s1360-w1360-h1020",
                rating = 4.6,
                category = "Warmindo",
                latitude = -7.4066702 ,
                longitude = 109.2466196,
                isFavorite = true,
            ),
            Makan(
                name = "Kopi Sepuran",
                locationName = "Jl. Bayur No.3, Dusun III, Kebocoran, Kec. Kedungbanteng, Kabupaten Banyumas, Jawa Tengah 53152",
                description = "Warung makan sederhana yang letaknya berdekatan dengan rel kereta api. Menikmati hidangan, sambil melihat lalu-lalang kereta api bisa dilakukan disini. Kereta api disebut Sepur (jawa) ditempat kami. Hadirnya Warung Kopi Sepuran menjadi sebuah sensasi tersendiri. Tempat makan ini sangat cocok untuk berkumpul keluarga atau acara apapun. Menawarkan sensasi baru menikmati hidangan yang bisa kita ambil secara prasmanan. \n" +
                        "\n" +
                        "Warung makan sederhana yang letaknya berdekatan dengan rel kereta api. Menikmati hidangan, sambil melihat lalu-lalang kereta api bisa dilakukan disini. Kereta api disebut Sepur (jawa) ditempat kami. Hadirnya Warung Kopi Sepuran menjadi sebuah sensasi tersendiri. Tempat makan ini sangat cocok untuk berkumpul keluarga atau acara apapun. Menawarkan sensasi baru menikmati hidangan yang bisa kita ambil secara prasmanan. ",
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipNCjLjW6Jf-dKzJ78Yj3_Fe2IGyHNPGpkBFjRjU=s1360-w1360-h1020 ",
                rating = 4.5,
                category = "Restaurant",
                latitude = -7.402578624371725,
                longitude = 109.2094159836364,
                isFavorite = true,
            ),
            Makan(
                name = "Warung Sambal",
                locationName = "Jl. Prof. Dr. Suharso No.98, Arcawinangun, Kec. Purwokerto Tim., Kabupaten Banyumas, Jawa Tengah 53113",
                description = "Warung makan yang letaknya sangat strategis di tengah kota atau bisa dibilang kompleks Gor Satria Purwokerto. Memiliki cita rasa nikmatnya sambal khas yang sangat diminati dari berbagai kalangan. Tempat makannya pun sangat luas. Tidak hanya luas, warung makan ini pun cocok untuk berkumpul keluarga besar atau suatu acara. \n" +
                        "\n" +
                        "Berbagai macam olahan sambal disini disediakan. Dengan harga yang sangat terjangkau dan sangat cocok untuk isi kantong mahasiswa terutama dan berbagai kalangan tentunya. Varian menu sambalnya pun sangat bervariasi sehingga pengunjung tidak akan bingung dalam memilih olahan sambal yang diinginkan. Dengan fasilitas yang lengkap sepertr mushola yang bersih, toilet yang terawat, dan tempat yang nyaman menjadikan warung sambal ini sangat cocok untuk disinggahi.",
                rating = 4.3,
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipNkWl_KpjI_Ts2hD-G0DlmyejM7lCdBrWWrRQ9f=s1360-w1360-h1020 ",
                category = "Restaurant",
                latitude = -7.417429048958846,
                longitude = 109.25383400412422,
                isFavorite = true,
            ),
            Makan(
                name = "RM Ibu Endang Purwokerto (Gor Satria)",
                locationName = "Jl. Gelora Indah 2, Mangunjaya, Purwokerto Lor, Kec. Purwokerto Tim., Kabupaten Banyumas, Jawa Tengah 53114",
                description = "Warung makan dengan berbagai macam olahan sambal bakar yang berlokasi di kawasan Gor Satria. Untuk harganya pun lumayan bagi semua kalangan untuk di sekelas harga sambal bakar. Tempatnya yang cukup nyaman dan strategis menjadikan tempat makan ini menjadi salah satu rekomendasi tempat bagi yang berada di kota Purwokerto karena tempatnya terletak di tengah kota. Masakan yang disajikan pun sangat khas yaitu menggunakan cobek sebagai alas makannya kemudian dibakar di atas kompor yang membara dengan makanan di atasnya.\n" +
                        "\n" +
                        "Hal tersebut yang menjadikan aroma dan rasanya dengan kuat. Dengan berbagai macam menu olahan sambal baklar yang sangat menjanjikan dari segi rasa. Dengan cita rasa bumbu pilihan olahan sambal kemudian dibakar yang menjadikan aroma dan rasanya semakin kuat. Fasilitasnya pun cukup lengkap disertai dengan toilet dan mushola. Tidak hanya menu sambal bakar, terdapat menu pedesaan lainnya seperti pecak ikan, masakan olahan, dll.",
                rating = 4.3,
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipMhUwRB_TtMmQl0YYjNLZnEJsTQcNj28vgsySOk=s1360-w1360-h1020 ",
                category = "Restaurant",
                latitude = -7.419155801891778,
                longitude = 109.24993551226699,
            ),
        )

        touristData.addAll(makans)
        return touristData
    }
}
