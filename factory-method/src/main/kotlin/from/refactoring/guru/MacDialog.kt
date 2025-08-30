package from.refactoring.guru

class MacDialog : Dialog() {
    override fun createButton(): Button {
        return MacButton()
    }
}
