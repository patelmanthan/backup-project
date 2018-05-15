$(function() {
    $('.validity').validity()
        .on('submit', function(e) {
            var $this = $(this),
                $btn = $this.find('[type="submit"]');
                $btn.button('loading');
            if (!$this.valid()) {
                e.preventDefault();
                $btn.button('reset');
            }
    });
});
var room = 1;
function education_fields() {
 
    room++;
    var objTo = document.getElementById('education_fields')
    var divtest = document.createElement("div");
	divtest.setAttribute("class", "form-group removeclass"+room);
	var rdiv = 'removeclass'+room;
    divtest.innerHTML = '<label for="inputAddress" class="control-label">Address</label><div class="form-group"><textarea rows="3" cols="80" class="form-control"  rows="3" placeholder="Enter Address" name="address" id="name2" data-missing="This field is required" required></textarea></div><div class="row"><div class="col-sm-4 nopadding"><label for="inputAddress" class="control-label">City</label><div class="form-group"> <input type="text" class="form-control" id="name2" data-missing="This field is required" name="city" value="" placeholder="enter city" required></div></div><div class="col-sm-4 nopadding"><label for="inputAddress" class="control-label">State</label><div class="form-group"> <input type="text" class="form-control" id="name2" data-missing="This field is required" name="state" value="" placeholder="enter state" required></div></div><div class="col-sm-4 nopadding"><label for="inputAddress" class="control-label">Country</label><div class="form-group"><input type="text" class="form-control" id="name2" data-missing="This field is required" name="country" value="" placeholder="enter country" required><div class="input-group"> <div class="input-group-btn"> <button class="btn btn-danger" type="button" onclick="remove_education_fields('+ room +');"> <span class="glyphicon glyphicon-minus" aria-hidden="true"></span> </button></div></div></div></div></div><div class="clear"></div>';
    
    objTo.appendChild(divtest)
}
   function remove_education_fields(rid) {
	   $('.removeclass'+rid).remove();
   }

   $(document).ready(function() {

		//here first get the contents of the div with name class copy-fields and add it to after "after-add-more" div class.
	      $(".add-more").click(function(){ 
	          var html = $(".copy-fields").html();
	          $(".after-add-more").after(html);
	      });
	//here it will remove the current value of the remove button which has been pressed
	      $("body").on("click",".remove",function(){ 
	          $(this).parents(".control-group").remove();
	      });

	    });

   var check = function() {
	   if (document.getElementById('password2').value ==
	     document.getElementById('confirm_password').value) {
	     document.getElementById('message').style.color = 'green';
	     document.getElementById('message').innerHTML = 'matching';
	   } else {
	     document.getElementById('message').style.color = 'red';
	     document.getElementById('message').innerHTML = 'not matching';
	   }
	 }
   
   
   
	  var _gaq = _gaq || [];
	  _gaq.push(['_setAccount', 'UA-36251023-1']);
	  _gaq.push(['_setDomainName', 'jqueryscript.net']);
	  _gaq.push(['_trackPageview']);
	
	  (function() {
	    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	  })();
	
		 function readURL(input) {
         if (input.files && input.files[0]) {
             var reader = new FileReader();

             reader.onload = function (e) {
                 $('#blah')
                 .attr('src', e.target.result);
             };

             reader.readAsDataURL(input.files[0]);
         }
     }
	
 $(function () {
     $('#datetimepicker1').datepicker({
         format: "dd/mm/yyyy",
         endDate: '+0d',
         autoclose: true,
         todayHighlight: true
     });
 });

$(function() {
 // Remove button click
 $(document).on(
     'click',
     '[data-role="dynamic-fields"] > .form-inline [data-role="remove"]',
     function(e) {
         e.preventDefault();
         $(this).closest('.form-inline').remove();
     }
 );
 // Add button click
 $(document).on(
     'click',
     '[data-role="dynamic-fields"] > .form-inline [data-role="add"]',
     function(e) {
         e.preventDefault();
         var container = $(this).closest('[data-role="dynamic-fields"]');
         new_field_group = container.children().filter('.form-inline:first-child').clone();
         new_field_group.find('input').each(function(){
             $(this).val('');
         });
         container.append(new_field_group);
     }
 );
});
(function ($) {
    $(function () {

        var addFormGroup = function (event) {
            event.preventDefault();

            var $formGroup = $(this).closest('.form-group');
            var $multipleFormGroup = $formGroup.closest('.multiple-form-group');
            var $formGroupClone = $formGroup.clone();

            $(this)
                .toggleClass('btn-default btn-add btn-danger btn-remove')
                .html('–');

            $formGroupClone.find('input').val('');
            $formGroupClone.insertAfter($formGroup);

            var $lastFormGroupLast = $multipleFormGroup.find('.form-group:last');
            if ($multipleFormGroup.data('max') <= countFormGroup($multipleFormGroup)) {
                $lastFormGroupLast.find('.btn-add').attr('disabled', true);
            }
        };

        var removeFormGroup = function (event) {
            event.preventDefault();

            var $formGroup = $(this).closest('.form-group');
            var $multipleFormGroup = $formGroup.closest('.multiple-form-group');

            var $lastFormGroupLast = $multipleFormGroup.find('.form-group:last');
            if ($multipleFormGroup.data('max') >= countFormGroup($multipleFormGroup)) {
                $lastFormGroupLast.find('.btn-add').attr('disabled', false);
            }

            $formGroup.remove();
        };

        var countFormGroup = function ($form) {
            return $form.find('.form-group').length;
        };

        $(document).on('click', '.btn-add', addFormGroup);
        $(document).on('click', '.btn-remove', removeFormGroup);

    });
})(jQuery);

$(document).ready(function () {
	  //called when key is pressed in textbox
	  $("#quantity").keypress(function (e) {
	     //if the letter is not digit then display error and don't type anything
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	        //display error message
	        $("#errmsg").html("Digits Only").show().fadeOut("slow");
	               return false;
	    }
	   });
	});
