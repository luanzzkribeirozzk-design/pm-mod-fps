package com.pm.mod.game

object GameState {
    var infiniteAmmo: Boolean = false
    var maxDamage: Boolean = false
    var speedBoost: Boolean = false
    var godMode: Boolean = false

    var playerHP: Int = 100
        get() = if (godMode) 100 else field
        set(value) { if (!godMode) field = value.coerceIn(0, 100) }

    var ammo: Int = 30
        get() = if (infiniteAmmo) 9999 else field
        set(value) { if (!infiniteAmmo) field = value.coerceIn(0, 9999) }

    var damage: Int = 25
        get() = if (maxDamage) 9999 else field

    var moveSpeed: Float = 5f
        get() = if (speedBoost) field * 2.5f else field

    var score: Int = 0
    var kills: Int = 0
    var isGameOver: Boolean = false

    fun reset() {
        playerHP = 100
        ammo = 30
        score = 0
        kills = 0
        isGameOver = false
    }
}
