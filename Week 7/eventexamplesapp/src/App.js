import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import CurrencyConverter from './Components/CurrencyConverter';

function App() {
  const [counter, setCounter] = useState(0);
  const [clicked, setClicked] = useState(false);
  function increment(){
    setCounter(counter+1);
  }
  function decrement(){
    setCounter(counter-1);
  }
  function sayWelcome(str){
    alert(str);
  }
  const onPress = ()=>{
    setClicked(true);
    alert("Clicked");
  }
  return (
    <div>
      <h1>Counter: {counter}</h1>
      <button onClick={increment}>Increment</button><br/>
      <button onClick={decrement}>Decrement</button><br/>
      <button onClick={event=>{
        sayWelcome("Welcome to React");
      }}>Say Welcome</button><br/>
      <button onClick={onPress}>Click Me</button>
      <hr></hr>
      <CurrencyConverter />
    </div>
  );
}

export default App;
