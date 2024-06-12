package com.tugbabingol.jobapp.Repository

import com.tugbabingol.jobapp.Model.JobModel

class MainRepository {
    //all of date in this class is for example, you can use your data with api service
    val location = listOf("Los Angelos, USA","New York, Usa")
    val category = listOf("all","Accountant", "Programmer", "Write")

    val exampleText: String=
        "We are searching for a talented and motivated this job to join our growing team. In this role, you will be responsible for this job and will be responsible for this job."

    val items = listOf(
        JobModel(
            "UI Designer",
            "ChabokSoft",
            "logo1",
            "Full-Time",
            "Remote",
            "Intership",
            "New York, USA",
            "\$38k - \$46K",
            "2",
            exampleText,
            exampleText
        ),
        JobModel(
            "Accountants",
            "KiamSoft",
            "logo2",
            "Part-Time",
            "Remote",
            "In person",
            "Los Angelos, USA",
            "\$26k - \$36K",
            "1",
            exampleText,
            exampleText
        ),
        JobModel(
            "The author of the news",
            "MekanSoft",
            "logo3",
            "Part-Time",
            "Remote",
            "Senior Level",
            "New York, USA",
            "\$20k - \$23K",
            "3",
            exampleText,
            exampleText
        ),
        JobModel(
            "Kotlin Programmer",
            "TestSoft",
            "logo4",
            "Full-Time",
            "Remote",
            "Intership",
            "Los Angelos, USA",
            "\$38k - \$40K",
            "2",
            exampleText,
            exampleText
        ),

    )
}