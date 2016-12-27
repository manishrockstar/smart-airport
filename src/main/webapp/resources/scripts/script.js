
function goBack() {
    window.history.back();
}



function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
}

function myFunction() {
       var password = document.getElementById("psw1").value;
       var confirmPassword = document.getElementById("psw2").value;
        if (password != confirmPassword) 
        {
            alert("Passwords do not match.");
            return false;
        }
        return true;

}
function required(inputtx)   
   {  
     if (inputtx.value.length == 0)  
      {   
         alert("message");        
         return false;   
      }       
      return true;   
    }   