INSERT INTO Connection (connection_type) VALUES ('Ethernet');
INSERT INTO Connection (connection_type) VALUES ('Wi-Fi');

INSERT INTO CoolingSystem (cooling_system_type) VALUES ('Air Cooling');
INSERT INTO CoolingSystem (cooling_system_type) VALUES ('Liquid Cooling');

INSERT INTO CPU (cpu_model, computer_id) VALUES ('Intel Core i5', 1);
INSERT INTO CPU (cpu_model, computer_id) VALUES ('AMD Ryzen 7', 2);
INSERT INTO CPU (cpu_model, computer_id) VALUES ('Intel Core i3', 3);
INSERT INTO CPU (cpu_model, computer_id) VALUES ('Intel Pentium', 4);


INSERT INTO GPU (gpu_model, computer_id) VALUES ('Nvidia GeForce GTX 1660', 1);
INSERT INTO GPU (gpu_model, computer_id) VALUES ('AMD Radeon RX 5700', 2);
INSERT INTO GPU (gpu_model, computer_id) VALUES ('AMD Radeon RX 5600', 3);
INSERT INTO GPU (gpu_model, computer_id) VALUES ('AMD Radeon RX 5500', 4);

INSERT INTO Memory (memory_type, memory_capacity, computer_id) VALUES ('DDR4', 16, 1);
INSERT INTO Memory (memory_type, memory_capacity, computer_id) VALUES ('DDR4', 32, 2);
INSERT INTO Memory (memory_type, memory_capacity, computer_id) VALUES ('DDR3', 16, 3);
INSERT INTO Memory (memory_type, memory_capacity, computer_id) VALUES ('DDR3', 16, 4);

INSERT INTO Motherboard (motherboard_model) VALUES ('ASUS ROG Strix Z390');
INSERT INTO Motherboard (motherboard_model) VALUES ('MSI B450 TOMAHAWK');

INSERT INTO PowerSupply (power_supply_model) VALUES ('Corsair RM750');
INSERT INTO PowerSupply (power_supply_model) VALUES ('EVGA Supernova 650 G5');

INSERT INTO Storage (storage_type, storage_capacity, computer_id) VALUES ('SSD', 500, 1);
INSERT INTO Storage (storage_type, storage_capacity, computer_id) VALUES ('HDD', 1000, 2);
INSERT INTO Storage (storage_type, storage_capacity, computer_id) VALUES ('SSD', 480, 3);
INSERT INTO Storage (storage_type, storage_capacity, computer_id) VALUES ('SSD', 240, 4);

UPDATE GPU SET gpu_model = 'Nvidia GeForce RTX 3080' WHERE computer_id = 1;
UPDATE GPU SET gpu_model = 'AMD Radeon RX 5700' WHERE computer_id = 2;
UPDATE CPU SET cpu_model = 'Intel Core i7' WHERE cpu_id = 1;
UPDATE CPU SET cpu_model = 'AMD Ryzen 9' WHERE cpu_id = 2;
UPDATE Memory SET memory_capacity = 64 WHERE memory_id = 2;
UPDATE Memory SET memory_capacity = 32 WHERE memory_id = 1;
UPDATE Motherboard SET motherboard_model = 'ASUS ROG Strix Z590-E' WHERE motherboard_id = 1;
UPDATE PowerSupply SET power_supply_model = 'Corsair RM850x' WHERE power_supply_id = 2;
UPDATE Storage SET storage_capacity = 2000 WHERE storage_id = 2;
UPDATE Connection SET connection_type = 'Ethernet and Wi-Fi' WHERE connection_id = 1;

DELETE FROM Memory WHERE computer_id = 3;
DELETE FROM Memory WHERE computer_id = 4;
DELETE FROM GPU WHERE computer_id = 3;
DELETE FROM GPU WHERE computer_id = 4;
DELETE FROM Storage WHERE computer_id = 3;
DELETE FROM Storage WHERE computer_id = 4;
DELETE FROM Storage WHERE computer_id = 2;
DELETE FROM CPU WHERE computer_id = 3;
DELETE FROM CPU WHERE computer_id = 4;
DELETE FROM CPU WHERE computer_id = 2;

ALTER TABLE Computer ADD COLUMN purchase_date DATE;
ALTER TABLE Memory MODIFY COLUMN memory_type VARCHAR(100);
ALTER TABLE CPU CHANGE COLUMN cpu_model cpu_type VARCHAR(50);
ALTER TABLE Memory ADD CONSTRAINT fk_computer FOREIGN KEY (computer_id) REFERENCES Computer(computer_id);
ALTER TABLE Computer DROP COLUMN cooling_system_id;

SELECT *
FROM Computer
LEFT JOIN Motherboard ON Computer.motherboard_id = Motherboard.motherboard_id
LEFT JOIN PowerSupply ON Computer.power_supply_id = PowerSupply.power_supply_id
LEFT JOIN CoolingSystem ON Computer.cooling_system_id = CoolingSystem.cooling_system_id
LEFT JOIN CPU ON Computer.computer_id = CPU.computer_id
LEFT JOIN GPU ON Computer.computer_id = GPU.computer_id
LEFT JOIN Memory ON Computer.computer_id = Memory.computer_id
LEFT JOIN NetworkAdapter ON Computer.computer_id = NetworkAdapter.computer_id
LEFT JOIN Storage ON Computer.computer_id = Storage.computer_id;

SELECT * FROM Computer
LEFT JOIN Motherboard ON Computer.motherboard_id = Motherboard.motherboard_id;

SELECT * FROM Computer
RIGHT JOIN PowerSupply ON Computer.power_supply_id = PowerSupply.power_supply_id;

SELECT * FROM Computer
INNER JOIN CoolingSystem ON Computer.cooling_system_id = CoolingSystem.cooling_system_id;

SELECT * FROM CPU
FULL OUTER JOIN GPU ON CPU.computer_id = GPU.computer_id;

SELECT * FROM Computer
JOIN Memory ON Computer.computer_id = Memory.computer_id
WHERE Memory.memory_capacity > 16;