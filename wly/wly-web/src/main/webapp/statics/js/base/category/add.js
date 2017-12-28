/**
 * 新增-分类表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		blogCategory: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../blog/category/save?_' + $.now(),
		    	param: vm.blogCategory,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
