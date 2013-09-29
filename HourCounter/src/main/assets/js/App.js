App = function(){

	var checkFormCompatible= function(input,type){
		if(input.type == type){
			return true;
		}else{
			return false;
		}
	};

	return {
		checkForm:checkFormCompatible
	};
};

App.prototype={
	constructor:App
};

