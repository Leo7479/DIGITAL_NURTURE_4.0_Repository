import React from "react";

const ScoreBelow70 = (props)=>{
    const players = props.players;
    let filteredPlayers = players.filter((player)=>{
        return player.score<70;
    })
    return(
        <ul>
            {
                filteredPlayers.map(fp=>
                    <li>Mr. {fp.name} <span>{fp.score}</span></li>
                )
            }
        </ul>
    );
}

export default ScoreBelow70;