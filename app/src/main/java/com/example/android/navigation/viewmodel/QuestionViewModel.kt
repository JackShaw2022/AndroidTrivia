package com.example.android.navigation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android.navigation.data.Question

class QuestionViewModel: ViewModel() {

    val questionList: MutableList<Question> = mutableListOf(
        Question(
            question = "What is Android Jetpack?",
            answers = listOf("All of these", "Tools", "Documentation","Libraries")),
        Question(
            question = "What is the base class for layouts?",
            answers = listOf("ViewGroup", "ViewSet", "ViewCollection", "ViewRoot")),
        Question(
            question = "What layout do you use for complex screens?",
            answers = listOf("ConstraintLayout", "GridLayout", "LinearLayout","FrameLayout")),
        Question(
            question = "What do you use to push structured data into a layout?",
            answers = listOf("Data binding", "Data pushing", "Set text", "An OnClick method")
        ),
        Question(
            question = "What method do you use to inflate layouts in fragments?",
            answers = listOf("onCreateView()", "onActivityCreated()", "onCreateLayout()", "onInflateLayout()")))
}