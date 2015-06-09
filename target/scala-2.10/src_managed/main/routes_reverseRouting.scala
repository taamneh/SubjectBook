// @SOURCE:C:/first_play/conf/routes
// @HASH:ccacfec44ca8f53076e37f4606def77fdd3e941b
// @DATE:Mon Jun 08 21:55:30 CDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:46
// @LINE:44
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
package controllers {

// @LINE:39
class ReverseAssets {


// @LINE:39
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:46
// @LINE:44
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
class ReverseApplication {


// @LINE:19
def GetSignal(task:String, subject:String, studyId:Int, signal_type:Int, signal_sequence:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "GetSignal" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("task", task)), Some(implicitly[QueryStringBindable[String]].unbind("subject", subject)), Some(implicitly[QueryStringBindable[Int]].unbind("studyId", studyId)), Some(implicitly[QueryStringBindable[Int]].unbind("signal_type", signal_type)), Some(implicitly[QueryStringBindable[Int]].unbind("signal_sequence", signal_sequence)))))
}
                        

// @LINE:13
def getInfo(task:String, subject:String, studyId:Int, signal_type:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getInfo" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("task", task)), Some(implicitly[QueryStringBindable[String]].unbind("subject", subject)), Some(implicitly[QueryStringBindable[Int]].unbind("studyId", studyId)), Some(implicitly[QueryStringBindable[Int]].unbind("signal_type", signal_type)))))
}
                        

// @LINE:53
// @LINE:51
def authentication(): Call = {
   () match {
// @LINE:51
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "login")
                                         
   }
}
                                                

// @LINE:29
def displaySubject(studyNo:Int, SubjectId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "displaySubject" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("studyNo", studyNo)), Some(implicitly[QueryStringBindable[String]].unbind("SubjectId", SubjectId)))))
}
                        

// @LINE:65
def InsertSession(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "InsertSession")
}
                        

// @LINE:69
def uploadFile(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "upload")
}
                        

// @LINE:27
def showStudy(studyNo:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showStudy/" + implicitly[PathBindable[Int]].unbind("studyNo", studyNo))
}
                        

// @LINE:74
def editStudy(studyId:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editStudy/" + implicitly[PathBindable[Int]].unbind("studyId", studyId))
}
                        

// @LINE:17
def getPsycho(task:String, subject:String, studyId:Int, signal_type:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getPsycho" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("task", task)), Some(implicitly[QueryStringBindable[String]].unbind("subject", subject)), Some(implicitly[QueryStringBindable[Int]].unbind("studyId", studyId)), Some(implicitly[QueryStringBindable[Int]].unbind("signal_type", signal_type)))))
}
                        

// @LINE:44
def getVideo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "videoB")
}
                        

// @LINE:23
def zip(studyId:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "downloadStudy" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("studyId", studyId)))))
}
                        

// @LINE:33
def InsertNewStudy(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createStudy")
}
                        

// @LINE:15
def getPRF(task:String, subject:String, studyId:Int, signal_type:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getPRF" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("task", task)), Some(implicitly[QueryStringBindable[String]].unbind("subject", subject)), Some(implicitly[QueryStringBindable[Int]].unbind("studyId", studyId)), Some(implicitly[QueryStringBindable[Int]].unbind("signal_type", signal_type)))))
}
                        

// @LINE:72
def video(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "video")
}
                        

// @LINE:59
def submitRegistration(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:9
def ReceiveOauthData(state:String, code:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "display" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("state", state)), Some(implicitly[QueryStringBindable[String]].unbind("code", code)))))
}
                        

// @LINE:55
def ShowDriveDialog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ShowDriveDialog")
}
                        

// @LINE:37
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:7
def Main(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:46
def test(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                        

// @LINE:67
def editSubject(studyNo:Int, SubjectId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editSubject" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("studyNo", studyNo)), Some(implicitly[QueryStringBindable[String]].unbind("SubjectId", SubjectId)))))
}
                        

// @LINE:57
def Register(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:11
def getPortraitInfo(studyId:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "portrait" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("studyId", studyId)))))
}
                        

// @LINE:63
def insertSubject(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "InsertSubject")
}
                        

// @LINE:61
def shareMyStudy(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "InsertStudy")
}
                        

// @LINE:31
def ShowCreateStudyForm(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createStudy")
}
                        

// @LINE:25
def displayStudies(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "allStudies")
}
                        

// @LINE:21
def file(task:String, subject:String, studyId:Int, signal_type:Int, signal_sequence:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "file" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("task", task)), Some(implicitly[QueryStringBindable[String]].unbind("subject", subject)), Some(implicitly[QueryStringBindable[Int]].unbind("studyId", studyId)), Some(implicitly[QueryStringBindable[Int]].unbind("signal_type", signal_type)), Some(implicitly[QueryStringBindable[Int]].unbind("signal_sequence", signal_sequence)))))
}
                        

