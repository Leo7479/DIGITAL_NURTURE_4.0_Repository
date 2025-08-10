import React from "react";
import office from "./office.jpg";

const Header = ()=>{
    const jsxatt = <img src={office} alt="Office" width="400px" height="300px"/>
    const element = "Office Space";
    const details = {name:"DBS", price:75000, address: "Kolkata"}
    return(
        <div>
            <h1>{element}, at Afforadable Range</h1>
            {jsxatt}
            <h3>Name: <b>{details.name}</b></h3>
            <h3 style={{color: details.price<60000?'red':'green'}}>Rent: <b>{details.price}</b></h3>
            <h3>Address: <b>{details.address}</b></h3>
        </div>  
    );
}

export default Header;