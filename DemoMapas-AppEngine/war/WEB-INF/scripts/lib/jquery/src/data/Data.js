define(["../core","../var/rnotwhite","./accepts"],function(e,t){function n(){Object.defineProperty(this.cache={},0,{get:function(){return{}}}),this.expando=e.expando+n.uid++}return n.uid=1,n.accepts=e.acceptData,n.prototype={key:function(t){if(!n.accepts(t))return 0;var r={},i=t[this.expando];if(!i){i=n.uid++;try{r[this.expando]={value:i},Object.defineProperties(t,r)}catch(s){r[this.expando]=i,e.extend(t,r)}}return this.cache[i]||(this.cache[i]={}),i},set:function(t,n,r){var i,s=this.key(t),o=this.cache[s];if(typeof n=="string")o[n]=r;else if(e.isEmptyObject(o))e.extend(this.cache[s],n);else for(i in n)o[i]=n[i];return o},get:function(e,t){var n=this.cache[this.key(e)];return t===undefined?n:n[t]},access:function(t,n,r){var i;return n===undefined||n&&typeof n=="string"&&r===undefined?(i=this.get(t,n),i!==undefined?i:this.get(t,e.camelCase(n))):(this.set(t,n,r),r!==undefined?r:n)},remove:function(n,r){var i,s,o,u=this.key(n),a=this.cache[u];if(r===undefined)this.cache[u]={};else{e.isArray(r)?s=r.concat(r.map(e.camelCase)):(o=e.camelCase(r),r in a?s=[r,o]:(s=o,s=s in a?[s]:s.match(t)||[])),i=s.length;while(i--)delete a[s[i]]}},hasData:function(t){return!e.isEmptyObject(this.cache[t[this.expando]]||{})},discard:function(e){e[this.expando]&&delete this.cache[e[this.expando]]}},n});