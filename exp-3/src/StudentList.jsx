function StudentList({ students }) {
    return (
        <div>
            <h3>Student List</h3>

            {students.length > 0 ? (
                <ul>
                    {students.map((student, index) => (
                        <li key={index}>{student}</li>
                    ))}
                </ul>
            ) : (
                <p>No students added.</p>
            )}
        </div>
    );
}

export default StudentList;
