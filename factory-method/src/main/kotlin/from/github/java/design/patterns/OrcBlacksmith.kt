package from.github.java.design.patterns

class OrcBlacksmith : Blacksmith {
    companion object {
        private val ORC_ARSENAL: Map<WeaponType, OrcWeapon> =
            WeaponType.entries.associateWith { OrcWeapon(it) }
    }

    override fun manufactureWeapon(weaponType: WeaponType): Weapon {
        return ORC_ARSENAL[weaponType]!!
    }

    override fun toString(): String {
        return "The orc blacksmith"
    }
}
