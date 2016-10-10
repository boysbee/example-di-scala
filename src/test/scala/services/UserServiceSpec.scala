package services

import org.scalatest._
import service.UserServiceComponentImpl

class UserServiceSpec extends FlatSpec with Matchers {

  object UserServiceObj extends UserServiceComponentImpl

  it should "create new user with UserServiceComponent " in {
    val newUser = UserServiceObj.userService.newUser("test","1234")
    newUser.name should be ("test")
    newUser.password should be ("1234")
  }
}
