let heading = document.getElementById('heading');
let text = document.getElementById('text');

document.getElementById('changeText').onclick = function () {
    text.textContent = 'Text Changed using DOM!';
};

document.getElementById('changeColor').onclick = function () {
    text.style.color = 'blue';
    text.style.fontSize = '20px';
};

document.getElementById('add').onclick = function () {
    let newText = document.createElement('p');
    newText.textContent = 'New Element';
    newText.style.color = 'green';

    document.body.appendChild(newText);
};

document.getElementById('remove').onclick = function () {
    let element = document.querySelector('p');

    if (element) {
        element.remove();
    }
};
