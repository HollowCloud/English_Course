package com.example.english_course

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdVocabularyActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_vocabulary)

        val text = findViewById<TextView>(R.id.vocab_content3)

        text.text = "Sweep (v) - Подметать\n" +
                "Wash (v) - Мыть\n" +
                "Clean (v) - Убратся\n" +
                "Tidy (v) - Убратся\n" +
                "Housework (n) - Домашние дела\n" +
                "Get dressed (v) - Одется\n" +
                "Get undressed (v) - Раздется\n" +
                "Have a shower (v) - Сходить в душ\n" +
                "Watch TV (v) - Смотреть ТВ\n" +
                "Go to work (v) - Идти на работу\n" +
                "Go to bed (v) - Идти в кровать\n" +
                "Brush (PD*) hair/teeth - Расчесать/Почистить\n" +
                "Shave (v) - Побрится\n" +
                "Laundry/washing (n) - Стирка\n" +
                "Do exercise (v) - Делать упражнения\n" +
                "alarm clock - будильник\n" +
                "bedside table - прикроватный столик\n" +
                "lamp - лампа\n" +
                "microwave - микроволновка\n" +
                "cupboards - шкафы\n" +
                "fridge - холодильник\n" +
                "pot - горшок\n" +
                "spoon - ложка\n" +
                "bed - кровать\n" +
                "mirror - зеркало\n" +
                "soap - мыло\n" +
                "stove - печь\n" +
                "blanket - одеяло\n" +
                "oven - печка\n" +
                "sheet - простыня\n" +
                "wardrobe/closet - гардероб\n" +
                "hob - плита\n" +
                "TV/ television - ТВ\n" +
                "Radio - Радио\n" +
                "Computer – laptop/desktop - Компьютер\n" +
                "Stairs - Лестницы\n" +
                "Door – door handle - Дверь\n" +
                "toilet - туалет\n" +
                "комод - \n" +
                "pillow - подушка\n" +
                "shower - душ\n" +
                "toothbrush - зубная щётка\n" +
                "fork - вилка\n" +
                "plate - тарелка\n" +
                "sink - тонуть\n" +
                "towel - полотенце\n" +
                "Keen on - Сосредоточься\n" +
                "Fond of - Любят\n" +
                "Good at - Хорош в\n" +
                "Bad at - Плох в\n" +
                "Excited about - Взволнован\n" +
                "Interested in - Заинтересован в\n" +
                "Fascinated by - Очарован\n" +
                "Bored with - Скучно\n" +
                "Amazed at - Удивлён\n" +
                "Listen to - Слушаться\n" +
                "Look at - Смотреть на\n" +
                "Wait for - Ждать кого-то\n" +
                "Laugh at - Смеятся над\n" +
                "Depend on - Смотря на\n" +
                "Think about - Думать о\n" +
                "Prevent (sb) from - Не допустить\n" +
                "Lend to - Занять\n" +
                "Borrow from - Одолжить"

        val btn = findViewById<Button>(R.id.btn_vocab_three)

        btn.setOnClickListener {
            goAnother()
        }
    }

    private fun goAnother(){
        startActivity(Intent(this, MainThreeActivity::class.java))
        finish()
    }

}