define(["app"],function(e){e.service("CloudService",["$q","LoadingService",function(e,t){function n(){this.nameSpace={},this.nameSpace.resource="https://civic-athlete-851.appspot.com/_ah/api/"}return n.prototype.init=function(){},n.prototype.requestEndPoint=function(n){var r=e.defer();return t.startProcess(),gapi.client.request(n||{}).then(function(e){e.result.items?r.resolve(e.result.items):r.resolve([])},function(e){r.reject()}),r.promise.finally(function(){t.stopProcess()}),r.promise},n.prototype.getResource=function(){return this.nameSpace.resource},new n}])});