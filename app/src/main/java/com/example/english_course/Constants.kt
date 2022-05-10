package com.example.english_course


object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "How old are you?",
            R.drawable.ic_flag_of_germany,
            "I am good.", "Yes",
            "I'm 27 years old", "I 31 years.", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "He went to the Stadium...",
            R.drawable.ic_flag_of_germany,
            "using train", "by taxi",
            "bus", "within the car", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "We haven't got ... money.",
            R.drawable.ic_flag_of_germany,
            "lots of", "some",
            "none of them", "any", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "She plays tennis...",
            R.drawable.ic_flag_of_germany,
            "on Wednesday", "with Wednesday",
            "at Wednesday", "by Wednesday", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "I ... a police officer",
            R.drawable.ic_flag_of_germany,
            "am", "is",
            "is not", "are", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Have you eaten your launch?",
            R.drawable.ic_flag_of_germany,
            "Have", "Yes, I has",
            "No, I haven't", "None of the above", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "It often ... on Saturday",
            R.drawable.ic_flag_of_germany,
            "rains", "cloudy",
            "foggy", "raining", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Who is this character?",
            R.drawable.ic_flag_of_germany,
            "Fire Rider", "Rider",
            "Ghost Rider", "Death", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "He sometimes ... a book",
            R.drawable.ic_flag_of_germany,
            "reads", "read",
            "does read", "reading", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "She ... TV everyday",
            R.drawable.study1,
            "watch", "watches",
            "did watch", "watching", 2
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "Gill and Harry ... right now",
            R.drawable.study2,
            "were studying", "study",
            "are studying", "N", 3
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "... today?",
            R.drawable.study2,
            "Did your sister worked", "Is your sister works",
            "Is your sister working", "Does your sister work", 3
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Miles didn't ... homework yesterday",
            R.drawable.study2,
            "did", "does",
            "do", "doing", 3
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "... crayons are the same",
            R.drawable.study2,
            "These", "This",
            "That", "They", 1
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Which is plural for 'fox'?",
            R.drawable.study2,
            "foxs", "foxes",
            "foxis", "foxys", 2
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "Which is plural for 'fish'",
            R.drawable.study2,
            "fishes", "fishy",
            "fishs", "None of the above", 4
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "Which is plural for ",
            R.drawable.study2,
            "were studying", "study",
            "are studying", "N", 3
        )

        questionsList.add(que17)

        val que18 = Question(
            18, "Which is plural for 'dress'",
            R.drawable.study2,
            "dress's", "dressys",
            "dresses", "dressis", 3
        )

        questionsList.add(que18)

        val que19 = Question(
            19, "Which is plural for 'child'",
            R.drawable.study2,
            "childs", "childrens",
            "children", "None of the above", 3
        )

        questionsList.add(que19)

        val que20 = Question(
            20, "... computers at this room",
            R.drawable.study2,
            "There are", "There is",
            "These are", "Is there", 1
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que21)

        val que22 = Question(
            22, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que22)

        val que23 = Question(
            23, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 1
        )

        questionsList.add(que23)

        val que24 = Question(
            24, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que24)

        val que25 = Question(
            25, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que25)

        val que26 = Question(
            26, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que26)

        val que27 = Question(
            27, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que27)

        val que28 = Question(
            28, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que28)

        val que29 = Question(
            29, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que29)

        val que30 = Question(
            30, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que30)

        val que31 = Question(
            31, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que31)

        val que32 = Question(
            32, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que32)

        val que33 = Question(
            33, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que21)

        val que34 = Question(
            34, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que34)

        val que35 = Question(
            35, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que35)

        val que36 = Question(
            36, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que36)

        val que37 = Question(
            37, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que37)

        val que38 = Question(
            38, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que38)

        val que39 = Question(
            39, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que39)

        val que40 = Question(
            40, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que40)

        val que41 = Question(
            41, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que41)

        val que42 = Question(
            42, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que42)

        val que43 = Question(
            43, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que43)

        val que44 = Question(
            44, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que44)

        val que45 = Question(
            45, "He challenged ... for a duel",
            R.drawable.study2,
            "he", "him",
            "his", "None of the above", 2
        )

        questionsList.add(que45)

        return questionsList
    }
}