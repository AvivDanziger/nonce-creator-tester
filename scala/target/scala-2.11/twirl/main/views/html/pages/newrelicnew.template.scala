
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
object newrelicnew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.2*/("""<div class="features-area">
		<div class="promo-block">
			<div class="container">
				<div class="bonus">
					<span class="str"><span class="tbl"><span class="tbl-cell">Free server<br>+ Free Java 8 T-shirt</span></span></span>
					<img src="assets/images/newrelic/img-features-09.png" data-src="assets/images/newrelic/img-features-10.png" alt="image description">
				</div>
				<div class="img">
					<img src="assets/images/newrelic/img-features-08.png" alt="image description">
				</div>
				<h2><span class="turquoise bold">New Relic</span> monitors issues. <span class="turquoise bold">Takipi</span> lets you fix them in minutes.</h2>
				<p>Debug less. Develop more.</p>
			</div>
		</div><!-- / promo-block -->
		<div class="info">
			<div class="holder">
				<div class="box box-l">
					<span class="tbl">
						<span class="tbl-cell">See all of your errors<br>in New Relic.</span>
					</span>
				</div>
				<div class="box box-r">
					<span class="tbl">
						<span class="tbl-cell">Takipi tells which code and variable state led there.</span>
					</span>
				</div>
			</div>
			<img src="assets/images/newrelic/img-features-11.jpg" alt="image description">
			<div class="bottom">
				<div class="start-form">
					<div class="subPageMiniSignupDialogMiddle"></div>
				</div>
			</div>
		</div><!-- / info -->
		<div class="tracks colored">
			<div class="container">
				<header class="headline">
					<h2>Try Takipi’s plug-in for New Relic</h2>
					<p>Takipi tracks all error types and gives you data which was previously unavailable:<br> caught/ uncaught errors, logged errors, &amp; network errors.</p>
				</header>
				<div class="holder">
					<img src="assets/images/newrelic/img-features-15.png" alt="image description">
				</div>
			</div>
		</div><!-- / tracks -->
		<div class="errors" id="errors">
			<div class="container">
				<header class="headline">
					<h2>Code breaks.<br>Get actionable insights once it happens</h2>
					<p>New Relic stops at the stack trace level. Takipi shows you the methods, source code,<br>and variables which caused a bug.</p>
				</header>
				<div class="errors-info">
					<header>
						<div class="col-l">
							<h3 class="ico-01">New Relic</h3>
						</div>
						<div class="col-r">
							<h3 class="ico-02">Takipi</h3>
						</div>
					</header>
					<div class="entity">
						<ul class="error-list">
							<li class="active">MoviesValidator.validateMovie</li>
							<li>MoviesInserter.validateMovie</li>
							<li>MoviesInserter.putMoviesInDb</li>
							<li>PutMoviesInDBDaemon.work</li>
							<li>Daemon.doRun</li>
							<li>GracefulTask.internalRun</li>
						</ul>
						<div class="holder">
							<img src="assets/images/newrelic/img-features-16.png" alt="image description">
						</div>
					</div>
				</div>
			</div><!-- / container -->
		</div><!-- / errors -->
		<div class="colored detect" id="detect">
			<div class="container">
				<header class="headline">
					<h2>See which errors really impact your application</h2>
					<p>Takipi was built for environments where millions of errors happen every day.</p>
					<p>Only a few really matter - we’re here to tell you which ones.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/newrelic/img-features-02.png" alt="image">
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
					<h2>And here’s the real magic:<br>See what caused each bug. Fix it in minutes.</h2>
					<p>Create a connection between developers and production errors for immediate resolution.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/newrelic/rec1.gif" alt="image">
					<div class="description">
						<p>Alerting is not enough. Takipi provides developers and DevOps the information they need to fix bugs. See the code and variable values which caused each error - right as if you were there.</p>
						<ul class="list color-1">
							<li>See variable values across the stack, without logging a single line.</li>
							<li>See the root cause in your code - even across machines.</li>
							<li>See multiple reproductions for each error.</li>
							<li>Easily share between developers, DevOps and QA.</li>
						</ul>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / fix -->
		<div class="configuration colored" id="configuration">
			<div class="container">
				<header class="headline">
					<h2>Made for extreme performance restrictions<br>Max 3% CPU</h2>
					<p>Takipi is built from the ground up to continuously run in high-scale environments.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/newrelic/img-features-04.gif" alt="image">
					<div class="description">
						<ul class="list">
							<li>High-performance sampling tracks all errors in your application<br>with low CPU and throghput overhead. Smart algorithms control when<br>error data is collected.</li>
							<li>CPU overhead is throttled at 3%. Since data is only collected for errors,<br>Takipi does not consume material network bandwidth or disk space.</li>
							<li>No overhead to the JVM heap or GC time.</li>
						</ul>
						<a class="more" href=""""),_display_(/*141.30*/globals/*141.37*/.TAKIPI_SUPPORT_SITE),format.raw/*141.57*/("""/performance-overhead/">Learn More</a>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / configuration -->
	</div><!-- / features-area -->
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/newrelicnew.scala.html
                  HASH: 0d24bdc499914054f26894026a845c390fa1f0cd
                  MATRIX: 592->1|6742->6123|6759->6130|6801->6150
                  LINES: 22->1|162->141|162->141|162->141
                  -- GENERATED --
              */
          