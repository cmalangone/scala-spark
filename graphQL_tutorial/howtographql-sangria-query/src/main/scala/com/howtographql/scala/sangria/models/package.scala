package com.howtographql.scala.sangria

import akka.http.scaladsl.model.DateTime
import sangria.execution.FieldTag
import sangria.execution.deferred.HasId
import sangria.validation.Violation

package object models {

  //case class Link(id: Int, url: String, description: String, postedBy: Int, createdAt: DateTime = DateTime.now) extends Identifiable
  case class Link(id: Int, url: String, description: String)
}
