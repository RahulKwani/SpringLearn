actions-box// 1 - START DROPDOWN SLIDER SCRIPTS ------------------------------------------------------------------------

$(document).ready(function () {
    $(".showhide-account").click(function () {
        $(".account-content").slideToggle("fast");
        $(this).toggleClass("active");
        return false;
    });
});


//  END ----------------------------- 1

// 2 - START LOGIN PAGE SHOW HIDE BETWEEN LOGIN AND FORGOT PASSWORD BOXES--------------------------------------

$(document).ready(function () {
	$(".forgot-pwd").click(function () {
	$("#loginbox").hide();
	$("#forgotbox").show();
	return false;
	});

});

$(document).ready(function () {
	$(".back-login").click(function () {
	$("#loginbox").show();
	$("#forgotbox").hide();
	return false;
	});
});

// END ----------------------------- 2



// 3 - MESSAGE BOX FADING SCRIPTS ---------------------------------------------------------------------

$(document).ready(function() {
	$(".close-yellow").click(function () {
		$("#message-yellow").fadeOut("slow");
	});
	$(".close-red").click(function () {
		$("#message-red").fadeOut("slow");
	});
	$(".close-blue").click(function () {
		$("#message-blue").fadeOut("slow");
	});
	$(".close-green").click(function () {
		$("#message-green").fadeOut("slow");
	});
	
	//ADDED BY RAHUL K.
	var currentPage = document.location.pathname.match(/[^\/]+$/)[0];
	if(currentPage.includes('Dashboard')){
		$('.nav-dashboard').addClass('current');
	}
	if(currentPage.includes('Products')){
		$('.nav-products').addClass('current');
	}
	if(currentPage.includes('Categories')){
		$('.nav-categories').addClass('current');
	}
	/*$(".submit-login").click(function(){
		$("#login-inner").submit();
	});
	*/
	

	
});
// END ----------------------------- 3



// 4 - CLOSE OPEN SLIDERS BY CLICKING ELSEWHERE ON PAGE -------------------------------------------------------------------------

$(document).bind("click", function (e) {
    if (e.target.id != $(".showhide-account").attr("class")) $(".account-content").slideUp();
});

$(document).bind("click", function (e) {
    if (e.target.id != $(".action-slider").attr("class")) $("#actions-box-slider").slideUp();
});
// END ----------------------------- 4
 
 
 
// 5 - TABLE ROW BACKGROUND COLOR CHANGES ON ROLLOVER -----------------------------------------------------------------------
/*
$(document).ready(function () {
    $('#product-table	tr').hover(function () {
        $(this).addClass('activity-blue');
    },
    function () {
        $(this).removeClass('activity-blue');
    });
});
 */
// END -----------------------------  5
 
 
 
 // 6 - DYNAMIC YEAR STAMP FOR FOOTER -----------------------------------------------------------------------

 $('#spanYear').html(new Date().getFullYear()); 
 
// END -----------------------------  6 
  
// 7 - Validation for login form ---------------------------------------
 /*$('#user').validate({
	rules: {
		'userName' : required,
		'password' : required,
		 'mobileNum' :{
			 required : true,
			 email : true
		 }
	},
	messages :{
		'userName' : 'User Name is required',
		'password' : 'Please enter password',
		'mobileNum': {
            required: 'Email is required.',
            email: 'A valid email is required.'
        }
	}
 });*/