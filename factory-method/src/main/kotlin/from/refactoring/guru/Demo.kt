package from.refactoring.guru

object Demo {
    private lateinit var dialog: Dialog

    @JvmStatic
    fun main(args: Array<String>) {
        configure()
        runBusinessLogic()
    }

    private fun configure() {
        val osName = System.getProperty("os.name")

        dialog =
            when {
                osName.contains("Windows") -> WindowsDialog()
                osName.contains("Mac") -> MacDialog()
                else -> HtmlDialog()
            }
    }

    private fun runBusinessLogic() {
        dialog.renderWindow()
    }
}
