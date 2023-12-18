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

UPDATE GPU SET gpu_model = 'Nvidia GeForce RTX 3080' WHERE computer_id = 1;
UPDATE CPU SET cpu_model = 'Intel Core i7' WHERE cpu_id = 1;
UPDATE Memory SET memory_capacity = 64 WHERE memory_id = 2;
UPDATE Motherboard SET motherboard_model = 'ASUS ROG Strix Z590-E' WHERE motherboard_id = 1;
