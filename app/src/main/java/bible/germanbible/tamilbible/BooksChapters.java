package bible.germanbible.tamilbible;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 7/04/2018.
 */
public class BooksChapters {

    public static int  getChaptersCount(int book)
    {
        HashMap<Integer,Integer> booksChapters = new HashMap<Integer,Integer>();
        booksChapters.put(	1 , 50	);
        booksChapters.put(	2 , 40	);
        booksChapters.put(	3 , 27	);
        booksChapters.put(	4 , 36	);
        booksChapters.put(	5 , 34	);
        booksChapters.put(	6 , 24	);
        booksChapters.put(	7 , 21	);
        booksChapters.put(	8 , 4	);
        booksChapters.put(	9 , 31	);
        booksChapters.put(	10 , 24	);
        booksChapters.put(	11 , 22	);
        booksChapters.put(	12 , 25	);
        booksChapters.put(	13 , 29	);
        booksChapters.put(	14 , 36	);
        booksChapters.put(	15 , 10	);
        booksChapters.put(	16 , 13	);
        booksChapters.put(	17 , 10	);
        booksChapters.put(	18 , 42	);
        booksChapters.put(	19 , 150);
        booksChapters.put(	20 , 31	);
        booksChapters.put(	21 , 12	);
        booksChapters.put(	22 , 8	);
        booksChapters.put(	23 , 66	);
        booksChapters.put(	24 , 52	);
        booksChapters.put(	25 , 5	);
        booksChapters.put(	26 , 48	);
        booksChapters.put(	27 , 12	);
        booksChapters.put(	28 , 14	);
        booksChapters.put(	29 , 3	);
        booksChapters.put(	30 , 9	);
        booksChapters.put(	31 , 1	);
        booksChapters.put(	32 , 4	);
        booksChapters.put(	33 , 7	);
        booksChapters.put(	34 , 3	);
        booksChapters.put(	35 , 3	);
        booksChapters.put(	36 , 3	);
        booksChapters.put(	37 , 2	);
        booksChapters.put(	38 , 14	);
        booksChapters.put(	39 , 4	);
        booksChapters.put(	40 , 28	);
        booksChapters.put(	41 , 16	);
        booksChapters.put(	42 , 24	);
        booksChapters.put(	43 , 21	);
        booksChapters.put(	44 , 28	);
        booksChapters.put(	45 , 16	);
        booksChapters.put(	46 , 16	);
        booksChapters.put(	47 , 13	);
        booksChapters.put(	48 , 6	);
        booksChapters.put(	49 , 6	);
        booksChapters.put(	50 , 4	);
        booksChapters.put(	51 , 4	);
        booksChapters.put(	52 , 5	);
        booksChapters.put(	53 , 3	);
        booksChapters.put(	54 , 6	);
        booksChapters.put(	55 , 4	);
        booksChapters.put(	56 , 3	);
        booksChapters.put(	57 , 1	);
        booksChapters.put(	58 , 13	);
        booksChapters.put(	59 , 5	);
        booksChapters.put(	60 , 5	);
        booksChapters.put(	61 , 3	);
        booksChapters.put(	62 , 5	);
        booksChapters.put(	63 , 1	);
        booksChapters.put(	64 , 1	);
        booksChapters.put(	65 , 1	);
        booksChapters.put(	66 , 22	);
        return booksChapters.get(book);
    }

