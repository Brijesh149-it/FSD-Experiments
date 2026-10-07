import './App.css';
import { useDispatch, useSelector } from 'react-redux';
import { fetchUsers } from './store';

function App() {
    const dispatch = useDispatch();

    const users = useSelector((state) => state.users.users);
    const loading = useSelector((state) => state.users.loading);

    return (
        <div>
            <h1>User List</h1>

            <button onClick={() => dispatch(fetchUsers())}>Fetch Users</button>

            {loading && <p>Loading...</p>}

            <ul>
                {users.map((user) => (
                    <li key={user.id}>{user.name}</li>
                ))}
            </ul>
        </div>
    );
}

export default App;