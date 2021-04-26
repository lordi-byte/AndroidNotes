package de.ihelmrich.notes

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with intents")
        courses.set(course.courseID, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseID, course)

        course = CourseInfo(title = "Java Fundamentals", courseID = "java_lang")
        courses.set(course.courseID, course)
    }
}