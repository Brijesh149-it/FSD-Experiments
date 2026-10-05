import {BrowserRouter, Routes, Route, Link} from 'react-router-dom';
import './App.css';

const App = () => {

  return (
      <div>
          <BrowserRouter>

              <nav style={{display:"flex", gap:10}}>
                <Link to="/">Home</Link>
                <Link to="/about">About</Link>
                <Link to="/contact">Contact</Link>
              </nav>

              <Routes>
                  <Route path="/" element={<h2>Home Page</h2>} />
                  <Route path="/about" element={<h2>About us</h2>} />
                  <Route path="/contact" element={<h2>Contact</h2>} />
              </Routes>
          </BrowserRouter>
      </div>
  );
}

export default App