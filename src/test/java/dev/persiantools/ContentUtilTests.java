package dev.persiantools;

import org.junit.Test;

public class ContentUtilTests {

    @Test
    public void isPersian_PersianSentences_ReturnsTrue(){
        for (String phrase:getPurePersianSentences()) {
            assert ContentUtils.isPersian(phrase);
        }
    }

    @Test
    public void isPersian_PersianWords_ReturnsTrue(){
        for (String word:getPurePersianWords()) {
            assert ContentUtils.isPersian(word);
        }
    }

    @Test
    public void isPersian_PersianChr_ReturnsTrue(){
        for (String chr:getPurePersianChr()) {
            assert ContentUtils.isPersian(chr);
        }
    }

    @Test
    public void isPersian_NonPersianSentences_ReturnsFalse(){
        for (String phrase:getNonPersianSentences()) {
            assert !ContentUtils.isPersian(phrase);
        }
    }

    @Test
    public void isPersian_ArabicSentences_ReturnsFalse(){
        for (String phrase:getPureArabicSentences()) {
            assert !ContentUtils.isPersian(phrase);
        }
    }

    @Test
    public void isPersian_ArabicWords_ReturnsFalse(){
        for (String word:getPureArabicWords()) {
            assert !ContentUtils.isPersian(word);
        }
    }

    @Test
    public void isPersian_ArabicChr_ReturnsFalse(){
        for (String chr:getPureArabicChr()) {
            assert !ContentUtils.isPersian(chr);
        }
    }

    @Test
    public void hasPersian_MixSentences_ReturnsTrue(){
        for (String phrase:getMixedSentences()) {
            assert ContentUtils.isPersian(phrase);
        }
    }

    @Test
    public void hasPersian_NonPersianSentences_ReturnsFalse(){
        for (String phrase:getNonPersianSentences()) {
            assert !ContentUtils.isPersian(phrase);
        }
    }

    @Test
    public void hasPersian_PersianSentences_ReturnsTrue(){
        for (String phrase:getPurePersianSentences()) {
            assert !ContentUtils.isPersian(phrase);
        }
    }

    @Test
    public void hasPersian_ArabicSentences_ReturnsFalse(){
        for (String phrase:getPureArabicSentences()) {
            assert !ContentUtils.isPersian(phrase);
        }
    }

    private String[] getPurePersianSentences(){
        return new String[]{
            "لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت.",
            "لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.",
            "چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.",
            " کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد.",
            "در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها و شرایط سخت تایپ به پایان رسد و زمان مورد نیاز شامل حروفچینی دستاوردهای اصلی و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد.",
        };
    }

    private String[] getPurePersianWords(){
        return new String[]{
            "لورم",
            "ایپسوم",
            "متن",
            "ساختگی",
            "تولید",
            "با",
            "نامفهوم",
            "صنعت",
            "سادگی"
        };
    }

    private String[] getPurePersianChr(){
        return new String[]{
            "ل",
            "و",
            "ر",
            "م",
            "ا",
            "ی",
            "پ",
            "ص",
            "س",
            "ش",
            "ح",
            "ه",
            "ق",
            "غ",
            "ض",
            "ث",
            "گ",
        };
    }

    private String[] getPureArabicSentences(){
        return new String[]{
            "لكن لا بد أن أوضح لك أن كل هذه",
            "الأفكار المغلوطة حول استنكار  النشوة وتمجيد الألم نشأت بالفعل، وسأعرض لك ",
            "أو يتجنب الشعور بالسعادة، ولكن بفضل هؤلاء الأشخاص الذين لا يدركون بأن السعادة لا بد أن نستشعرها بصورة أكثر عقلانية ومنطقية فيعرضهم هذا لمواجهة الظروف الأليمة، وأكرر بأنه لا يوجد من يرغب في الحب ونيل المنال ويتلذذ بالآلام، الألم هو الألم ولكن نتيجة لظروف ما قد تكمن السعاده فيما نتحمله من كد وأسي.",
            "و سأعرض مثال حي لهذا، من منا لم يتحمل جهد بدني شاق إلا من أجل الحصول على ميزة أو فائدة؟ ولكن من لديه الحق أن ينتقد شخص ما أراد أن يشعر بالسعادة التي لا تشوبها عواقب أليمة أو آخر أراد أن يتجنب الألم الذي ربما تنجم عنه بعض المتعة ؟ ",
            "علي الجانب الآخر نشجب ونستنكر هؤلاء الرجال المفتونون بنشوة اللحظة الهائمون في رغباتهم فلا يدركون ما يعقبها من الألم والأسي المحتم، واللوم كذلك يشمل هؤلاء الذين أخفقوا في واجباتهم نتيجة لضعف إرادتهم فيتساوي مع هؤلاء الذين يتجنبون وينأون عن تحمل الكدح والألم .",
            "لوريم ايبسوم دولار سيت أميت",
            "وخلافاَ للاعتقاد السائد فإن لوريم إيبسوم ليس نصاَ عشوائياً، بل إن له جذور في الأدب اللاتيني الكلاسيكي منذ العام 45 قبل الميلاد. من كتاب \"حول أقاصي الخير والشر",
            " ٣٠, ونتج والحزب المذابح كل جوي. أسر كارثة المشتّتون بل, وبعض وبداية ال",
            "نسخه اليونانيه الاصليه",
            "لكن لا بد أن أوضح لك أن كل هذه",
        };
    }

    private String[] getPureArabicWords(){
        return new String[]{
            "المغلوطة ",
            "النشوة ",
            "نتيجة",
            "أو",
            " وينأو",
            "أميت",
            "والشر",
            " المشتّتون",
            "بالسعادة",
        };
    }

    private String[] getPureArabicChr(){
        return new String[]{
            "ﺔ",
            "ﺂ",
            "ﻲ",
            "ﻎ"
        };
    }

    private String[] getMixedSentences(){
        return new String[]{
          "This text includes فارسی",
          "Это персидский س текст?",
          "أكد رئيس اللجنة العسكرية الممثلة لحكومة الوفاق أراضي البلاد",
        };
    }

    private String[] getNonPersianSentences(){
        return new String[]{
            "これはペルシア語のテキストですか",
            "Это персидский текст?",
            "这是波斯文字吗?",
            "Lorem Ipsum Test",
            "лорем ипсум",
        };
    }
}
