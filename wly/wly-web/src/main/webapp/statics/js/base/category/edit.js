/**
 * 编辑-分类表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		blogCategory: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../blog/category/info?_' + $.now(),
		    	param: vm.blogCategory.id,
		    	success: function(data) {
		    		vm.blogCategory = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../blog/category/update?_' + $.now(),
		    	param: vm.blogCategory,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})