import './App.css';
import React, {useState} from 'react';
import ListOfPlayers from './Components/ListOfPlayers';
import ScoreBelow70 from './Components/ScoreBelow70';
import OddPlayers from './Components/OddPlayers';
import EvenPlayers from './Components/EvenPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  var players = [
        {name:"Alex",score: 40},
        {name: "Dhoni",score: 100},
        {name: "Virat",score: 120},
        {name: "Dinesh",score: 70},
        {name: "Bhuvaneswar",score: 30},
        {name: "John", score: 60},
        {name: "Warner", score: 90},
        {name: "Smith", score: 100},
        {name: "Bumrah", score: 80},
        {name: "Babar", score: 60}
    ]
  var playerNames = ["Alex", "Dhoni", "Virat", "Dinesh", "Bhuvaneswar", "John", "Warner", "Smith", "Bumrah", "Babar"];
  var firstArr = ["First Player","Second Player", "Third Player"];
  var secondArr = ["Fourth Player", "Fifth Player", "Sixth Player"];
  const [flag, ] = useState(false);
  console.log(flag);
  if(flag){
    return (
      <div>
        <h1>List of All Players</h1>
        <ListOfPlayers players={players}/>
        <h1>List of Players who scored below 70</h1>
        <ScoreBelow70 players={players}/>
      </div>
    );
  }
  else{
    return(
      <div>
        <h1>Odd Players</h1>
        <OddPlayers players={playerNames}/>
        <h1>Even Player</h1>
        <EvenPlayers players={playerNames}/>
        <h1>List of Indian Players Merged</h1>
        <IndianPlayers players={[...firstArr, ...secondArr]}/>
      </div>
    );
  }
}

export default App;