// @LINE:35
def deleteStudy(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteStudy")
}
                        

}
                          
}
                  


// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:46
// @LINE:44
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:39
class ReverseAssets {


// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:46
// @LINE:44
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
class ReverseApplication {


// @LINE:19
def GetSignal : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.GetSignal",
   """
      function(task,subject,studyId,signal_type,signal_sequence) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GetSignal" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("task", task), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("subject", subject), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyId", studyId), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("signal_type", signal_type), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("signal_sequence", signal_sequence)])})
      }
   """
)
                        

// @LINE:13
def getInfo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getInfo",
   """
      function(task,subject,studyId,signal_type) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getInfo" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("task", task), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("subject", subject), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyId", studyId), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("signal_type", signal_type)])})
      }
   """
)
                        

// @LINE:53
// @LINE:51
def authentication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authentication",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      }
   """
)
                        

// @LINE:29
def displaySubject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displaySubject",
   """
      function(studyNo,SubjectId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "displaySubject" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyNo", studyNo), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("SubjectId", SubjectId)])})
      }
   """
)
                        

// @LINE:65
def InsertSession : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.InsertSession",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InsertSession"})
      }
   """
)
                        

// @LINE:69
def uploadFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.uploadFile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
      }
   """
)
                        

// @LINE:27
def showStudy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showStudy",
   """
      function(studyNo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showStudy/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("studyNo", studyNo)})
      }
   """
)
                        

// @LINE:74
def editStudy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editStudy",
   """
      function(studyId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editStudy/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("studyId", studyId)})
      }
   """
)
                        

// @LINE:17
def getPsycho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPsycho",
   """
      function(task,subject,studyId,signal_type) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getPsycho" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("task", task), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("subject", subject), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyId", studyId), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("signal_type", signal_type)])})
      }
   """
)
                        

// @LINE:44
def getVideo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getVideo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videoB"})
      }
   """
)
                        

// @LINE:23
def zip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.zip",
   """
      function(studyId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadStudy" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyId", studyId)])})
      }
   """
)
                        

// @LINE:33
def InsertNewStudy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.InsertNewStudy",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createStudy"})
      }
   """
)
                        

// @LINE:15
def getPRF : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPRF",
   """
      function(task,subject,studyId,signal_type) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getPRF" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("task", task), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("subject", subject), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyId", studyId), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("signal_type", signal_type)])})
      }
   """
)
                        

// @LINE:72
def video : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.video",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "video"})
      }
   """
)
                        

// @LINE:59
def submitRegistration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.submitRegistration",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:9
def ReceiveOauthData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ReceiveOauthData",
   """
      function(state,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "display" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("state", state), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code)])})
      }
   """
)
                        

// @LINE:55
def ShowDriveDialog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ShowDriveDialog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ShowDriveDialog"})
      }
   """
)
                        

// @LINE:37
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:7
def Main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:46
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

// @LINE:67
def editSubject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editSubject",
   """
      function(studyNo,SubjectId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editSubject" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyNo", studyNo), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("SubjectId", SubjectId)])})
      }
   """
)
                        

// @LINE:57
def Register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:11
def getPortraitInfo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPortraitInfo",
   """
      function(studyId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "portrait" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyId", studyId)])})
      }
   """
)
                        

// @LINE:63
def insertSubject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.insertSubject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InsertSubject"})
      }
   """
)
                        

// @LINE:61
def shareMyStudy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.shareMyStudy",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InsertStudy"})
      }
   """
)
                        

// @LINE:31
def ShowCreateStudyForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ShowCreateStudyForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createStudy"})
      }
   """
)
                        

// @LINE:25
def displayStudies : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayStudies",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allStudies"})
      }
   """
)
                        

// @LINE:21
def file : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.file",
   """
      function(task,subject,studyId,signal_type,signal_sequence) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("task", task), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("subject", subject), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("studyId", studyId), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("signal_type", signal_type), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("signal_sequence", signal_sequence)])})
      }
   """
)
                        

// @LINE:35
def deleteStudy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteStudy",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteStudy"})
      }
   """
)
                        

}
              
}
        


// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:46
// @LINE:44
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
package controllers.ref {


// @LINE:39
class ReverseAssets {


// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:46
// @LINE:44
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
class ReverseApplication {


// @LINE:19
def GetSignal(task:String, subject:String, studyId:Int, signal_type:Int, signal_sequence:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.GetSignal(task, subject, studyId, signal_type, signal_sequence), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "GetSignal", Seq(classOf[String], classOf[String], classOf[Int], classOf[Int], classOf[Int]), "GET", """""", _prefix + """GetSignal""")
)
                      

// @LINE:13
def getInfo(task:String, subject:String, studyId:Int, signal_type:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getInfo(task, subject, studyId, signal_type), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getInfo", Seq(classOf[String], classOf[String], classOf[Int], classOf[Int]), "GET", """""", _prefix + """getInfo""")
)
                      

// @LINE:51
def authentication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authentication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authentication", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:29
def displaySubject(studyNo:Int, SubjectId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displaySubject(studyNo, SubjectId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displaySubject", Seq(classOf[Int], classOf[String]), "GET", """""", _prefix + """displaySubject""")
)
                      

// @LINE:65
def InsertSession(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.InsertSession(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "InsertSession", Seq(), "POST", """""", _prefix + """InsertSession""")
)
                      

// @LINE:69
def uploadFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.uploadFile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "uploadFile", Seq(), "POST", """""", _prefix + """upload""")
)
                      

// @LINE:27
def showStudy(studyNo:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showStudy(studyNo), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showStudy", Seq(classOf[Int]), "GET", """""", _prefix + """showStudy/$studyNo<[^/]+>""")
)
                      

// @LINE:74
def editStudy(studyId:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editStudy(studyId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editStudy", Seq(classOf[Int]), "GET", """""", _prefix + """editStudy/$studyId<[^/]+>""")
)
                      

// @LINE:17
def getPsycho(task:String, subject:String, studyId:Int, signal_type:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getPsycho(task, subject, studyId, signal_type), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getPsycho", Seq(classOf[String], classOf[String], classOf[Int], classOf[Int]), "GET", """""", _prefix + """getPsycho""")
)
                      

// @LINE:44
def getVideo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getVideo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getVideo", Seq(), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """videoB""")
)
                      

// @LINE:23
def zip(studyId:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.zip(studyId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "zip", Seq(classOf[Int]), "GET", """""", _prefix + """downloadStudy""")
)
                      

// @LINE:33
def InsertNewStudy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.InsertNewStudy(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "InsertNewStudy", Seq(), "POST", """""", _prefix + """createStudy""")
)
                      

// @LINE:15
def getPRF(task:String, subject:String, studyId:Int, signal_type:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getPRF(task, subject, studyId, signal_type), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getPRF", Seq(classOf[String], classOf[String], classOf[Int], classOf[Int]), "GET", """""", _prefix + """getPRF""")
)
                      

// @LINE:72
def video(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.video(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "video", Seq(), "GET", """to be deleted""", _prefix + """video""")
)
                      

// @LINE:59
def submitRegistration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.submitRegistration(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "submitRegistration", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:9
def ReceiveOauthData(state:String, code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ReceiveOauthData(state, code), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ReceiveOauthData", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """display""")
)
                      

// @LINE:55
def ShowDriveDialog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ShowDriveDialog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ShowDriveDialog", Seq(), "GET", """""", _prefix + """ShowDriveDialog""")
)
                      

// @LINE:37
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "POST", """""", _prefix + """logout""")
)
                      

// @LINE:7
def Main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Main(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Main", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:46
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "test", Seq(), "GET", """""", _prefix + """test""")
)
                      

// @LINE:67
def editSubject(studyNo:Int, SubjectId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editSubject(studyNo, SubjectId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editSubject", Seq(classOf[Int], classOf[String]), "GET", """""", _prefix + """editSubject""")
)
                      

// @LINE:57
def Register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Register", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:11
def getPortraitInfo(studyId:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getPortraitInfo(studyId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getPortraitInfo", Seq(classOf[Int]), "GET", """""", _prefix + """portrait""")
)
                      

// @LINE:63
def insertSubject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.insertSubject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "insertSubject", Seq(), "POST", """""", _prefix + """InsertSubject""")
)
                      

// @LINE:61
def shareMyStudy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.shareMyStudy(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "shareMyStudy", Seq(), "POST", """""", _prefix + """InsertStudy""")
)
                      

// @LINE:31
def ShowCreateStudyForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ShowCreateStudyForm(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ShowCreateStudyForm", Seq(), "GET", """""", _prefix + """createStudy""")
)
                      

// @LINE:25
def displayStudies(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayStudies(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayStudies", Seq(), "GET", """""", _prefix + """allStudies""")
)
                      

// @LINE:21
def file(task:String, subject:String, studyId:Int, signal_type:Int, signal_sequence:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.file(task, subject, studyId, signal_type, signal_sequence), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "file", Seq(classOf[String], classOf[String], classOf[Int], classOf[Int], classOf[Int]), "GET", """""", _prefix + """file""")
)
                      

// @LINE:35
def deleteStudy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteStudy(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteStudy", Seq(), "POST", """""", _prefix + """deleteStudy""")
)
                      

}
                          
}
        
    