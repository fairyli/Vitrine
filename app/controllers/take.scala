package controllers

import play.api._
import play.api.mvc._

object take extends Controller {
  def take = Action {
    Ok(views.html.takepict("Bonjour"))
  }

}
