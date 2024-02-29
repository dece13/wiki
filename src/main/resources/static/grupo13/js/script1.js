document.addEventListener('DOMContentLoaded', function () {
    const selectMember = document.getElementById('select-member');
    const memberInfo = document.getElementById('member-info');

    // Datos de los miembros del equipo (pueden ser obtenidos de una base de datos o archivo JSON)
    const members = [
        { name: 'Daniel Castellanos', role: 'Líder técnico', languages: 'HTML/CSS/JS', description: 'Descripción del Miembro 1' },
        { name: 'Julian ', role: 'Líder planeación', languages: 'Thymeleaf', description: 'Descripción del Miembro 2' },
        { name: 'Martin Medina', role: 'Líder de pruebas', languages: 'Java', description: 'Descripción del Miembro 3' }
        // Agrega más miembros según sea necesario
    ];

    // Función para mostrar la información del miembro seleccionado
    function displayMemberInfo(memberIndex) {
        const member = members[memberIndex - 1]; // Restamos 1 para obtener el índice correcto del array
        memberInfo.innerHTML = `
            <h3>${member.name}</h3>
            <p><strong>Rol:</strong> ${member.role}</p>
            <p><strong>Lenguajes:</strong> ${member.languages}</p>
            <p><strong>Descripción:</strong> ${member.description}</p>
        `;
    }

    // Evento para detectar cambios en el select
    selectMember.addEventListener('change', function () {
        const selectedMember = parseInt(selectMember.value);
        if (selectedMember !== 0) {
            displayMemberInfo(selectedMember);
        } else {
            memberInfo.innerHTML = ''; // Limpiar el contenido si no se ha seleccionado ningún miembro
        }
    });
});
