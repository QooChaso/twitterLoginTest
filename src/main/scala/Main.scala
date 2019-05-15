
import http.HttpClient
import com.typesafe.config.ConfigFactory

object Main extends App{
  val client = new HttpClient
  val conf = ConfigFactory.load()

  val twitterHomeHeader = Map{
    "cache-control" -> "max-age=0"
    "content-type" -> "application/x-www-form-urlencoded"
    "dnt" -> "1"
    "referer" -> "https://twitter.com/"
    "upgrade-insecure-requests" -> "1"
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36"
  }

  val response = client.Get(conf.getString(""), twitterHomeHeader)
  print(response.body)
}
