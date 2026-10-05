const loadButton = document.getElementById('loadBtn');
const status = document.getElementById('status');
const usersContainer = document.getElementById('users');

// Arrow function
const showStatus = (message) => {
    status.textContent = message;
};

// Promise
const getUsers = () => {
    return new Promise((resolve, reject) => {
        fetch('https://jsonplaceholder.typicode.com/users')
            .then((response) => {
                if (!response.ok) {
                    reject('Failed to fetch users');
                    return;
                }

                return response.json();
            })
            .then((data) => {
                resolve(data);
            })
            .catch((error) => {
                reject(error);
            });
    });
};

// Arrow function to display users
const displayUsers = (users) => {
    usersContainer.innerHTML = '';

    users.forEach((user) => {
        const userDiv = document.createElement('div');

        userDiv.className = 'user';

        userDiv.innerHTML = `
            <h3>${user.name}</h3>
            <p>Email: ${user.email}</p>
            <p>City: ${user.address.city}</p>
        `;

        usersContainer.appendChild(userDiv);
    });
};

// Async + Await
const loadUsers = async () => {
    try {
        showStatus('Loading users...');

        console.log('Fetching users...');

        const users = await getUsers();

        console.log('Users received:', users);

        displayUsers(users);

        showStatus('Users loaded successfully!');
    } catch (error) {
        console.error('Error:', error);

        showStatus('Something went wrong!');
    }
};

// Event listener using arrow function
loadButton.addEventListener('click', () => {
    console.log('Load Users button clicked');

    loadUsers();
});
