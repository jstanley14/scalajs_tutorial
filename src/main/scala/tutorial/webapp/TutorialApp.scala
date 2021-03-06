package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery



object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }


  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>HelloW orld!</p>")
  }
}