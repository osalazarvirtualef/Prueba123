/* ========================================================================
 * Bootstrap: button.js v3.3.2
 * http://getbootstrap.com/javascript/#buttons
 * ========================================================================
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 * ======================================================================== */

+function(e){function n(n){return this.each(function(){var r=e(this),i=r.data("bs.button"),s=typeof n=="object"&&n;i||r.data("bs.button",i=new t(this,s)),n=="toggle"?i.toggle():n&&i.setState(n)})}var t=function(n,r){this.$element=e(n),this.options=e.extend({},t.DEFAULTS,r),this.isLoading=!1};t.VERSION="3.3.2",t.DEFAULTS={loadingText:"loading..."},t.prototype.setState=function(t){var n="disabled",r=this.$element,i=r.is("input")?"val":"html",s=r.data();t+="Text",s.resetText==null&&r.data("resetText",r[i]()),setTimeout(e.proxy(function(){r[i](s[t]==null?this.options[t]:s[t]),t=="loadingText"?(this.isLoading=!0,r.addClass(n).attr(n,n)):this.isLoading&&(this.isLoading=!1,r.removeClass(n).removeAttr(n))},this),0)},t.prototype.toggle=function(){var e=!0,t=this.$element.closest('[data-toggle="buttons"]');if(t.length){var n=this.$element.find("input");n.prop("type")=="radio"&&(n.prop("checked")&&this.$element.hasClass("active")?e=!1:t.find(".active").removeClass("active")),e&&n.prop("checked",!this.$element.hasClass("active")).trigger("change")}else this.$element.attr("aria-pressed",!this.$element.hasClass("active"));e&&this.$element.toggleClass("active")};var r=e.fn.button;e.fn.button=n,e.fn.button.Constructor=t,e.fn.button.noConflict=function(){return e.fn.button=r,this},e(document).on("click.bs.button.data-api",'[data-toggle^="button"]',function(t){var r=e(t.target);r.hasClass("btn")||(r=r.closest(".btn")),n.call(r,"toggle"),t.preventDefault()}).on("focus.bs.button.data-api blur.bs.button.data-api",'[data-toggle^="button"]',function(t){e(t.target).closest(".btn").toggleClass("focus",/^focus(in)?$/.test(t.type))})}(jQuery);