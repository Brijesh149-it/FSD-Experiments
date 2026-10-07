import { useState } from 'react';
import Welcome from './Welcome';
import StudentForm from './StudentForm';
import StudentList from './StudentList';

function App() {
    const [students, setStudents] = useState(['Ajay', 'Priya', 'Rahul']);

    const addStudent = (name) => {
        setStudents([...students, name]);
    };

    return (
        <div>
            <h1>Student App</h1>

            <Welcome />

            <StudentForm addStudent={addStudent} />

            <StudentList students={students} />
        </div>
    );
}

export default App;
