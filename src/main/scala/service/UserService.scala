package services

import component._

trait UserServiceComponentImpl extends UserServiceComponent with UserComponentImpl {
  this: UserServiceComponent =>
  def userService: UserService = new UserServiceImpl

  class UserServiceImpl extends UserService {
    def newUser(name:String, password: String): User = {
      userRepository.createUser(name,password)
    }
  }
}
trait UserServiceComponent {
  def userService: UserService

  trait UserService {
    def newUser(name: String, password: String): User
  }

}
