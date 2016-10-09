package component
import org.scalatest._

class UserComponentSpec extends FlatSpec with Matchers {
  object UserComponentObj extends UserComponentImpl

  it should "create new user with UserComponent" in {
    val newUser = UserComponentObj.userRepository.createUser("test","1234")
    newUser.name should be ("test")
    newUser.password should be ("1234")
  }
}
