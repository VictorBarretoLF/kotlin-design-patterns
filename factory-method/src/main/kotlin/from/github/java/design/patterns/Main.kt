package from.github.java.design.patterns

fun main() {
    val blacksmith: Blacksmith = OrcBlacksmith()
    var weapon: Weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR)
    println("Manufactured $weapon by $blacksmith")
    weapon = blacksmith.manufactureWeapon(WeaponType.AXE)
    println("Manufactured $weapon by $blacksmith")
}
