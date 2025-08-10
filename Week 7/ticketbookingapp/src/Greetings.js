import React, {useState} from "react";
import UserGreet from "./UserGreet";
import GuestGreet from "./GuestGreet";

const Greetings = ()=>{
  var [isLoggedIn, setIsLoggedIn] = useState(false);
    if(isLoggedIn)
        return(
            <UserGreet loggedIn={setIsLoggedIn}/>
        );
    else
        return(
            <GuestGreet loggedIn={setIsLoggedIn}/>
        );
}

export default Greetings;