import { useState } from 'react';

function StudentForm({ addStudent }) {
    const [name, setName] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();

        if (name.trim() !== '') {
            addStudent(name);
            setName('');
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <label>Student Name: </label>

            <input
                type="text"
                value={name}
                onChange={(e) => setName(e.target.value)}
            />

            <button type="submit">Add Student</button>
        </form>
    );
}

export default StudentForm;
