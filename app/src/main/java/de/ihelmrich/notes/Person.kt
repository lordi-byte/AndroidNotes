package de.ihelmrich.notes

class Person constructor(val name: String, var weightLbs: Double) {
    var weightKg: Double
        get() = weightLbs / 2.2
        set(value) {
            weightLbs = value * 2.2
        }
}