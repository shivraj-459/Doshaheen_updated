


let form=document.getElementById("formData");



function func(){

    event.preventDefault();

    let username=document.getElementById("userName").value;
    let email=document.getElementById("mail").value;
    let password=document.getElementById("password").value;
    let confirm_password=document.getElementById("C_password").value;

    let data={

        userName:username,
        email:email,
        password:password
    }


    if(password!=confirm_password){

        alert("password does not match");
    }

    let p=fetch("http://localhost:8888/addusers",{

          method:"POST",
          headers:{
            "Content-Type":"application/json"
           },
           body:JSON.stringify(data),
        }).then((res)=>{

            console.log("Success");
          return  res.json();
        }).then((val)=>{

          console.log(val);
        })
        .catch((res)=>{
            console.log(res);
            
        })
    
        // window.location.reload();

}




