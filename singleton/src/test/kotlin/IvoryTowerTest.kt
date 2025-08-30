// A no-arg lambda (function) that returns the IvoryTower singleton when invoked
private val ivoryTowerProvider: () -> IvoryTower = {
    IvoryTower
}

class IvoryTowerTest : SingletonTest<IvoryTower>(ivoryTowerProvider)
