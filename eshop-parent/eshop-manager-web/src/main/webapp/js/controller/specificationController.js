	app.controller('specificationController', function($scope,$controller,specificationService) {

		//controller实现继承
		$controller('baseController',{$scope:$scope});
		
		//查询品牌列表
		$scope.findAll = function() {
			specificationService.findAll().success(function(response) {
				$scope.list = response;
			});
		}

		//分页 
		$scope.findPage = function(page, size) {
			specificationService.findPage(page, size).success(function(response) {
				$scope.list = response.rows;//显示当前页数据 	
				$scope.paginationConf.totalItems = response.total;//更新总记录数 
			});
		}

		//增加品牌
		$scope.save = function() {
			var object = null;

			if ($scope.entity.id != null) {
				object=specificationService.update($scope.entity);
			} else{
				object=specificationService.add($scope.entity);
			}
			object.success(function(response) {
						if (response.success) {
							$scope.reloadList();
						} else {
							alert(response.message);
						}
		});
		}

		//查询实体
		$scope.findOne = function(id) {
			specificationService.findOne(id).success(
					function(response) {
						$scope.entity = response;
					});
		}
 

		//删除
		$scope.del = function() {
			if (confirm('确定要删除吗？')) {
				specificationService.del( $scope.selectIds)
						.success(function(response) {
							if (response.success) {
								$scope.reloadList();//刷新
							} else {
								alert(response.message);
							}
						});
			}

		}
		//查找
		$scope.searchEntity={};
		//条件查询 
		$scope.search=function(page,size){
			specificationService.search(page,size,$scope.searchEntity).success(
				function(response){
					$scope.list=response.rows;//显示当前页数据 	
					$scope.paginationConf.totalItems=response.total;//更新总记录数 
				}		
			);	
		}
	});