CREATE TABLE Computer (
    computer_id INT PRIMARY KEY AUTO_INCREMENT,
    computer_name VARCHAR(50),
    motherboard_id INT,
    power_supply_id INT,
    cooling_system_id INT,
    FOREIGN KEY (motherboard_id) REFERENCES Motherboard(motherboard_id),
    FOREIGN KEY (power_supply_id) REFERENCES PowerSupply(power_supply_id),
    FOREIGN KEY (cooling_system_id) REFERENCES CoolingSystem(cooling_system_id)
);

CREATE TABLE ComputerComponent (
    component_id INT PRIMARY KEY AUTO_INCREMENT,
    component_name VARCHAR(50)
);

CREATE TABLE Connection (
    connection_id INT PRIMARY KEY AUTO_INCREMENT,
    connection_type VARCHAR(50)
);

CREATE TABLE CoolingSystem (
    cooling_system_id INT PRIMARY KEY AUTO_INCREMENT,
    cooling_system_type VARCHAR(50)
);

CREATE TABLE CPU (
    cpu_id INT PRIMARY KEY AUTO_INCREMENT,
    cpu_model VARCHAR(50),
    computer_id INT,
    FOREIGN KEY (computer_id) REFERENCES Computer(computer_id)
);

CREATE TABLE GPU (
    gpu_id INT PRIMARY KEY AUTO_INCREMENT,
    gpu_model VARCHAR(50),
    computer_id INT,
    FOREIGN KEY (computer_id) REFERENCES Computer(computer_id)
);

CREATE TABLE Memory (
    memory_id INT PRIMARY KEY AUTO_INCREMENT,
    memory_type VARCHAR(50),
    memory_capacity INT,
    computer_id INT,
    FOREIGN KEY (computer_id) REFERENCES Computer(computer_id)
);

CREATE TABLE Motherboard (
    motherboard_id INT PRIMARY KEY AUTO_INCREMENT,
    motherboard_model VARCHAR(50)
);

CREATE TABLE NetworkAdapter (
    network_adapter_id INT PRIMARY KEY AUTO_INCREMENT,
    adapter_model VARCHAR(50),
    computer_id INT,
    FOREIGN KEY (computer_id) REFERENCES Computer(computer_id)
);

CREATE TABLE PowerSupply (
    power_supply_id INT PRIMARY KEY AUTO_INCREMENT,
    power_supply_model VARCHAR(50)
);

CREATE TABLE Storage (
    storage_id INT PRIMARY KEY AUTO_INCREMENT,
    storage_type VARCHAR(50),
    storage_capacity INT,
    computer_id INT,
    FOREIGN KEY (computer_id) REFERENCES Computer(computer_id)
);