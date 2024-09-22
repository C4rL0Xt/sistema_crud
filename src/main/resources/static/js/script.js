document.addEventListener('DOMContentLoaded', function () {
    const deleteButtons = document.querySelectorAll('.button-delete');

    deleteButtons.forEach(button => {
        button.addEventListener('click', function () {
            const productId = this.getAttribute('data-id');
            if (confirm('¿Estás seguro de que deseas eliminar este producto?')) {
                fetch(`/productos/delete/${productId}`, {
                    method: 'DELETE',
                    headers: {
                        'Content-Type': 'application/json'
                    }
                })
                    .then(response => {
                        if (response.ok) {
                            alert('Producto eliminado exitosamente');
                            location.reload();  // Recargar la página para actualizar la tabla
                        } else {
                            alert('Hubo un error al eliminar el producto');
                        }
                    })
                    .catch(error => console.error('Error:', error));
            }
        });
    });
});