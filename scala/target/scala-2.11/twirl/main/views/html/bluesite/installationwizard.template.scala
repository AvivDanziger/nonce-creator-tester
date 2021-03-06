
package views.html.bluesite

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
object installationwizard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="tabs-install">
    <ul class="nav-tabs">
        <li><a href="#tab01">Linux</a></li>
        <li><a href="#tab02">OS X</a></li>
        <li><a href="#tab03">Windows</a></li>
        <li><a href="#tab04">Chef / Puppet</a></li>
    </ul><!-- nav-tabs -->
    <div class="content-tabs">
        <div id="tab01">
            <div id="tabs-1" class="sub-tabs">
                <ul class="nav">
                    <li><a href="#tab-1">Wget</a></li>
                    <li><a href="#tab-2">cURL</a></li>
                    <li><a href="#tab-3">DEB</a></li>
                    <li><a href="#tab-4">RPM</a></li>
                </ul>
                <div id="tab-1">
                    <code>wget -O - -o /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&#60;installation key&#62;</code>
                </div>
                <div id="tab-2">
                    <code>curl -s /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&#60;installation key&#62;</code>
                </div>
                <div id="tab-3">
                    <code>sudo dpkg -i &#60;path-to-deb&#62;</code>
                    <code>sudo /opt/takipi/etc/takipi-setup-package &#60;installation key&#62;</code>
                </div>
                <div id="tab-4">
                    <code>sudo rpm -i &#60;path-to-rpm&#62;</code>
                    <code>sudo /opt/takipi/etc/takipi-setup-package &#60;installation key&#62;</code>
                </div>
            </div>
            <div class="btn-area btn-start">
                <a href="#start-area" class="btn">Start</a>
            </div>
        </div><!-- tab01 -->
        <div id="tab02">
            <div class="download btn-start">
                <a href="#start-area" class="btn">Download</a>
                <p>the takipi.dmg installer for OS X.</p>
            </div>
        </div><!-- tab02 -->
        <div id="tab03">
            <div class="download btn-start">
                <a href="#start-area" class="btn">Download</a>
                <p>the takipi.msi installer for Windows.</p>
            </div>
        </div><!-- tab03 -->
        <div id="tab04">
            <div id="tabs-2" class="sub-tabs">
                <ul class="nav">
                    <li><a href="#tab-5">Chef</a></li>
                    <li><a href="#tab-6">Puppet</a></li>
                    <li><a href="#tab-7">Ansible</a></li>
                </ul>
                <div id="tab-5">
                    <p>Our Chef cookbook:</p>
                    <code>git clone <a href="https://github.com/takipi-cookbooks/takipi" target="_blank">https://github.com/takipi-cookbooks/takipi</a></code>
                </div>
                <div id="tab-6">
                    <p>Our Puppet module:</p>
                    <code>git clone <a href="https://github.com/takipi/takipi-puppet" target="_blank">https://github.com/takipi/takipi-puppet</a></code>
                </div>
                <div id="tab-7">
                    <p>Our Ansible playbook:</p>
                    <code>git clone <a href="https://github.com/takipi/takipi-playbooks" target="_blank">https://github.com/takipi/takipi-playbooks</a></code>
                </div>
            </div>
            <div class="btn-area">
                <a href="#start-area" class="btn btn-start">Start</a>
            </div>
        </div><!-- tab04 -->
    </div><!-- content-tabs -->
</div><!-- tabs-install -->"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/installationwizard.scala.html
                  HASH: 9c609f27ec5373a42a26529ca81b36a00cec9bcb
                  MATRIX: 602->0
                  LINES: 22->1
                  -- GENERATED --
              */
          