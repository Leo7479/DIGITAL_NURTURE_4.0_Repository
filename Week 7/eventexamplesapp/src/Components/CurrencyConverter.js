import React from "react";

const CurrencyConverter = ()=>{
    const buttonStyle = {
        backgroundColor: 'green', 
        color: 'white',
        fontWeight: 'bolder'
    };
    const convertToEuro = ()=>{
        let amount = document.getElementById("amount").value;
        alert("Euro: "+(amount*80))
    }
    return(
        <div>
            <h1 style={{color:'green'}}>Currency Converter</h1>
            <label htmlFor="amount">Amount</label>
            <input type='number' id="amount" defaultValue={0}/><br/>
            <label htmlFor="currency">Currency</label>
            <select id="currency">
                <option value="none" disabled selected>Choose a currency</option>
                <option value="Euro">Euro</option>    
            </select><br/>
            <button onClick={convertToEuro} style={buttonStyle}>Convert</button>
        </div>
    );

}
export default CurrencyConverter;