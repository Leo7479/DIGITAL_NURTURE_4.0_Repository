import React from "react";
import LogoutButton from "./LogoutButton";

const UserGreet = (props)=>{
    return(
        <div>
            <h1>Hello User</h1>
            <LogoutButton loggedIn={props.loggedIn}/>
        </div>
    );
}

export default UserGreet;