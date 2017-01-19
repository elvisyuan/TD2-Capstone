package td2.client.ui.view

import javafx.application.Platform
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TabPane
import no.tornado.fxsample.login.LoginController
import no.tornadofx.showcase.Styles
import tornadofx.App
import tornadofx.View
import tornadofx.addClass
import tornadofx.button
import tornadofx.hbox
import tornadofx.plusAssign
import tornadofx.tab
import tornadofx.tabpane


class Mainview : View() {
	
	val loginController: LoginController by inject()
	
    val withFxProperties: ParticipantView by inject()
	
	val buttonLogout: Button =  button("Logout") {
    	setOnAction {
    		loginController.logout()
        }
    }
	
	val buttonExit: Button = button("Exit") {
		setOnAction {
			Platform.exit()
        }
	}
    override val root = tabpane {
        setPrefSize(1900.0, 1080.0)
        tabClosingPolicy = TabPane.TabClosingPolicy.UNAVAILABLE
		tab("Upload Data") {
			hbox {
				this@hbox += Label("Under Development")
			}
		}
		tab("Filter Participant") {
			hbox {
				this@hbox += Label("Under Development")
			}
		}
        tab("Particiant Records") {
            hbox {
                this@hbox += withFxProperties.root
            }
        }
		tab("Upload Form") {
			hbox {
				this@hbox += Label("Under Development")
			}
		}
		tab("Manage Account") {
			hbox {
				this@hbox += buttonLogout
				this@hbox += Label("Under Development")
			}
		}
    }
}