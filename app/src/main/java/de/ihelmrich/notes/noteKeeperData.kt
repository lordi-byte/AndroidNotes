package de.ihelmrich.notes

class CourseInfo (val courseID: String, var title: String)

class NoteInfo (var course: CourseInfo, var title: String)