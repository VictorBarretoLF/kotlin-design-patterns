package from.refactoring.guru

abstract class Dialog {
    fun renderWindow() {
        val okButton = createButton()
        okButton.render()
    }

    abstract fun createButton(): Button
}
