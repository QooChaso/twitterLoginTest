
import http.HttpClient

object Main extends App{
  val client = new HttpClient
  val header = Map{
    "Cache-Control" -> "public"
    "Content-Length" -> "219"
    "Content-Type" -> "text/html;"
    "Server" -> "gws"
    "X-Frame-Options" ->  "SAMEORIGIN"
    "X-XSS-Protection" -> "0"
  }

  val response = client.Get("http://google.com", header)
  print(response)
}


//Google.comのheader内容
/*
Cache-Control: public, max-age=2592000
Content-Length: 219
Content-Type: text/html; charset=UTF-8
Date: Fri, 10 May 2019 04:12:33 GMT
Expires: Sun, 09 Jun 2019 04:12:33 GMT
Location: http://www.google.com/
Server: gws
X-Frame-Options: SAMEORIGIN
X-XSS-Protection: 0
 */