    public static String getBookName(int booknumber) {
        Map<Integer, String> bookName = new HashMap<Integer, String>();
        bookName.put(1, "ஆதியாகமம்-Genesis");
        bookName.put(2, "யாத்திராகமம்-Exodus");
        bookName.put(3, "லேவியராகமம்-Levitikus");
        bookName.put(4, "எண்ணாகமம்--Numeri");
        bookName.put(5, "உபாகமம்-Deuteronomium");
        bookName.put(6, "யோசுவா-Josua");
        bookName.put(7, "நியாயாதிபதிகள்-Richter");
        bookName.put(8, "ரூத்-Rut");
        bookName.put(9, "1 சாமுவேல்-1.Samuel");
        bookName.put(10, "2 சாமுவேல்-2.Samuel");
        bookName.put(11, "1 இராஜாக்கள்-1.Könige");
        bookName.put(12, "2 இராஜாக்கள்-2.Könige");
        bookName.put(13, "1 நாளாகமம்-1.Chronik");
        bookName.put(14, "2 நாளாகமம்-2.Chronik");
        bookName.put(15, "எஸ்றா-Esra");
        bookName.put(16, "நெகேமியா-Nehemia");
        bookName.put(17, "எஸ்தர்-Ester");
        bookName.put(18, "யோபு-Hiob");
        bookName.put(19, "சங்கீதம்-Psalter");
        bookName.put(20, "நீதிமொழிகள்-Sprüche");
        bookName.put(21, "பிரசங்கி-Prediger");
        bookName.put(22, "உன்னதப்பாட்டு-Hohelied");
        bookName.put(23, "ஏசாயா-Jesaja");
        bookName.put(24, "எரேமியா-Jeremia");
        bookName.put(25, "புலம்பல்-Klagelieder");
        bookName.put(26, "எசேக்கியேல்-Hesekiel");
        bookName.put(27, "தானியேல்-Daniel");
        bookName.put(28, "ஓசியா-Hosea");
        bookName.put(29, "யோவேல்-Joel");
        bookName.put(30, "ஆமோஸ்-Amos");
        bookName.put(31, "ஒபதியா-Obadja");
        bookName.put(32, "யோனா-Jona");
        bookName.put(33, "மீகா-Micha");
        bookName.put(34, "நாகூம்-Nahum");
        bookName.put(35, "ஆபகூக்-Habakuk");
        bookName.put(36, "செப்பனியா-Zefanja");
        bookName.put(37, "ஆகாய்-Haggai");
        bookName.put(38, "சகரியா-Sacharja");
        bookName.put(39, "மல்கியா-Maleachi");
        bookName.put(40, "மத்தேயு-Matthäus");
        bookName.put(41, "மாற்கு-Markus");
        bookName.put(42, "லூக்கா-Lukas");
        bookName.put(43, "யோவான்-Johannes");
        bookName.put(44, "அப்போஸ்தலருடைய நடபடிகள்-Apostelgeschichte");
        bookName.put(45, "ரோமர்-Römer");
        bookName.put(46, "1 கொரிந்தியர்- 1.Korinther");
        bookName.put(47, "2 கொரிந்தியர் - 2.Korinther");
        bookName.put(48, "கலாத்தியர் - Galater");
        bookName.put(49, "எபேசியர் - Epheser");
        bookName.put(50, "பிலிப்பியர்-Philipper");
        bookName.put(51, "கொலோசெயர்-Kolosser");
        bookName.put(52, "1 தெசலோனிக்கேயர்-1.Thessalonicher");
        bookName.put(53, "2 தெசலோனிக்கேயர்-2.Thessalonicher");
        bookName.put(54, "1 தீமோத்தேய-1.Timotheus");
        bookName.put(55, "2 தீமோத்தேய-2.Timotheus");
        bookName.put(56, "தீத்து-Titus");
        bookName.put(57, "பிலேமோன்-Philemon");
        bookName.put(58, "எபிரெயர்-Hebräer");
        bookName.put(59, "யாக்கோபு-Jakobus");
        bookName.put(60, "1 பேதுரு-1.Petrus");
        bookName.put(61, "2 பேதுரு-2.Petrus");
        bookName.put(62, "1 யோவான-1.Johannes");
        bookName.put(63, "2 யோவான-2.Johannes");
        bookName.put(64, "3 யோவான-3 .Johannes");
        bookName.put(65, "யூதா-Judas");
        bookName.put(66, "வெளிப்படுத்தின விசேஷம்-Offenbarung");
        return bookName.get(booknumber);

    }

}
