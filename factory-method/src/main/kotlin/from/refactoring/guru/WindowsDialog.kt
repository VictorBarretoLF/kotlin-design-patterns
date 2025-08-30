package from.refactoring.guru

class WindowsDialog : Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}
