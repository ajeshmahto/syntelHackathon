var app =  angular.module("angularApp",[]);
app.controller("cntrl" , function($scope,$http){
	$scope.input ={
			host:"",
			timeout:500
	};
	
	$scope.green=false;
	$scope.red=false;
	
	$scope.check = function (){
		$http({
			url:'/healthcheck',
			method:'POST',
			data: angular.toJson($scope.input)
			
		}).then(function sucess(response){
			debugger;
			console.log(response.data);
			if(response.data==true){
				$scope.green=true;
				$scope.red=false;
			}
			
			if(response.data==false){
				$scope.green=false;
				$scope.red=true;
			}
			
			
		}
		, function  error(response){
			console.log(response.status);
			$scope.green=false;
			$scope.red=true;
			
		} );
	}
	
	
});