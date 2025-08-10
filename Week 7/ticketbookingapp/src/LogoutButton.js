import React from "react";

const LogoutButton = (props)=>{
    return(
        <button style={{backgroundColor:'grey', color:'black'}} onClick={()=>{props.loggedIn(false)}}>Log Out</button>
    );

}
export default LogoutButton;