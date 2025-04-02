import './App.css';
import InserimentoDati from './components/InserimentoDati/InserimentoDati';

function App() {
  return (
    <div className="App">
      <header className='App-header'>
        <h1>Benvenuto</h1>
        <h2>Inserisci i tuoi dati per verificare quanto dovresti pagare in tasse</h2>
      </header>
      <div>
        <InserimentoDati/>
      </div>
    </div>
  );
}

export default App;
