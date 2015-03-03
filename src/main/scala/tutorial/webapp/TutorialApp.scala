package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

import scala.scalajs.js.annotation.JSExport

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery("body").append("<p>Hellow Orld!</p>")
  }

  @JSExport
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }
}