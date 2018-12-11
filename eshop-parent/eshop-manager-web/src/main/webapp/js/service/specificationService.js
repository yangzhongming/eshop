app.service('specificationService',function($http){
    	//读取列表数据绑定到表单中
    	this.findAll=function(){
    		return $http.get('../specification/findAll.do');		
    	}
    	//分页 
    	this.findPage=function(page,size){
    		return $http.get('../specification/findPage.do?pageNum='+page+'&pageSize='+size);		
    	}
    	
    	//查询实体
    	this.findOne=function(id){
    		return $http.get('../specification/findOne.do?id=' + id);		
    	}    
    	
    	//增加 
    	this.add=function(entity){
    		return $http.post('../specification/add.do',entity);		
    	}
    	
    	//更新
    	this.update=function(entity){
    		return $http.post('../specification/update.do',entity);		
    	}
    	
    	//删除
    	this.del=function(ids){
    		return $http.get('../specification/delete.do?ids=' + ids);		
    	}

    	//搜索
    	this.search=function(page,size,searchEntity){
    		return $http.post('../specification/search.do?page='+page +'&size='+size,searchEntity);		
    	}
	}); 