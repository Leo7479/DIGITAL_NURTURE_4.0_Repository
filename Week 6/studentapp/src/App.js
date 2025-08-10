import './App.css';
import Home from "./Components/Home";
import About from './Components/About'; // Importing Default Export
import {Contact} from './Components/Contact'; // Import Named Export

function App() {
  return (
    <div>
      <Home/>
      <About/>
      <Contact/>
    </div>
  );
}

export default App;
