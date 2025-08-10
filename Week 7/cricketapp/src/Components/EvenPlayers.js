import React from "react";

const EvenPlayers = (props)=>{
    const [,second,,fourth,,sixth] = props.players;
    return(
        <div>
            <li>Second: <b>{second}</b></li>
            <li>Fourth <b>{fourth}</b></li>
            <li>Sixth <b>{sixth}</b></li>
        </div>
    );
}

export default EvenPlayers;