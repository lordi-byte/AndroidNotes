package de.ihelmrich.notes

class Person constructor(name: String, weightLbs: Double) {
    val name = name
    var weightLbs = weightLbs
    var weightKg: Double
        get() = weightLbs / 2.2
        set(value) {
            weightLbs = value * 2.2
        }
}