import React from "react";
import LoginButton from "./LoginButton";

const GuestGreet = (props)=>{
    return(
        <div>
            <h1>Please Log In to continue</h1>
            <LoginButton loggedIn={props.loggedIn}/>
        </div>
    );
}

export default GuestGreet;