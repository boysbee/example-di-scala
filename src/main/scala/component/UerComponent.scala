package component

import domain.User

trait UserComponentImpl extends UserComponent { this:UserComponent =>
  def userRepository: UserRepository = new UserRepositoryImpl

  class UserRepositoryImpl extends UserRepository {
    def createUser(name: String, password: String): User = {
      new User(name,password)
    }
  }

}

trait UserComponent {
  def userRepository: UserRepository

  trait UserRepository {
    def createUser(name: String, password: String): User
  }

}

