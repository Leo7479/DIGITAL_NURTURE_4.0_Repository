import React from "react";

const ListOfPlayers = (props)=>{
    const players = props.players
    return(
        <ul>
            {
                players.map((player)=>
                    <div>
                        <li>Mr. {player.name} <span>{player.score}</span></li>
                    </div>
                )
            }
        </ul>
        
    );
}

export default ListOfPlayers;