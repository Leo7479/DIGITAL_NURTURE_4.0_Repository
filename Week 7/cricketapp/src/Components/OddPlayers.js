import React from "react";

const OddPlayers = (props)=>{
    const [first,,third,,fifth] = props.players;
    return(
        <div>
            <li>First: <b>{first}</b></li>
            <li>Third <b>{third}</b></li>
            <li>Fifth <b>{fifth}</b></li>
        </div>
    );
}

export default OddPlayers;