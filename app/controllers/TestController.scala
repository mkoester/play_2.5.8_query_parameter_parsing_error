package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{Action, Controller}

@Singleton
class TestController @Inject() extends Controller {

  def testOptionString(stringOption: Option[String]) = Action {
    Ok(stringOption.toString)
  }

  def testString(string: String) = Action {
    Ok(string)
  }
}
