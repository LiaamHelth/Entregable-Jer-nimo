package co.edu.umanizales;

/**
 * Aplicación principal que muestra un mensaje de saludo.
 */
public class MainApp {
    
    private static class Car {
        private String placa;
        private String color;
        private String modelo;

        public Car(String placa, String color, String modelo) {
            this.placa = placa;
            this.color = color;
            this.modelo = modelo;
        }

        public String getPlaca() { return placa; }
        public void setPlaca(String placa) { this.placa = placa; }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
        public String getModelo() { return modelo; }
        public void setModelo(String modelo) { this.modelo = modelo; }
    }

    private static class Motorcycle {
        private String placa;
        private String modelo;
        private String color;

        public Motorcycle(String placa, String modelo, String color) {
            this.placa = placa;
            this.modelo = modelo;
            this.color = color;
        }

        public String getPlaca() { return placa; }
        public void setPlaca(String placa) { this.placa = placa; }
        public String getModelo() { return modelo; }
        public void setModelo(String modelo) { this.modelo = modelo; }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
    }

    private static class Scooter {
        private String modelo;
        private String color;

        public Scooter(String modelo, String color) {
            this.modelo = modelo;
            this.color = color;
        }

        public String getModelo() { return modelo; }
        public void setModelo(String modelo) { this.modelo = modelo; }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
    }
    
    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        
        // Crear un arreglo de Object que puede contener cualquier tipo de vehículo
        Object[] vehiculos = new Object[3];
        
        // Crear instancias de cada tipo de vehículo usando encapsulamiento
        vehiculos[0] = new Car("ABC123", "Rojo", "2023");
        vehiculos[1] = new Motorcycle("XYZ789", "Deportiva", "Negra");
        vehiculos[2] = new Scooter("Eléctrico", "Blanco");
        
        // Recorrer el arreglo con for mejorado (for-each) y mostrar información de cada vehículo
        System.out.println("=== Lista de Vehículos ===");
        for (Object vehiculo : vehiculos) {
            if (vehiculo instanceof Car carro) {
                System.out.println("Tipo: Carro, Placa: " + carro.getPlaca() + 
                               ", Color: " + carro.getColor() + 
                               ", Modelo: " + carro.getModelo());
            } else if (vehiculo instanceof Motorcycle moto) {
                System.out.println("Tipo: Moto, Placa: " + moto.getPlaca() + 
                               ", Color: " + moto.getColor() + 
                               ", Modelo: " + moto.getModelo());
            } else if (vehiculo instanceof Scooter scooter) {
                System.out.println("Tipo: Scooter, Modelo: " + scooter.getModelo() + 
                               ", Color: " + scooter.getColor());
            }
        }
    }
}
