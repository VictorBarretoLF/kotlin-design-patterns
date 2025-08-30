package from.github.java.design.patterns

data class OrcWeapon(val weaponType: WeaponType) : Weapon {
    override fun toString(): String {
        return "an orcish $weaponType"
    }

    override fun weaponType(): WeaponType = weaponType
}
