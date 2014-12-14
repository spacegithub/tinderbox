package utils.tinder.model

import scala.annotation.meta.field
import com.fasterxml.jackson.annotation._
import com.fasterxml.jackson.databind.annotation._


/**
 * Represents a profile of another user.
 * @param _id
 * @param bio
 * @param birth_date
 * @param birth_date_info
 * @param common_friend_count
 * @param common_friends
 * @param common_like_count
 * @param common_likes
 * @param distance_mi
 * @param gender
 * @param name
 * @param photos
 * @param ping_time
 * @param id
 */
@JsonIgnoreProperties(ignoreUnknown=true)
case class Profile(
  @(JsonProperty@field)("_id")
  val _id: String,

  @(JsonProperty@field)("bio")
  val bio: String,

  @(JsonProperty@field)("birth_date")
  val birth_date: String,

  @(JsonProperty@field)("birth_date_info")
  val birth_date_info: String,

  @(JsonProperty@field)("common_friend_count")
  val common_friend_count: Int,

  @(JsonProperty@field)("common_friends")
  val common_friends: List[String],

  @(JsonProperty@field)("common_like_count")
  val common_like_count: Int,

  @(JsonProperty@field)("common_likes")
  val common_likes: List[String],

  @(JsonProperty@field)("distance_mi")
  val distance_mi: Int,

  @(JsonProperty@field)("gender")
  val gender: Int,

  @(JsonProperty@field)("name")
  val name: String,

  @(JsonProperty@field)("photos")
  val photos: List[Photo],

  @(JsonProperty@field)("ping_time")
  val ping_time: String
) {
  /**
   * necessary for object instantiation
   */
  def this() = this("","","","",0,List(""),0,List(""),0,0,"",List(new Photo()),"")
}


/**
 * A shortened profile class used in match info.
 * @param _id
 * @param bio
 * @param birth_date
 * @param gender
 * @param name
 * @param photos
 * @param ping_time
 */
@JsonIgnoreProperties(ignoreUnknown=true)
case class ProfileBrief(
  @(JsonProperty@field)("_id")
  val _id: String,

  @(JsonProperty@field)("bio")
  val bio: String,

  @(JsonProperty@field)("birth_date")
  val birth_date: String,

  @(JsonProperty@field)("gender")
  val gender: Int,

  @(JsonProperty@field)("name")
  val name: String,

  @(JsonProperty@field)("photos")
  val photos: List[Photo],

  @(JsonProperty@field)("ping_time")
  val ping_time: String
  ) {
  /**
   * necessary for object instantiation
   */
  def this() = this("","","",0,"",List(new Photo()),"")
}
