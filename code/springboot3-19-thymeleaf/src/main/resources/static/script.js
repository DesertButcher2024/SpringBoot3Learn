document.getElementById('add-row-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;

    if (name && email) {
        const row = `<tr>
                        <td>${name}</td>
                        <td>${email}</td>
                        <td><button onclick="deleteRow(this)">删除</button></td>
                     </tr>`;

        document.getElementById('table-body').insertAdjacentHTML('beforeend', row);

        // 清空表单
        document.getElementById('name').value = '';
        document.getElementById('email').value = '';
    }
});

function deleteRow(button) {
    button.closest('tr').remove();
}