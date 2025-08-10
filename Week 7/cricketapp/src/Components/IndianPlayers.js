import React from "react";

const IndianPlayers = (props)=>{
    const players = props.players;

    return(
        <ul>
            {
                players.map(p=>
                    <li>Mr. {p}</li>
                )
            }
        </ul>
    );
}

export default IndianPlayers;