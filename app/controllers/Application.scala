package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
}
object Blog extends Controller {
  
  def post(id: Integer) = Action{
    Ok("This is a fake post with id: " + id)
  }
  
}