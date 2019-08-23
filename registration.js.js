$(document).ready(function() {
$("#register").click(function() {
var email = $("#email").val();
var password = $("#password").val();
if (email == '' || password == '') {
alert("Please fill all fields...!!!!!!");
} 
else {
alert("You have successfully logged in");
}
});
});