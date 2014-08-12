package controllers

import play.api._
import play.api.mvc._

object submit extends Controller {
  def submit = Action {
    Ok(views.html.submit())
  }

}
