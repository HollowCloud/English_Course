package com.example.english_course

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstVocabularyActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_vocabulary)

        val text = findViewById<TextView>(R.id.vocab_content)

        text.text = "Correct (adj/ v)* - Правильно\n" +
                "Course (n)* - Курс\n" +
                "Dictionary (n)* - Словарь\n" +
                "Describe (v)* - Описывать\n" +
                "Discuss (v)* - Обсуждать\n" +
                "Exercise (n)* - Упражнение\n" +
                "Exam (n)* - Экзамен\n" +
                "False (adj)* - Неверно\n" +
                "Form (n)* - Форма\n" +
                "Group (n)* - Группа\n" +
                "Information ** - Информация\n" +
                "Interview (v/ n)* - Интервью\n" +
                "Journal (n) - Журнал\n" +
                "Language (n)* - Язык(иностраный)\n" +
                "Lesson (n)* - Урок\n" +
                "Library (n)** - Библиотека\n" +
                "List (n) - Лист\n" +
                "Listen (v)** - Слушать\n" +
                "Match (v)** - Соотвествовать\n" +
                "Mean (v)* - Иметь ввиду\n" +
                "Meaning (n)* - Значение\n" +
                "Order (n/v) - Приказ/Приказать\n" +
                "Page (n)* - Страница\n" +
                "Pair (n)* - Пара\n" +
                "Partner (n) - Партнер\n" +
                "Practice (n)* - Практика\n" +
                "Practise (v)* - Правктиковаться\n" +
                "Project (n) - Проект\n" +
                "Question (n)** - Вопрос\n" +
                "Quiz (n)* - Опрос\n" +
                "Read (v) ** - Читать\n" +
                "Repeat (v)** - Повторять\n" +
                "Speak (v) ** - Говорить\n" +
                "Spell (v) - Произносить\n" +
                "Subject (n)* - Предмет\n" +
                "Study (v)* - Учиться\n" +
                "Talk (v)** - Говорить\n" +
                "Test (n)* - Тест\n" +
                "True (adj)* - Верно\n" +
                "Unit (n)* - Единица\n" +
                "University (n)* - Университет\n" +
                "Write (v)** - Писать\n" +
                "Writing (n) - Провописание\n" +
                "Wrong (adj)* - Неверный\n" +
                "PREPOSITIONS\n" +
                "About * - Про(кого-то, что-то)\n" +
                "Above * - Сверху\n" +
                "Across * - Через\n" +
                "After * - После\n" +
                "At * - В\n" +
                "Back * - Назад\n" +
                "Before * - Перед\n" +
                "Behind * - Сзади\n" +
                "Between * - Между\n" +
                "Centre * - Центр\n" +
                "Down * - Снизу\n" +
                "For * - Для\n" +
                "From * - От\n" +
                "Front * - Спереди\n" +
                "In * - Внутри\n" +
                "Near * - Возле\n" +
                "Of"

        val btn = findViewById<Button>(R.id.btn_vocab_one)

        btn.setOnClickListener {
            goAnother()
        }


    }

    fun goAnother(){
        startActivity(Intent(this, MainThreeActivity::class.java))
        finish()
    }
}