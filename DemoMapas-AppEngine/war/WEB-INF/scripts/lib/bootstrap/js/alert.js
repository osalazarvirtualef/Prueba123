/* ========================================================================
 * Bootstrap: alert.js v3.3.2
 * http://getbootstrap.com/javascript/#alerts
 * ========================================================================
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 * ======================================================================== */

+function(e){function r(t){return this.each(function(){var r=e(this),i=r.data("bs.alert");i||r.data("bs.alert",i=new n(this)),typeof t=="string"&&i[t].call(r)})}var t='[data-dismiss="alert"]',n=function(n){e(n).on("click",t,this.close)};n.VERSION="3.3.2",n.TRANSITION_DURATION=150,n.prototype.close=function(t){function o(){s.detach().trigger("closed.bs.alert").remove()}var r=e(this),i=r.attr("data-target");i||(i=r.attr("href"),i=i&&i.replace(/.*(?=#[^\s]*$)/,""));var s=e(i);t&&t.preventDefault(),s.length||(s=r.closest(".alert")),s.trigger(t=e.Event("close.bs.alert"));if(t.isDefaultPrevented())return;s.removeClass("in"),e.support.transition&&s.hasClass("fade")?s.one("bsTransitionEnd",o).emulateTransitionEnd(n.TRANSITION_DURATION):o()};var i=e.fn.alert;e.fn.alert=r,e.fn.alert.Constructor=n,e.fn.alert.noConflict=function(){return e.fn.alert=i,this},e(document).on("click.bs.alert.data-api",t,n.prototype.close)}(jQuery);