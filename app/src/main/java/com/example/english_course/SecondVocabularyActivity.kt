package com.example.english_course

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondVocabularyActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_vocabulary)


        val text = findViewById<TextView>(R.id.vocab_content2)

        text.text = "Record * - Запись\n" +
                "Remember * - Запомнить\n" +
                "Repair * - Починить\n" +
                "Return ** - Вернутся\n" +
                "Run ** - Бежать\n" +
                "Say * - Сказать\n" +
                "See ** - Увидеть\n" +
                "Send * - Отправить\n" +
                "Share * - Поделиться\n" +
                "Shout * - Кричать\n" +
                "Show * - Показать\n" +
                "Spend ** - Потратить\n" +
                "Sit * - Сидеть\n" +
                "Sleep ** - Уснуть\n" +
                "Smoke * - Курить\n" +
                "Start ** - Начать\n" +
                "Stop ** - Остановиться\n" +
                "Steal * - Украсть\n" +
                "Teach ** - Учить\n" +
                "Tell * - Рассказать\n" +
                "Think ** - Думать\n" +
                "Try * - Попробовать\n" +
                "Understand * - Понять\n" +
                "Use ** - Использовать\n" +
                "Wait (for) ** - Дождаться чего-то\n" +
                "Wake up ** - Проснутся\n" +
                "Walk ** - Ходить\n" +
                "Want ** - Подождать\n" +
                "Wash * - Помыть\n" +
                "Watch ** - Смотреть\n" +
                "Win ** - Выиграть\n" +
                "Worry * - Беспокоится\n" +
                "NOUNS\n" +
                "Adult * - Подросток\n" +
                "Adventure * - Приклячения\n" +
                "Advice * - Совет\n" +
                "Amount * - \n" +
                "Bag * - Умолять\n" +
                "Ball * - Мяч\n" +
                "Bridge * - Мост\n" +
                "Character * - Буква\n" +
                "Channel * - Канал\n" +
                "Coin * - Монета\n" +
                "Colleague ** - Коллега\n" +
                "Corner * - Угол\n" +
                "Costume * - Костюм\n" +
                "Crowd * - Толпа\n" +
                "Earth * - Земля\n" +
                "Engine * - Двигатель\n" +
                "Experience ** - Опыт\n" +
                "Fan * - Фан\n" +
                "Flag * - Флаг\n" +
                "Flower * - Цветок\n" +
                "Glasses * - Очки\n" +
                "Gentleman * Джентельмен\n" +
                "Guest ** - Гость\n" +
                "Guest house * - Гость\n" +
                "Gym ** - Тренажёрный зал\n" +
                "Habit ** - Привычка\n" +
                "Height * - Высота\n" +
                "Hospital * - Больница\n" +
                "Illness * - Болезнь\n" +
                "Invitation * - Изобретение\n" +
                "Lady * - Леди\n" +
                "Letter * - Письмо\n" +
                "Lie ** - Ложь\n" +
                "Life * - Жизнь\n" +
                "Key * - Ключ\n" +
                "Member ** - Участник\n" +
                "Memory stick *\n" +
                "Middle * - Середина\n" +
                "Moon * - Луна\n" +
                "Oil * - Масло\n" +
                "Opinion ** - Мнение\n" +
                "Part * - Часть\n" +
                "Passenger ** - Пассажир\n" +
                "People * - Люди\n" +
                "Person * - Человек\n" +
                "Petrol * \n" +
                "Phone * - Телефон\n" +
                "Mobile Phone * - Мобильный Телефон\n" +
                "Smartphone * - Смартфон\n" +
                "Plant ** - Растение\n" +
                "Pocket * - Карман\n" +
                "Public transport * - Общественный Транспорт\n" +
                "Prize * - Приз\n" +
                "Problem * - Проблема\n" +
                "Receipt ** - Чек\n" +
                "Salary ** - Зарплата\n" +
                "Seat * - Место\n" +
                "Seatbelt ** - Ремень\n" +
                "Scarf ** - Шарф\n" +
                "Speed * - Скорость"

        val btn = findViewById<Button>(R.id.btn_vocab_two)

        btn.setOnClickListener {
            goAnother()
        }

    }

    private fun goAnother(){
        startActivity(Intent(this, MainThreeActivity::class.java))
        finish()
    }
}