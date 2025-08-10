import React from "react";

const LoginButton = (props)=>{
    return(
        <button style={{backgroundColor:'blue', color:'white'}} onClick={()=>{props.loggedIn(true)}}>Log In</button>
    );

}
export default LoginButton;