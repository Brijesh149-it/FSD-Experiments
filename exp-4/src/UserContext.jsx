import { createContext, useContext, useEffect, useState } from 'react';
import axios from 'axios';

const UserContext = createContext();

export const UserProvider = ({ children }) => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        axios
            .get('https://jsonplaceholder.typicode.com/users')
            .then((response) => setUsers(response.data))
            .catch((error) => console.log(error));
    }, []);

    return (
        <UserContext.Provider value={users}>{children}</UserContext.Provider>
    );
};

export const useUsers = () => useContext(UserContext);
