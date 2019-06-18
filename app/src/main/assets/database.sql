BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "metode" (
	"_id"	INTEGER PRIMARY KEY AUTOINCREMENT,
	"kategori_id"	INTEGER,
	"ciri_id"	INTEGER,
	"ciri2_id"	INTEGER,
	"kode_id"	TEXT,
	"nama"	TEXT,
	"keterangan"	TEXT
);
CREATE TABLE IF NOT EXISTS "riwayat" (
	"_id"	INTEGER PRIMARY KEY AUTOINCREMENT,
	"nama"	TEXT,
	"usia"	INTEGER,
	"jenjang_sekolah"	INTEGER,
	"jenis_kelamin"	TEXT,
	"kategori_id"	INTEGER,
	"ciri_id"	INTEGER,
	"ciri2_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "ciri" (
	"_id"	INTEGER PRIMARY KEY AUTOINCREMENT,
	"kode_id"	TEXT,
	"nama"	TEXT
);
CREATE TABLE IF NOT EXISTS "klasifikasi" (
	"_id"	INTEGER,
	"kode_id"	TEXT,
	"klasifikasi"	TEXT,
	"kategori_id"	TEXT,
	PRIMARY KEY("_id")
);
CREATE TABLE IF NOT EXISTS "kategori" (
	"_id"	INTEGER,
	"name"	TEXT,
	"is_main"	INTEGER,
	PRIMARY KEY("_id")
);
INSERT INTO "metode" VALUES (1,1,1,'','M01','Metode Ceramah
','Metode pembelajaran ceramah adalah penerangan secara lisan atas bahan pembelajaran kepada sekelompok pendengar untuk mencapai tujuan pembelajaran tertentu dalam jumlah yang relatif besar.');
INSERT INTO "metode" VALUES (2,1,1,NULL,'M02','Metode Tanya Jawab','Metode tanya jawab adalah suatu cara penyampaian pelajaran oleh guru dengan jalan mengajukan pertanyaan dan murid menjawab.');
INSERT INTO "metode" VALUES (3,1,1,NULL,'M03','Metode Curah Pendapat','Metode Brainstorming adalah suatu teknik atau mengajar yang dilaksanakan oleh guru di dalam kelas. Ialah dengan melontarkan suatu masalah ke kelas oleh guru, kemudian siswa menjawab atau menyatakan pendapat, atau komentar sehingga mungkin masalah tersebut berkembang menjadi masalah baru, atau dapat diartikan pula sebagai satiu cara untuk mendapatkan banyak ide dari sekelompok manusia dalam waktu yang singkat.');
INSERT INTO "metode" VALUES (4,NULL,NULL,NULL,'M04','Metode Diskusi Umum','Metode ini bertujuan untuk tukar menukar gagasan, pemikiran, informasi/pengalaman diantara peserta, sehingga dicapai kesepakatan pokok-pokok pikiran (gagasan, kesimpulan).');
INSERT INTO "metode" VALUES (5,NULL,NULL,NULL,'M05','Metode Panel dan Seminar','Metode seminar adalah suatu kegiatan ilmiah yang dilakukan oleh beberapa orang dalam suatu sidang yang berusaha membahas / mengupas masalah-masalah atau hal-hal tertentu dalam rangka mencari jalan memecahkannya atau mencari pedoman pelaksanaanya.');
INSERT INTO "metode" VALUES (6,1,1,NULL,'M06','Metode Sumbang Saran','Metode sumbang saran adalah suatu bentuk diskusi dalam rangka menghimpun gagasan, pendapat, informasi, pengetahuan, pengalaman dari semua peserta. Berbeda dengan diskusi, dimana gagasan dari seseorang ditanggapi (didukung, dilengkapi, dikurangi, atau tidak disepakati) oleh peserta lain, pada penggunaan metode curah pendapat orang lain tidak untuk ditanggapi.');
INSERT INTO "metode" VALUES (7,1,1,NULL,'M07','Metode Share Your Information','Share Your Information merupakan suatu metode pembelajaran yang bertujuan menyampaikan materi/informasi yang relevan dengan cara yang menyenangkan bagi peserta didik dan pengajar yang melibatkan semua orang di dalam proses pembelajaran.');
INSERT INTO "metode" VALUES (8,NULL,NULL,NULL,'M08','Metode Randomization Technique','Model ini bertujuan agar semua mahasiswa fokus memperhatikan presentasi dari salah satu temannya.');
INSERT INTO "metode" VALUES (9,NULL,NULL,NULL,'M09','Metode Resitasi / Penugasan','Metode Pembelajaran Resitasi adalah suatu metode pengajaran dengan mengharuskan siswa membuat resume dengan kalimat sendiri.');
INSERT INTO "metode" VALUES (10,NULL,NULL,NULL,'M10','Metode Flashcard','Ada beberapa cara untuk menggunakan flashcards untuk mengajar. Strategi mengajar flashcard ini, menggunakan teknik Constan Time Delay (CTD), banyak digunakan oleh guru pendidikan khusus dan reguler.');
INSERT INTO "metode" VALUES (11,NULL,NULL,NULL,'M11','Metode Picture and Picture','Picture and Picture adalah suatu metode belajar yang menggunakan gambar dan dipasangkan / diurutkan menjadi urutan logis.');
INSERT INTO "metode" VALUES (12,NULL,NULL,NULL,'M12','Metode Puzzle Amplop','Metode ini pengembangan dari beberapa model pembelajaran yang berisikan puzzle di dalam amplop dan pertanyaan atau gambar yang perlu didiskusikan dengan teman temannya sehingga menghasilkan suatu pemikiran yang sama setelah itu di persentasikan dari hasil pemikiran kelompok kelompok tersebut.');
INSERT INTO "metode" VALUES (13,NULL,NULL,NULL,'M13','Metode Design Thinking','Desain berpikir adalah filsafat, pola pikir, dan metodologi. suatu cara berpikir yang praktis dan kreatif dalam memecahkan suatu masalah atau pekerjaan.');
INSERT INTO "metode" VALUES (14,NULL,NULL,NULL,'M14','Metode Beyond Center and Circle Time (BCCT)','BCCT yaitu konsep belajar dimana guru-guru menghadirkan dunia nyata ke dalam kelas dan mendorong siswa membuat hubungan antara pengetahuan yang dimiliki dengan penerapannya dalam kehidupan mereka sehari-hari.');
INSERT INTO "metode" VALUES (15,NULL,NULL,NULL,'M15','Metode Insiden','Metode insiden yaitu bentuk metode pembelajaran yang menitikberatkan kepada aktivitas peserta didik untuk dapat berfikir aktif dan dinamis dalam menghadapi permasalahan terhadap tugas yang diberikan pengajar.');
INSERT INTO "metode" VALUES (16,NULL,NULL,NULL,'M16','Metode Latihan','Metode latihan keterampilan (drill method) adalah suatu metode mengajar dengan memberikan pelatihan keterampilan secara berulang kepada peserta didik, dan mengajaknya langsung ketempat latihan keterampilan untuk melihat proses tujuan, fungsi, kegunaan dan manfaat sesuatu (misal: membuat tas dari mute).');
INSERT INTO "metode" VALUES (17,NULL,NULL,NULL,'M17','Metode Permainan','Metode permainan adalah cara mengajar yang dilaksanakan dalam untuk permainan.');
INSERT INTO "metode" VALUES (18,NULL,NULL,NULL,'M18','Metode Karya Wisata (Field Trip)','Metode karya wisata adalah suatu metode mengajar yang dirancang terlebih dahulu oleh pendidik dan diharapkan siswa membuat laporan dan didiskusikan bersama dengan peserta didik yang lain serta didampingi oleh pendidik, yang kemudian dibukukan.');
INSERT INTO "metode" VALUES (19,NULL,NULL,NULL,'M19','Metode Kubus Pecah','Metode Broken Square yaitu cara penyusunan pecahan–pecahan Bujur sangkar yang dilakukan oleh empat atau lima kelompok menjadi bentuk bujur sangkar.');
INSERT INTO "metode" VALUES (20,NULL,NULL,NULL,'M20','Metode Snowball Throwing','Menurut Suprijono, Snowball Throwing adalah suatu cara penyajian bahan pelajaran dimana murid dibentuk dalam beberapa kelompok yang heterogen kemudian masing-masing kelompok dipilih ketua kelompoknya untuk mendapat tugas dari guru lalu masing-masing murid membuat pertanyaan yang dibentuk seperti bola (kertas pertanyaan) kemudian dilempar ke murid lain yang masing-masing murid menjawab pertanyaan dari bola yang diperoleh.');
INSERT INTO "metode" VALUES (21,NULL,NULL,NULL,'M21','Metode Roundtable','Pembelajaran kooperatif tipe round/ rally table merupakan teknik menulis yang menerapkan pembelajaran dengan menunjuk tiap-tiap anggota kelompok untuk berpartisipasi secara bergiliran dalam kelompoknya dengan membentuk meja bundar atau duduk melingkar.');
INSERT INTO "metode" VALUES (22,NULL,NULL,NULL,'M22','Metode Time Token Arends','Model pembelajaran Time Token Arends merupakan salah satu contoh kecil dari penerapan pembelajaran yang demokratis di sekolah. Proses pembelajaran yang demokratis adalah proses belajar yang menempatkan siswa sebagai subyek. Mereka harus mengalami sebuah perubahan ke arah yang lebih positif.');
INSERT INTO "metode" VALUES (23,NULL,NULL,NULL,'M23','Metode Studi Kasus','Metode Studi Kasus yaitu cara penelaahan suatu kasus nyata dilapangan melalui kegiatan penelitian, yang diakhiri dengan kegiatan penyampaian laporan. ');
INSERT INTO "metode" VALUES (24,NULL,NULL,NULL,'M24','Metode DIAD','Metode DIAD yaitu cara komunikasi diantara dua orang baik secara lisan maupun tertulis terutama menyangkut identitas dari masing–masing pribadi.');
INSERT INTO "metode" VALUES (25,NULL,NULL,NULL,'M25','Metode Complete Sentence','Model Pembelajaran Complete Sentence merupakan rangkaian proses pembelajaran yang diawali dengan menyampaikan materi ajar oleh guru, atau dengan penganalisaan terhadap modul yang telah dipersiapkan, pembagian kelompok yang tidak boleh lebih dari tiga orang dengan kemampuan yang heterogen, pemberian  lembar kerja yang berisi paragraf yang belum lengkap, lalu diberikan kesempatan kepada siswa untuk berdiskusi dan diakhiri dengan pengambilan kesimpulan.');
INSERT INTO "metode" VALUES (26,NULL,NULL,NULL,'M26','Metode Forum Debat','Metode Forum Panel atau Forum Debat merupakan pengembangan dari metode panel.');
INSERT INTO "metode" VALUES (27,NULL,NULL,NULL,'M27','Metode Active Learning','Pembelajaran aktif (active learning) adalah suatu proses pembelajaran untuk memberdayakan peserta didik agar belajar dengan menggunakan berbagai cara/strategi secara aktif.');
INSERT INTO "metode" VALUES (28,NULL,NULL,NULL,'M28','Metode Debat Aktif','Metode debat merupakan salah satu metode pembelajaran yang sangat penting untuk meningkatkan kemampuan akademik siswa. Materi ajar dipilih dan disusun menjadi paket pro dan kontra.');
INSERT INTO "metode" VALUES (29,NULL,NULL,NULL,'M29','Metode Pair Checks','Pair check (pasangan mengecek) adalah model pembelajaran berkelompok atau berpasangan yang dipopulerkan oleh Spencer Kagen tahun 1993.');
INSERT INTO "metode" VALUES (30,NULL,NULL,NULL,'M30','Metode Talking Sticks','Talking stick termasuk salah satu model pembelajaran. Model pembelajaran talking stick ini dilakukan dengan bantuan tongkat, siapa yang memegang tongkat wajib menjawab pertanyaan dari guru setelah siswa mempelajari materi pokoknya.');
INSERT INTO "metode" VALUES (31,NULL,NULL,NULL,'M31','Metode Two Stay Two Stray','Memberikan kesempatan kepada kelompok untuk membagikan hasil dan informasi dengan kelompok lainnya.');
INSERT INTO "metode" VALUES (32,NULL,NULL,NULL,'M32','Metode Inside Outside Circle','Model Pembelajaran IOC (Inside Outside Circle) adalah model pembelajaran dengan sistem lingkaran kecil dan lingkaran besar (Spencer Kagan, 1993) di mana siswa saling membagi informasi pada saat yang bersamaan dengan pasangan yang berbeda dengan singkat dan teratur.');
INSERT INTO "metode" VALUES (33,NULL,NULL,NULL,'M33','Metode Demonstrasi','Demonstrasi adalah metode yang digunakan untuk membelajarkan peserta dengan cara menceritakan dan memperagakan suatu langkah-langkah pengerjaan sesuatu.');
INSERT INTO "metode" VALUES (34,NULL,NULL,NULL,'M34','Metode Kelompok Kerja','Metode kelompok kerja adalah cara pembelajaran yang melibatkan peserta dalam kelompok untuk menyelesaikan tugas-tugas.');
INSERT INTO "metode" VALUES (35,NULL,NULL,NULL,'M35','Metode Role Playing','Metode Role Playing atau Bermain Peran pada prinsipnya merupakan metode untuk ‘menghadirkan’ peran-peran yang ada dalam dunia nyata ke dalam suatu ‘pertunjukan peran’ di dalam kelas/pertemuan, yang kemudian dijadikan sebagai bahan refleksi agar peserta memberikan penilaian terhadap.');
INSERT INTO "metode" VALUES (36,NULL,NULL,NULL,'M36','Metode Sosiodrama','Sosiodrama adalah metode pembelajaran bermain peran untuk memecahkan masalah-masalah yang berkaitan dengan fenomena sosial, permasalahan yang menyangkut hubungan antara manusia seperti masalah kenakalan remaja, narkoba, gambaran keluarga yang otoriter, dan lain sebagainya.');
INSERT INTO "metode" VALUES (37,NULL,NULL,NULL,'M37','Metode Simulasi','Metode simulasi adalah bentuk metode praktek yang sifatnya untuk mengembangkan ketermpilan peserta belajar (keterampilan mental maupun fisik/teknis).');
INSERT INTO "metode" VALUES (38,NULL,NULL,NULL,'M38','Metode Scramble','Model Pembelajaran Scramble tampak seperti model pembelajaran word square, bedanya jawaban soal tidak dituliskan di dalam kotak-kotak jawaban, tetapi jawaban sudah dituliskan, namun dengan susunan yang acak, jadi siswa bertugas mengoreksi (membolak-balik huruf) jawaban tersebut sehingga menjadi jawaban yang tepat / benar.');
INSERT INTO "metode" VALUES (39,NULL,NULL,NULL,'M39','Metode Teka Teki Silang','Pengertian TTS adalah suatu permainan di mana kita harus mengisi ruang-ruang kosong (berbentuk kotak putih) dengan huruf-huruf yang membentuk sebuah kata berdasarkan petunjuk yang diberikan.');
INSERT INTO "riwayat" VALUES (1,'DAMAR',17,'SMA','PEREMPUAN',1,1,NULL);
INSERT INTO "ciri" VALUES (1,'K01','Individu');
INSERT INTO "ciri" VALUES (2,'K02','Kelompok');
INSERT INTO "ciri" VALUES (3,'K03','Permainan');
INSERT INTO "ciri" VALUES (4,'K04','Tanpa Permainan');
INSERT INTO "ciri" VALUES (5,'K05','Dalam Ruangan');
INSERT INTO "ciri" VALUES (6,'K06','Luar Ruangan');
INSERT INTO "klasifikasi" VALUES (1,'K01','Berbicara dengan tempo cepat','2');
INSERT INTO "klasifikasi" VALUES (2,'K02','Berbicara dengan tempo sedang','1');
INSERT INTO "klasifikasi" VALUES (3,'K03','Berbicara dengan tempo lambat','3');
INSERT INTO "klasifikasi" VALUES (4,'K04','Sering mengatakan sesuatu yang kelihatannya bagus','2');
INSERT INTO "klasifikasi" VALUES (5,'K05','Sering mengatakan sesuatu yang rasanya enak','3');
INSERT INTO "klasifikasi" VALUES (6,'K06','Sering mengatakan sesuatu yang kedengarannya bagus','1');
INSERT INTO "klasifikasi" VALUES (7,'K07','Mudah mengingat hal yang dilihat','2');
INSERT INTO "klasifikasi" VALUES (8,'K08','Mudah mengingat hal yang dilakukan','3');
INSERT INTO "klasifikasi" VALUES (9,'K09','Mudah mengingat hal yang didengar','1');
INSERT INTO "klasifikasi" VALUES (10,'K10','Lebih terkesan pada kejadian, emosi dan peristiwa','3');
INSERT INTO "klasifikasi" VALUES (11,'K11','Lebih terkesan pada orang, lingkungan dan wajah','2');
INSERT INTO "klasifikasi" VALUES (12,'K12','Lebih terkesan pada suara dan nama','1');
INSERT INTO "klasifikasi" VALUES (13,'K13','Sangat menyukai lukisan','2');
INSERT INTO "klasifikasi" VALUES (14,'K14','Sangat menyukai tarian','3');
INSERT INTO "klasifikasi" VALUES (15,'K15','Sangat menyukai musik','1');
INSERT INTO "klasifikasi" VALUES (16,'K16','Cenderung memperhatikan orang pada pakaian yang dikenakan','2');
INSERT INTO "klasifikasi" VALUES (17,'K17','Cenderung memperhatikan orang pada perilaku dan gerak-geriknya','3');
INSERT INTO "klasifikasi" VALUES (18,'K18','Cenderung memperhatikan orang pada pembicaraannya','1');
INSERT INTO "klasifikasi" VALUES (19,'K19','Senang menghafal sesuatu dengan mengulangi kata-kata dengan suara keras','1');
INSERT INTO "klasifikasi" VALUES (20,'K20','Senang menghafal sesuatu dengan menulis','2');
INSERT INTO "klasifikasi" VALUES (21,'K21','Senang menghafal sesuatu sambil berjalan','3');
INSERT INTO "klasifikasi" VALUES (22,'K22','Dalam berbicara menjelaskan, cenderung menggerakkan tangan','3');
INSERT INTO "klasifikasi" VALUES (23,'K23','Dalam berbicara menjelaskan, cenderung menyampaikan secara lisan','1');
INSERT INTO "klasifikasi" VALUES (24,'K24','Dalam berbicara menjelaskan, cenderung membuat coretan di kertas','2');
INSERT INTO "klasifikasi" VALUES (25,'K25','Mudah terganggu dengan benda yang bergerak','3');
INSERT INTO "klasifikasi" VALUES (26,'K26','Mudah terganggu dengan barang-barang yang berantakan','2');
INSERT INTO "klasifikasi" VALUES (27,'K27','Mudah terganggu dengan suara yang berisik','1');
INSERT INTO "klasifikasi" VALUES (28,'K28','Sangat tertarik pada gerakan tubuh','3');
INSERT INTO "klasifikasi" VALUES (29,'K29','Sangat tertarik pada suara','1');
INSERT INTO "klasifikasi" VALUES (30,'K30','Sangat tertarik pada warna','2');
INSERT INTO "klasifikasi" VALUES (31,'K31','Menganalisa sesuatu dengan membayangkan sesuatu di otak','3');
INSERT INTO "klasifikasi" VALUES (32,'K32','Menganalisa sesuatu dengan mengucapkan berulang-ulang','1');
INSERT INTO "klasifikasi" VALUES (33,'K33','Menganalisa sesuatu dengan membuat coretan','2');
INSERT INTO "klasifikasi" VALUES (34,'K34','Sulit konsentrasi ketika ada keributan','1');
INSERT INTO "klasifikasi" VALUES (35,'K35','Sulit bisa berlama belajar jika bahan pelajaran penuh tulisan atau tidak rapi','2');
INSERT INTO "klasifikasi" VALUES (36,'K36','Sulit untuk bisa duduk diam dan tenang','3');
INSERT INTO "klasifikasi" VALUES (37,'K37','Cenderung terkesan pada cahaya','2');
INSERT INTO "klasifikasi" VALUES (38,'K38','Cenderung terkesan pada tarian','3');
INSERT INTO "klasifikasi" VALUES (39,'K39','Cenderung terkesan pada melodi atau nada','1');
INSERT INTO "klasifikasi" VALUES (40,'K40','Kecenderungan memulai kalimat opini: "menurut yang saya lakukan"','3');
INSERT INTO "klasifikasi" VALUES (41,'K41','Kecenderungan memulai kalimat opini: "menurut yang saya dengar"','1');
INSERT INTO "klasifikasi" VALUES (42,'K42','Kecenderungan memulai kalimat opini: "menurut yang saya lihat"','2');
INSERT INTO "klasifikasi" VALUES (43,'K43','Suka diajari oleh guru dengan cara  menggambarkan suatu objek di papan tulis','2');
INSERT INTO "klasifikasi" VALUES (44,'K44','Suka diajari oleh guru dengan cara mempraktikkan dan menyentuh objek yang dibicarakan','3');
INSERT INTO "klasifikasi" VALUES (45,'K45','Suka diajari oleh guru dengan cara menjelaskan dengan suara indah','1');
INSERT INTO "klasifikasi" VALUES (46,'K46','Cenderung memilih untuk tidur di kamar yang gelap','2');
INSERT INTO "klasifikasi" VALUES (47,'K47','Cenderung memilih untuk tidur di ruang yang tenang/sepi','1');
INSERT INTO "klasifikasi" VALUES (48,'K48','Cenderung memilih untuk tidur di ranjang yang nyaman','3');
INSERT INTO "klasifikasi" VALUES (49,'K49','Suka mendengar dialog pada saat menonton film','1');
INSERT INTO "klasifikasi" VALUES (50,'K50','Suka melihat pemandangan/latar background pada saat nonton film','2');
INSERT INTO "klasifikasi" VALUES (51,'K51','Suka mengamati akting para aktor pada saat menonton film dan cenderung ingin mempraktekkannya','3');
INSERT INTO "klasifikasi" VALUES (52,'K52','Suka mencoba barang/produk yang ingin dibeli','3');
INSERT INTO "klasifikasi" VALUES (53,'K53','Sangat tertarik pada model produk (desain dan warna) yang akan dibeli','2');
INSERT INTO "klasifikasi" VALUES (54,'K54','Mudah tertarik pada suatu produk ketika ada penjelasan baik dari penjualnya','1');
INSERT INTO "klasifikasi" VALUES (55,'K55','Cenderung suka pada praktek langsung dalam merakit sesuatu','3');
INSERT INTO "klasifikasi" VALUES (56,'K56','Cenderung butuh diagram alur kerja dalam merakit sesuatu','2');
INSERT INTO "klasifikasi" VALUES (57,'K57','Cenderung ingin dijelaskan secara lisan dalam merakit sesuatu','1');
INSERT INTO "kategori" VALUES (1,'Auditori',1);
INSERT INTO "kategori" VALUES (2,'Visual',1);
INSERT INTO "kategori" VALUES (3,'Kinestetik',1);
INSERT INTO "kategori" VALUES (4,'Audio - Visual',0);
INSERT INTO "kategori" VALUES (5,'Audio - Kinestetik',0);
INSERT INTO "kategori" VALUES (6,'Visual - Kinestetik',0);
COMMIT;
