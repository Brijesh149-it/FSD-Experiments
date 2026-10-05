import { useUsers } from './UserContext';
import './App.css';
const App = () => {
    const users = useUsers();

    return (
        <div>
            <h1>User List</h1>

            {users.map((user) => (
                <p key={user.id}>
                    {user.name} - {user.email}
                </p>
            ))}
        </div>
    );
};

export default App;
