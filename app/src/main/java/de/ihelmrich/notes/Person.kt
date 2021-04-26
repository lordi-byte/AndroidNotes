package de.ihelmrich.notes

class Person(val name: String, var weightLbs: Double) {
    var weightKg: Double
        get() = weightLbs / 2.2
        set(value) {
            weightLbs = value * 2.2
        }

    fun eatLasagne(addedLasagne: Boolean = true) {
        weightKg += if (addedLasagne) 3.0 else 0.0
    }
    fun calcGoalWeightKg(kgToLose: Double = 2.0): Double {
        return weightKg - kgToLose
    }
}