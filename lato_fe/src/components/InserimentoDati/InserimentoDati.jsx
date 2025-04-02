import React, {useState} from "react";

export default function InserimentoDati() {
    const[formDati, setFormDati] = useState({
        matricola: "",
        annoAccademico: "",
        isee: ""
    });

    const variazioneDati = (e) => {
        const {name, value} = e.target; //e sta per evento ed è una convenzione Javascript
        setFormDati({
            ...formDati,
            [name]: value //variazione del valore
        });
    };
    
    const inviaDati = (e) => {
        e.preventDefault(); //Serve a personalizzare l'evento che stiamo facendo
        console.log(formDati); //Dati stampati quando vengono inviati
    }

    return(
        <div>
            <form onSubmit={inviaDati}>
                <label htmlFor="matricola">Numero di matricola: </label>
                <input type="number" id="matricola" name="matricola" 
                value={matricola} onChange={variazioneDati}></input> <br/>
                <label htmlFor="annoAccademico">Inserisci, in numero, l'anno accademico a cui sei iscritto: </label>
                <input type="number" id="annoAccedemico" name="annoAccademico" 
                value={annoAccademico} onChange={variazioneDati}></input> <br/>
                <label htmlFor="isee">Inserisci il valore del tuo ISEE: </label>
                <input type="number" id="isee" name="isee"
                value={isee} onChange={variazioneDati}></input> <br/>
                <button type="submit">Invia</button>
            </form>
        </div>
    );
}