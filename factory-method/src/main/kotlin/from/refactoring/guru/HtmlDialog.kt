package from.refactoring.guru

class HtmlDialog : Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}
