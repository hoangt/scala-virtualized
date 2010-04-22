/*-enable-unique*/
import scala.annotation.{unique, transient}
import scala.annotation.Unique._

class C {

  var f: C @unique = null

  @transient
  def m(x: C @unique) {
    swap(this.f, x)
  }

}
