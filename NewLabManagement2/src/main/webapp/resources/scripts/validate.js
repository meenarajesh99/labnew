function validateUser(){
    var username = document.register.username.value;
    var password = document.register.password.value;
    var letters = /^[a-zA-Z0-9]+$/;


    if(!username.match(letters) && !username.length<10)
    {
      var username = document.getElementById("username").value;
      alert("username should contain alphabet & atleast one number & length should be less than 10")
    return false;
    } 
    
      
      else if((password.length) >= 0 && (password.length < 6))
      {
        alert("Password should not be blank and must be atleast 6 characters long")
        return false;
      }
         else {
		var username = document.getElementById("username").value;
          var password = document.getElementById("password").value;
      
      return true;
      }
    
  }
