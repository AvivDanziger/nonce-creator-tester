
package views.html.pages

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
object ci extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="ciMain">
	<div class="features-area">
		<div class="ci-header">
			<div class="holder">
				<h1>New releases can break your code. <br />Know about it before your users do.</h1>
				<strong class="sub-ttl">Takipi for Continuous Integration - Find and fix release issues faster.</strong>
				<div class="start-form takipiMiniSignupForm" createdin="header">
					<form>
						<div class="row">
							<input class="text emailInput" type="email" placeholder="Email address">
							<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi">
						</div>
					</form>
					<p class="info">Java / Scala developers</p>
				</div>
			</div><!-- holder -->
		</div><!-- ci-header -->
		<div class="ci-fix-breaking">
			<div class="holder">
				<div class="info-table">
					<div class="frame">
						<table>
							<tr>
								<td><strong>See if a new release introduced new bugs.</strong></td>
								<td><strong>Know immediately when a resolved error reappears.</strong></td>
							</tr>
							<tr>
								<td><strong>Understand if an error occurs more often after a release.</strong></td>
								<td><strong>Compare error recordings from multiple releases.</strong></td>
							</tr>
							<tr>
								<td><strong>For each error - see if it's coming from modified code.</strong></td>
								<td><strong>Get a daily report to help you track trends in your code.</strong></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="area">
					<div class="block-1">
						<h2>Know what broke.</h2>
						<p>Know how new releases affect your users.<br/>Know which errors to handle first.</p>
						<img src="assets/images/ci/img-features-27.png" alt="#">
					</div><!-- block-1 -->
					<div class="block-2">
						<img src="assets/images/ci/arrow-07.png" alt="#" class="arrow-1">
						<h2>Solve it quickly.</h2>
						<p>Get a replay of your errors.<br/>Resolve problems as soon as they occur without sifting through log files.</p>
					</div><!-- block-2 -->
					<div class="block-3">
						<img src="assets/images/ci/img-features-28.png" alt="#">
						<h2>Know if the fix worked</h2>
						<p>Takipi will notify you if a previously resolved bug has reappeared, even if the code around it changed.</p>
						<img src="assets/images/ci/arrow-08.png" alt="#" class="arrow-2">
					</div><!-- block-3 -->
					<img src="assets/images/ci/img-features-29.png" alt="#" class="img">
				</div><!-- area -->
			</div><!-- holder -->
		</div><!-- ci-fix-breaking -->
		<div class="ci-production-code">
			<div class="holder">
				<h2>Get production code out of the dark</h2>
				<p>High-scale production environments generate millions of errors a day. How can you tell which ones have an adverse effect on users and business transactions?</p>
				<p>Takipi extends the JVM and uses processing power in the cloud to continuously provide debugger level information in production with extremely low CPU/ IO overhead.</p>
				<p>For each error you will see: the entire stack, state, and variable values which caused it (even across different machines). You no longer have to reproduce complex errors or sift through log files.</p>
			</div><!-- holder -->
		</div><!-- production-code -->
		<ul class="ci-support-logos">
			<li><img src="assets/images/ci/logo-support-01.png" width="55" height="54" alt="#"></li>
			<li class="logo-2"><img src="assets/images/ci/logo-support-02.png" width="43" height="58" alt="#"></li>
			<li class="logo-3"><img src="assets/images/ci/logo-support-03.png" width="72" height="41" alt="#"></li>
			<li class="logo-4"><img src="assets/images/ci/logo-support-04.png" width="52" height="51" alt="#"></li>
		</ul><!-- support-logos -->
		<div class="stack-area infix">
			<div class="video-player container">
				<video id="demo-video" poster="assets/images/index/img03.jpg"> 
					<source src="assets/videos/index/demo.mp4" type="video/mp4"><!-- codecs="avc1.42E01E, mp4a.40.2" -->
				</video><!-- / video-bg -->
			</div><!-- / video-player -->
		</div>
		<div class="colored detect" id="detect">
			<div class="container">
				<header class="headline">
					<h2>See which errors really impact your application</h2>
					<p>Takipi was built for environments where millions of errors happen every day.</p>
					<p>Only a few really matter - we're here to tell you which ones.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/features/img-features-02.png" alt="image">
					<div class="description">
						<p>Get complete visibility and see which errors:</p>
						<ul class="list">
							<li class="ico ico-01">Are coming from code that was recently modified.</li>
							<li class="ico ico-02">Are new or increasing in rate.</li>
							<li class="ico ico-03">Keep happening even after marked as fixed.</li>
						</ul>
					</div>
				</div><!-- / holder -->
				<div class="bubble bubble-1">
					<span class="tbl">
						<span class="tbl-cell"><span class="marked">Marked as resolved</span><br>3 days ago</span>
					</span>
				</div>
				<div class="bubble bubble-2">
					<span class="tbl">
						<span class="tbl-cell">Last 24 hr<span class="sep"><span class="up">270%</span></span></span>
					</span>
				</div>
			</div><!-- / container -->
		</div><!-- / detect -->
		<div class="fix" id="fix">
			<div class="container">
				<header class="headline">
					<h2>Here's the real magic:<br/>See what caused each bug. Fix it in minutes.</h2>
					<p>Create a connection between developers and production errors for immediate resolution.</p>
				</header><!-- / headline -->
				<div class="holder">
					<video width="665" height="296" class="alignright" poster="assets/images/features/rec1.gif" autoplay loop>
						<source src="assets/videos/features/vid-features-01.mp4" type="video/mp4">
					</video>
					<div class="description">
						<p>Alerting is not enough. Takipi provides developers and DevOps the information they need to fix bugs. See the code and variable values which caused each error - right as if you were there.</p>
						<ul class="list color-1">
							<li>See variable values across the stack, without logging a single line.</li>
							<li>See the root cause in your code - even across machines.</li>
							<li>See multiple reproductions for each error.</li>
							<li>Easily share between developers, DevOps and QA.</li>
						</ul>
						<div class="tech-form takipiMiniSignupForm" createdin="magic">
							<form>
								<div class="row">
									<input class="text emailInput" type="email" placeholder="Email address">
									<input class="btn-submit createStubAccountBtn" type="submit" value="Start Free Trial" >
								</div>
								<p>Java / Scala developers</p>
							</form>
						</div>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / fix -->
		<div class="integrate colored" id="integrate">
			<div class="container">
				<header class="headline">
					<h2>Integrate with existing workflows</h2>
					<p>Make your log files smarter. Empower your Jira and NewRelic.</p>
				</header><!-- / headline -->
				<div class="holder">
					<div class="visual">
						<img class="img-01" src="assets/images/features/img-features-05.png" alt="image">
						<img class="img-02" src="assets/images/features/img-features-06.png" alt="image">
						<a class="link" href="#">Try<br>Me</a>
					</div>
					<div class="description">
						<div class="note">
							<p>One of Takipi's biggest time-savers is log integration.<br/>Next to each error in your log you'll find a link to the<br/>code and variables which casued it - reducing back and forth<br/>between engineers and DevOps and time to resolution.<br/>No configuration needed. Supports Logback, Log4J, Self4J.</p>
						</div>
						<ul class="logos">
							<li><a href="https://www.atlassian.com/software/jira" target="_blank"><img src="assets/images/features/ico-features-03.png" alt="image"></a></li>
							<li><a href="http://newrelic.com/plugins/takipi/156" target="_blank"><img src="assets/images/features/ico-features-04.png" alt="image"></a></li>
						</ul>
						<ul class="links">
							<li><a href=""""),_display_(/*162.22*/routes/*162.28*/.Application.logs),format.raw/*162.45*/("""" target="_blank">Takipi log links</a></li>
							<li><a href=""""),_display_(/*163.22*/routes/*163.28*/.Application.newrelicnew),format.raw/*163.52*/("""" target="_blank">Takipi for New Relic</a></li>
						</ul>
					</div>
				</div>
			</div><!-- / container -->
		</div><!-- / integrate -->
		<div class="security" id="security">
			<div class="container">
				<header class="headline">
					<h2>Ironclad Security</h2>
					<p>Industrial strength AES encryption protects all your data.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/features/img-features-07.png" alt="image">
					<div class="description">
						<ul class="list">
							<li>Code and data are encrypted on your server using a 256 bit AES cypher.<br/>Encryption keys are private to you, and are not stored by Takipi.<br/>Data collected can only be decrypted in your web browser using<br/>your private encryption key.</li>
							<li>Control which team members are allowed to view each server's data and from which IP addresses they can access it.</li>
							<li>Control which variables are collected and encrypted to protect private data.</li>
						</ul>
						<ul class="links">
							<li><a class="more" href=""""),_display_(/*184.35*/globals/*184.42*/.TAKIPI_SUPPORT_SITE),format.raw/*184.62*/("""/security/" target="_blank">Learn More</a></li>
							<li><a class="download" href=""""),_display_(/*185.39*/globals/*185.46*/.SECURITY_WHITEPAPER),format.raw/*185.66*/("""" target="_blank">Download whitepapers</a></li>
						</ul>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / security -->
		<div class="monitoring" id="ecosystem">
			<div class="container">
				<header class="headline">
					<h2>Your monitoring ecosystem just got better</h2>
					<p>Get more actionable data using your existing tool set</p>
				</header>
				<div class="monitoring-info">
					<div class="item item-1">
						<span class="tbl"><span class="tbl-cell">Takipi</span></span>
					</div>
					<div class="item item-2 type-2">
						<span class="tbl"><span class="tbl-cell">APM</span></span>
						<div class="pop-info">
							<h3>APM tools help you monitor issues.<br>Takipi lets you fix them in minutes.</h3>
							<p>With Takipi, your DevOps can communicate production problems to your dev team smoothly. Get actionable data on errors and slowdowns tracked by your APM. See the code, variable values and state behind server issues.</p>
						</div>
					</div>
					<div class="item item-3 type-2">
						<span class="tbl"><span class="tbl-cell">Log Management</span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter. Takipi automatically links log entries to a full code analysis.</h3>
							<p>Cut down debugging time. Takipi attaches powerful links to errors and warnings in your logs. One click in your log management tool will show you exactly what led to each error.</p>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-4 type-2 left">
						<span class="tbl"><span class="tbl-cell">Bug<br>Tracking</span></span>
						<div class="pop-info">
							<h3>Close tickets faster. Know when resolved errors rear their ugly heads again.</h3>
							<p>Add new data to bug tickets, and shrink the time it takes your developers to understand it. Takipi enriches bug tickets with a full 'replay' of what led to the error, including the entire stack, variable values and state. Takipi will help you reproduce the error, so you can solve it faster.<br>If an error that you've marked as 'Resolved' reappears, we will notify you right away. You will get a notification even if the code around the error has changed.</p>
						</div>
					</div>
					<div class="item item-5 type-3">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-17.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Try Takipi's plug-in for New Relic.</h3>
							<strong>Get more data on errors within New Relic:</strong>
							<ul class="list">
								<li>Track more error types: caught exceptions, logged errors, and network errors.</li>
								<li>Get stats - Which errors are happening more than usual? Which errors stopped after your last deployment?</li>
								<li>See the entire stack and variable values which led to each error.</li>
							</ul>
							<a href="https://www.takipi.com/newrelic" target="_blank">Learn more &gt;&gt;</a>
						</div>
					</div>
					<div class="item item-6 type-3">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-18.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Get data on what caused production errors and solve errors much faster.</h3>
							<strong>Use Takipi to see the full picture:</strong>
							<ul class="list">
								<li>Variable values - As they were at each stage of the stack.</li>
								<li>Cross-machine analysis.</li>
								<li>Notifications on resolved errors that resurface.</li>
							</ul>
						</div>
					</div>
					<div class="item item-7 type-3 type-4">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-19.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter.</h3>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-8 type-3 type-4">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-20.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter.</h3>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-9 type-3 type-4">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-21.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter.</h3>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-10 type-3 type-4 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-22.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Open JIRA issues directly from Takipi.</h3>
							<p>Use Takipi to track new errors and decide which ones to fix first. Stop wasting valuable time sifting through log files and trying to reproduce errors.<br>Use the 'Open Jira issue' button to open issues immediately. They will include all the code data which led to the error, enabling your dev team to cut down debugging time.</p>
						</div>
					</div>
					<div class="item item-11 type-3 type-4 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-23.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Close tickets faster. Know when resolved errors rear their ugly heads again.</h3>
							<strong>Takipi adds new data to bug tickets, and shrinks the time it takes your developers to understand it.</strong>
							<ul class="list">
								<li>Get a full 'replay' of what led to the error, including the entire stack, variable values and state.</li>
								<li>Easily reproduce the error, so you can solve it faster.</li>
								<li>If an error marked as 'Resolved' reappears,  we will notify you immediately.</li>
							</ul>
						</div>
					</div>
					<div class="item item-12 type-3 type-4 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-24.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Close tickets faster. Know when resolved errors rear their ugly heads again.</h3>
							<strong>Takipi adds new data to bug tickets, and shrinks the time it takes your developers to understand it.</strong>
							<ul class="list">
								<li>Get a full 'replay' of what led to the error, including the entire stack, variable values and state.</li>
								<li>Easily reproduce the error, so you can solve it faster.</li>
								<li>If an error marked as 'Resolved' reappears,  we will notify you immediately.</li>
							</ul>
						</div>
					</div>
					<div class="item item-13 type-5 left">
						<span class="tbl"><span class="tbl-cell">Third-Party<br>Java/Scala<br>Tools</span></span>
						<div class="pop-info">
							<h3>Know how third-party tools affect your code.</h3>
							<p>See whether or not your problems are caused by other libraries. Takipi helps you track errors, even outside your code.<br>Track the entire flow. Start at an exception or a slowdown within a third-party library and end in your code, even across different machines.</p>
						</div>
					</div>
					<div class="item item-14 type-6 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-25.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Hadoop</h3>
							<p>Track errors coming from Hadoop and see your stack and variable values that led there. Get more visibility to Hadoop and know when code changes cause it to break or slow down. Takipi tracks Java, Pig and Hive code, and supports EMR.</p>
						</div>
					</div>
					<div class="item item-15 type-6 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-26.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Spark</h3>
							<p>Track errors coming from Spark and see your stack and variable values that led there. Get more visibility to Spark and know when code changes cause it to break or slow down. Takipi tracks Java, Scala, Shark and Hive code.</p>
						</div>
					</div>
					<div class="item item-16 type-6 left">
						<span class="tbl"><span class="tbl-cell">Others</span></span>
						<div class="pop-info pop-info-2">
							<h3>Track errors from any third party library. Get error analysis and stats on errors coming from:</h3>
							<div class="cols">
								<div class="col">
									<ul class="list-info">
										<li>ElasticSearch</li>
										<li>Logstash</li>
										<li>Cassandra</li>
										<li>ActiveMQ</li>
										<li>CouchDB</li>
										<li>Lucene</li>
										<li>Solr</li>
										<li>Hazelcast</li>
									</ul>
								</div>
								<div class="col">
									<ul class="list-info">
										<li>Tomcat</li>
										<li>Glassfish</li>
										<li>JBoss / Wildfly</li>
									</ul>
									<ul class="list-info">
										<li>Spring</li>
										<li>Hibernate</li>
										<li>Guava</li>
										<li>AWS SDK</li>
									</ul>
								</div>
								<div class="col">
									<ul class="list-info">
										<li>Logback</li>
										<li>Log4j</li>
										<li>SLF4J</li>
									</ul>
								</div>
								<div class="col">
									<strong class="sub-str">Scala:</strong>
									<ul class="list-info">
										<li>Play framework</li>
										<li>Akka</li>
										<li>Lift</li>
										<li>Scalatra</li>
									</ul>
									<strong class="sub-str">Groovy:</strong>
									<ul class="list-info">
										<li>Grails</li>
									</ul>
								</div>
								<div class="col">
									<strong class="sub-str">Clojure:</strong>
									<ul class="list-info">
										<li>Luminus</li>
										<li>Noir</li>
										<li>Joodo</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div><!-- /monitoring -->
		<div class="up-running light" id="signup">
			<div class="container">
				<h2>Up and running in 5 minutes</h2>
				<p>No need to add annotations, API calls or dependencies to your applications.</p>
				<p>Takipi runs at a JVM level and supports Java, Scala, Groovy and Clojure applications.</p>
				<p>Chef and Puppet automation.</p>
				<div class="tech-form takipiMiniSignupForm" createdin="footer">
					<form>
						<div class="row">
							<input class="text emailInput" type="email" placeholder="Enter your Mail"/>
							<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi"/>
						</div>
					</form>
				</div>
			</div>
		</div><!-- / up-running -->
	</div><!-- / features-area -->
</div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/ci.scala.html
                  HASH: c6fb3758c346f7681e22b4c505fa99b5741946b5
                  MATRIX: 583->0|8796->8185|8812->8191|8851->8208|8944->8273|8960->8279|9006->8303|10130->9399|10147->9406|10189->9426|10303->9512|10320->9519|10362->9539
                  LINES: 22->1|183->162|183->162|183->162|184->163|184->163|184->163|205->184|205->184|205->184|206->185|206->185|206->185
                  -- GENERATED --
              */
          