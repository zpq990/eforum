var app = require('../app');

app.controller('articleListController', function($scope,$sce,$location,articleService) {
	var promise = articleService.listArticle(1,20);
	promise.then(function(result) {
        if (result.data.success) {
        	$scope.articleList = articleService.parseArticleList(result.data.message);
        } else {
            alert(result.data.message);
        }
    }, function(result) {
    	alert("执行到这里" + result);
    },function(result){
    	alert("执行到这里   1" + result);
    });
	
	$scope.viewArticle = function(id){
		var promise = articleService.getArticleById(id);
		promise.then(function(result) {
	        if (result.data.success) {
	        	var article = result.data.message;
	            $location.path('/article').search({
	            	article : article
	            });
	        } else {
	            alert(result.data.message);
	        }
	    }, function(result) {
	    	alert("执行到这里" + result);
	    },function(result){
	    	alert("执行到这里   1" + result);
	    });
	}
});