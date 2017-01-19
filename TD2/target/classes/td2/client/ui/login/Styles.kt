package no.tornado.fxsample.login

import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class Styles : Stylesheet() {
    companion object {
        val loginScreen by cssclass()
    }

    init {
        select(loginScreen) {
            padding = box(25.px)
            vgap = 15.px
            hgap = 10.px
        }
    }
}