package com.hfad.minigtapp


object DiecastData {
    private val diecastNames = arrayOf(
            "Eva RT Test Type-01 X Works GT-R #33",
            "EVA RT Test Type-02 X Works GT-R",
            "Nissan Skyline GT-R (R32) Gr. A #87 HKS",
            "Nissan Skyline GT-R (R32) Gr. A #11 BP 1993",
            " Nissan Skyline GT-R (R32) Gr. A #12 Calsonic 1990",
            "Acura NSX GT3 Los Angeles Auto Show 2017",
            "Audi RS6 Avant Carbon Black Edition Tango Red",
            "Bentley Continental GT 2018 Sequin Blue",
            "BMW M3 (E30) Alpine White",
            "Mercedes-Benz 190E 2.5-16 Evolution II DTM Silver",
            " Land Rover Defender 110 Red Bull LUKA",
            "LB-Silhouette WORKS GT NISSAN 35GT-RR Ver.1 White"
    )

    private val diecastPrice = arrayOf(
            "Rp 300.000",
            "Rp 300.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000",
            "Rp 139.000"
    )
    private val diecastDesc = arrayOf(
            "Eva RT Test Type-01 X Works GT-R #33 Test Car SUPER GT GT300 2019",
            "EVA RT Test Type-02 X Works GT-R [Hong Kong Exclusive Product]",
            "Nissan Skyline GT-R (R32) Gr. A #87 HKS 1993 Japan Touringcar Championship RHD version only.",
            "Nissan Skyline GT-R (R32) Gr. A #11 BP 1993 Japan Touringcar Championship RHD",
            "Nissan Skyline GT-R (R32) Gr. A #12 Calsonic 1990 Japan Touringcar Championship",
            "Acura NSX GT3 NY Autoshow 2016 [USA EXCLUSIVE PRODUCT] LHD",
            "Audi RS6 Avant Carbon Black Edition Tango Red",
            "Bentley Continental GT 2018\n" +
                    "Sequin Blue\n" +
                    "\n" +
                    "LHD / RHD Available\n" +
                    "\n" +
                    "LHD version - MGT00094-L\n" +
                    "RHD version - MGT00094-R",
            "BMW M3 (E30)\n" +
                    "Alpine White\n" +
                    "LHD / RHD available\n" +
                    "\n" +
                    "LHD version - MGT00041-L\n" +
                    "RHD version - MGT00041-R",
            "Mercedes-Benz 190E 2.5-16 Evolution II DTM\n" +
                    "Silver",
            "Land Rover Defender 110\n" +
                    "Red Bull LUKA\n" +
                    "\n" +
                    "LHD version only",
            "LB-Silhouette WORKS GT NISSAN 35GT-RR Ver.1\n" +
                    "White\n" +
                    "\n" +
                    "LHD / RHD Available\n" +
                    "\n" +
                    "LHD version - MGT00168-L\n" +
                    "RHD version - MGT00168-R"
    )

    private var diecastStatus = arrayOf("ready stock", "pre-order", "preorder", "ready stock", "pre-order", "ready stock", "pre-order", "ready stock", "pre-order", "ready stock", "ready stock", "pre-order")

    private val diecastImg = intArrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12)
    val listData: ArrayList<Diecast>
        get() {
            val list = arrayListOf<Diecast>()
            for (position in diecastNames.indices) {
                val diecast = Diecast()
                diecast.name = diecastNames[position]
                diecast.price = diecastPrice[position]
                diecast.photo = diecastImg[position]
                diecast.detail = diecastDesc[position]
                diecast.status = diecastStatus[position]
                list.add(diecast)
            }
            return list
        }

}