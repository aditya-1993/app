import React from 'react';
import logo from './logo.svg';
import './App.css';
import UserView from './components/UserView/UserView';

function App() {
  return (
    <div className="App">
      <UserView></UserView>
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Oh yea <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
