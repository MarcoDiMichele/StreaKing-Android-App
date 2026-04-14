package com.marcodimichele.streaking

/**
 * Manages the streak logic for the application.
 */
object StreakManager {
    /**
     * Increments the current streak by one.
     */
    fun updateStreak(currentStreak: Int): Int = currentStreak + 1
}