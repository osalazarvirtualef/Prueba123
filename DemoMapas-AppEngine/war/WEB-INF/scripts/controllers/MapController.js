define(["app","GoogleGapiClient"],function(e){e.controller("MapController",["$scope","MapModel","MapService",function(e,t,n){e.map={},e.map.geoMap=new t(document.getElementById("map")),n.getNotifications().then(function(t){e.map.notificationsMap=t})}])});