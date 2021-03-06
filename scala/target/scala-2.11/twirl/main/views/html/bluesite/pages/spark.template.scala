
package views.html.bluesite.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object spark extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain">
    <section class="spark-header">
        <div class="slimSiteCentered">
            <h1>Takipi for Spark</h1>
            <a class="btn-submit" href=""""),_display_(/*5.42*/globals/*5.49*/.TAKIPI_CREATE_ACCOUNT),format.raw/*5.71*/("""">Start free trial</a> 
            <p class="description">
                Monitor and analyze all Spark errors. Get full visibility into your cluster.<br/><br/>
                Takipi tracks ALL errors coming from Spark and provides rich analytics<br/>
                to help you see which one really affect you.<br/><br/>
                See the entire stack and variable values that led to each error, laid on your original code.<br/>
                See how changes to your code impact Spark.
            </p>
        </div>
    </section>
    
    <section class="spark-code-production">
		<div class="slimSiteCentered">
			<div class="production-area">
				<div class="col-left">
					<div class="history-box">
						<strong class="ttl">NullPointerException</strong>
						<p>WordCount tokenize </p>
						<ul class="list">
							<li><img src="assets/images/bluesite/ico01.png" alt="image">First seen Dec 17</li>
							<li><img src="assets/images/bluesite/ico02.png" alt="image">26 times</li>
						</ul>
						<div class="error-block">
							<a class="select open-link" href="#">
								<ul class="num">
									<li class="num-01">4</li>
									<li class="num-02">2</li>
								</ul>
								<span class="text">Dec 18, 11:32 am</span>
							</a>
							<ul class="error-list">
								<li><a href="#"><em class="date">Dec 18, 11:33 am</em><span class="txt">na.dallas.dc01.spark-01-worker</span></a></li>
								<li><a href="#"><em class="date">Dec 18, 11:32 am</em><span class="txt">na.dallas.dc01.spark-02-worker</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 03:11 pm</em><span class="txt">na.dallas.dc02.spark-02-worker</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 11:33 am</em><span class="txt">na.dallas.dc01.spark-01-worker</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 11:33 am</em><span class="txt">na.boston.dc01.spark-01-worker</span></a></li>
							</ul>
							<div class="info-link info-link-01">
								<a href="#">Error history</a>
								<div class="box">
									<p>See multiple instances of the error at different times and from different machines.</p>
								</div>
								<a href="#" class="hotspot"></a>
							</div>
						</div><!-- / error-block -->
					</div><!-- / history-box -->
					<ul class="nav-list">
						<li class="style-05">WordCount tokenize</li>
						<li class="style-05">WordCount λ-2</li>
						<li class="style-05">WordCount execute</li>
						<li class="style-05">Aggregator combineValuesByKey</li>
						<li class="style-04">PairRDDFunctions λ-1</li>
						<li class="style-04">RDD λ-1</li>
						<li class="style-03">na.dallas.dc01.spark-01-worker</li>
					</ul><!-- / nav-list -->
				</div><!-- / col-left -->
				<div class="col-right">
                    <div class="wrap-01">
                        <div class="info-holder">
                            <strong class="subtitle">WordCount tokenize</strong>
                            <div class="code-block">
                                <span class="line"><span class="color-1">private def</span> tokenize(<span class="info-block info-block-02">
                                        <a class="link" href="#">text</a>
                                        <span class="holder">null</span>
                                    </span><span class="color-1">:</span>String)<span class="color-1">:</span>Array[String]
                                    <span class="color-1">=</span> &#123;
                                </span>

                                <span class="line highlight flame"><span class="spaces spaces-02"></span><span class="info-block info-block-02">
                                        <a class="link" href="#">text</a>
                                        <span class="holder">null</span>
                                    </span>.toLowerCase.replaceAll(<span class="color-2">"[^a-zA-Z0-9\\s]"</span>, <span class="color-2">""</span>).split(<span class="color-2">"\\s+"</span>)
                                </span>
                                
                                <span class="line"> &#125;</span>
                            </div><!-- / code-block -->
                        </div><!-- / info-holder -->
                        <div class="info-holder">
                            <strong class="subtitle">WordCount execute</strong>
                            <div class="code-block">
                               
                                <span class="line"><span class="color-1">def</span> execute(<span class="info-block info-block-02">
                                        <a class="link" href="#">master</a>
                                        <span class="holder">"local"</span>
                                    </span><span class="color-1">:</span>String, <span class="info-block">
                                        <a class="link" href="#">args</a>
                                        <span class="holder wide">
                                            <strong class="sub-head">args</strong>
                                            <span class="list-item"><span class="left">"hd"</span><span class="right">"/tmp/1427040635690-0/input"</span></span>
                                            <span class="list-item"><span class="left">"tl"</span><span class="right">::</span></span>
                                        </span>
                                    </span><span class="color-1">:</span>List[String], <span class="info-block info-block-02">
                                        <a class="link" href="#">jars</a>
                                        <span class="holder">Nil</span>
                                    </span><span class="color-1">:</span>Seq[String] <span class="color-1">=</span>  <span class="color-1">Nil</span>) &#123;</span>
                                    
                                <span class="line"><span class="spaces spaces-02"></span><span class="color-1">val</span> <span class="info-block info-block-04">
                                        <a class="link" href="#">sc</a>
                                        <span class="holder">
                                            <strong class="sub-head">sc</strong>
                                            <span class="list-item"><span class="left">appName</span><span class="right">"WordCountJob"</span></span>
                                            <span class="list-item"><span class="left">master</span><span class="right">"local"</span></span>
                                            <span class="list-item"><span class="left">startTime</span><span class="right">1427040637334</span></span>
                                        </span>
                                    </span> <span class="color-1">=</span> 
                                    <span class="color-1">new</span> SparkContext(<span class="info-block info-block-02">
                                        <a class="link" href="#">master</a>
                                        <span class="holder">"local"</span>
                                    </span>, <span class="var info-block info-block-02 info-block-05">
                                        <a class="link open-link" href="#">AppName</a>
                                        <span class="holder var-holder">"WordCountJob"</span>
                                        <span class="info-link info-link-04">
                                            <a href="#">Hover over variables</a>
                                            <span class="box">to see their value when the error occurred. Takipi automatically reconstructs the code leading to the error within the JVM.</span>
                                            <a href="#" class="hotspot"></a>
                                        </span>
                                    </span>,  <span class="color-1">null</span>, <span class="info-block info-block-02">
                                        <a class="link" href="#">jars</a>
                                        <span class="holder">Nil</span>
                                    </span>) </span>
                                    
                                <span class="line"><span class="spaces spaces-02"></span><span class="color-1">val</span> <span class="info-block info-block-04">
                                        <a class="link" href="#">file</a>
                                        <span class="holder wide">
                                            <strong class="sub-head">file</strong>
                                            <span class="list-item"><span class="left">sc</span><span class="right">SparkContext</span></span>
                                            <span class="list-item"><span class="left">name</span><span class="right">null</span></span>
                                            <span class="list-item"><span class="left">log_</span><span class="right">null</span></span>
                                            <span class="list-item"><span class="left">origin</span><span class="right">"textFile at WordCount.scala:29"</span></span>
                                        </span>
                                    </span> <span class="color-1">=</span>  <span class="info-block info-block-04">
                                        <a class="link" href="#">sc</a>
                                        <span class="holder">
                                            <strong class="sub-head">sc</strong>
                                            <span class="list-item"><span class="left">appName</span><span class="right">"WordCountJob"</span></span>
                                            <span class="list-item"><span class="left">master</span><span class="right">"local"</span></span>
                                            <span class="list-item"><span class="left">startTime</span><span class="right">1427040637334</span></span>
                                        </span>
                                    </span>.textFile(<span class="info-block">
                                        <a class="link" href="#">args</a>
                                        <span class="holder wide">
                                            <strong class="sub-head">args</strong>
                                            <span class="list-item"><span class="left">"hd"</span><span class="right">"/tmp/1427040635690-0/input"</span></span>
                                            <span class="list-item"><span class="left">"tl"</span><span class="right">::</span></span>
                                        </span>
                                    </span>(0))</span>
                                    
                                <span class="line"><span class="spaces spaces-02"></span><span class="color-1">val</span> words <span class="color-1">=</span> <span class="info-block info-block-04">
                                        <a class="link" href="#">file</a>
                                        <span class="holder wide">
                                            <strong class="sub-head">file</strong>
                                            <span class="list-item"><span class="left">sc</span><span class="right">SparkContext</span></span>
                                            <span class="list-item"><span class="left">name</span><span class="right">null</span></span>
                                            <span class="list-item"><span class="left">log_</span><span class="right">null</span></span>
                                            <span class="list-item"><span class="left">origin</span><span class="right">"textFile at WordCount.scala:29"</span></span>
                                        </span>
                                    </span>.flatMap(line <span class="color-1">=></span> tokenize(line))</span>
                                    
                                <span class="line"><span class="spaces spaces-02"></span><span class="color-1">val</span> wordCounts = 
                                    words.map(x <span class="color-1">=></span> (x, 1)).reduceByKey(_ + _)</span>
                                
                                <span class="line"><span class="spaces spaces-02"></span>wordCounts.saveAsTextFile(<span class="info-block">
                                        <a class="link" href="#">args</a>
                                        <span class="holder wide">
                                            <strong class="sub-head">args</strong>
                                            <span class="list-item"><span class="left">"hd"</span><span class="right">"/tmp/1427040635690-0/input"</span></span>
                                            <span class="list-item"><span class="left">"tl"</span><span class="right">::</span></span>
                                        </span>
                                    </span>(1))</span>
                                    
                                <span class="line">&#125;</span>
                                
                                
                                <div class="values wide">
                                    <a class="sub-head open-link" href="#">Recorded variables</a>
                                    <ul class="list">
                                        <li>
                                            <a href="#">
                                                <span class="left">master</span>
                                                <span class="right">"local"</span>
                                            </a>
                                        </li>
                                        <li class="caret">
                                            <a href="#">
                                                <span class="left">args</span>
                                                <span class="right">List[String]</span>
                                            </a>
                                            <ul>
                                                <li>
                                                    <a href="#">
                                                        <span class="left">"hd"</span>
                                                        <span class="right">"/tmp/1427040635690-0/input"</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="left">"tl"</span>
                                                        <span class="right">::</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="caret">
                                            <a href="#">
                                                <span class="left">sc</span>
                                                <span class="right">SparkContext</span>
                                            </a>
                                            <ul class="drop-open">
                                                <li>
                                                    <a href="#">
                                                        <span class="left">appName</span>
                                                        <span class="right">"WordCountJob"</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="left">master</span>
                                                        <span class="right">"local"</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="left">startTime</span>
                                                        <span class="right">1427040637334</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="left">jars</span>
                                                <span class="right">Nil</span>
                                            </a>
                                        </li>
                                        <li class="caret">
                                            <a href="#">
                                                <span class="left">file</span>
                                                <span class="right">RDD</span>
                                            </a>
                                            <ul class="drop-open">
                                                <li>
                                                    <a href="#">
                                                        <span class="left">sc</span>
                                                        <span class="right">"SparkContext"</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="left">name</span>
                                                        <span class="right">null</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="left">log_</span>
                                                        <span class="right">null</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="left">origin</span>
                                                        <span class="right">"textFile at WordCount.scala:29"</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                    <div class="info-link info-link-05">
                                        <a href="#">See object values</a>
                                        <div class="box">
                                            <p>across the entire call stack, 5 levels into the heap.</p>
                                        </div>
                                        <a href="#" class="hotspot"></a>
                                    </div>
                                </div><!-- / values -->
                                
                            </div><!-- / code-blo"""),
format.raw("""ck -->
                        </div><!-- / info-holder -->
                    </div><!-- / wrap-01 -->
                </div><!-- / col-right -->
			</div><!-- / production-area -->
		</div>
	</section><!-- /production-info -->
    <section class="spark-form">
        <div class="slimSiteCentered">
            <div class="form-container">
                <div class="start-form takipiMiniSignupForm" createdin="header">
                    <form action="#">
                        <div class="row">
                            <input class="text emailInput" type="email" placeholder="Email address">
                            <input class="btn-submit createStubAccountBtn" type="submit" value="Show me Spark errors &gt;&gt;">
                        </div>
                        <div class="errorLabel">User already exists <a class="loginLink" href=""""),_display_(/*297.97*/globals/*297.104*/.LOGIN_PAGE),format.raw/*297.115*/("""">Log in</a></div>
                        <p class="sub-note">FREE trial &nbsp;&nbsp;|&nbsp;&nbsp; Unlimited number of servers &nbsp;&nbsp;|&nbsp;&nbsp; Unlimited number of users</p>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:37 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/spark.scala.html
                  HASH: 87b9d0df6792be937e2f4cdc373ec6e5924d6d1e
                  MATRIX: 595->0|803->182|818->189|860->211|21768->21071|21786->21078|21820->21089
                  LINES: 22->1|26->5|26->5|26->5|319->297|319->297|319->297
                  -- GENERATED --
              */
          