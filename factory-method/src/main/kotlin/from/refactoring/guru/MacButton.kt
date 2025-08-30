package from.refactoring.guru

import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.SwingConstants

class MacButton : Button {
    private val panel = JPanel()
    private val frame = JFrame()
    private lateinit var button: JButton

    override fun render() {
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val label =
            JLabel("Hello World!").apply {
                isOpaque = true
                background = Color(245, 245, 245)
                font = Font("Dialog", Font.BOLD, 44)
                horizontalAlignment = SwingConstants.CENTER
            }

        panel.layout = FlowLayout(FlowLayout.CENTER)
        frame.contentPane.add(panel)
        panel.add(label)
        onClick()
        panel.add(button)

        frame.setSize(320, 200)
        frame.isVisible = true
        onClick()
    }

    override fun onClick() {
        button =
            JButton("Exit").apply {
                addActionListener {
                    frame.isVisible = false
                    System.exit(0)
                }
            }
    }
}
