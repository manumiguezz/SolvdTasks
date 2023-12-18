INSERT INTO Connection (connection_type) VALUES ('Ethernet');
INSERT INTO Connection (connection_type) VALUES ('Wi-Fi');

INSERT INTO CoolingSystem (cooling_system_type) VALUES ('Air Cooling');
INSERT INTO CoolingSystem (cooling_system_type) VALUES ('Liquid Cooling');

INSERT INTO CPU (cpu_model, computer_id) VALUES ('Intel Core i5', 1);
INSERT INTO CPU (cpu_model, computer_id) VALUES ('AMD Ryzen 7', 2);

INSERT INTO GPU (gpu_model, computer_id) VALUES ('Nvidia GeForce GTX 1660', 1);
INSERT INTO GPU (gpu_model, computer_id) VALUES ('AMD Radeon RX 5700', 2);

INSERT INTO Memory (memory_type, memory_capacity, computer_id) VALUES ('DDR4', 16, 1);
INSERT INTO Memory (memory_type, memory_capacity, computer_id) VALUES ('DDR4', 32, 2);

INSERT INTO Motherboard (motherboard_model) VALUES ('ASUS ROG Strix Z390');
INSERT INTO Motherboard (motherboard_model) VALUES ('MSI B450 TOMAHAWK');

INSERT INTO PowerSupply (power_supply_model) VALUES ('Corsair RM750');
INSERT INTO PowerSupply (power_supply_model) VALUES ('EVGA Supernova 650 G5');

INSERT INTO Storage (storage_type, storage_capacity, computer_id) VALUES ('SSD', 500, 1);
INSERT INTO Storage (storage_type, storage_capacity, computer_id) VALUES ('HDD', 1000, 2);

UPDATE GPU SET gpu_model = 'Nvidia GeForce RTX 3080' WHERE computer_id = 1;
UPDATE GPU SET gpu_model = 'AMD Radeon RX 5700' WHERE computer_id = 2;
UPDATE CPU SET cpu_model = 'Intel Core i7' WHERE cpu_id = 1;
UPDATE Memory SET memory_capacity = 64 WHERE memory_id = 2;
UPDATE Motherboard SET motherboard_model = 'ASUS ROG Strix Z590-E' WHERE motherboard_id = 1;
UPDATE PowerSupply SET power_supply_model = 'Corsair RM850x' WHERE power_supply_id = 2;
UPDATE Storage SET storage_capacity = 2000 WHERE storage_id = 2;
