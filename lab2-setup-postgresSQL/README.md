
## Execute POstgreSQL through docker container
```
docker run -d \
  --name postgres-container \
  -e POSTGRES_USER=neossoftware \
  -e POSTGRES_PASSWORD=neosdiscom \
  -e POSTGRES_DB=cine \
  -p 5432:5432 \
  postgres:15
```

## DOwnload Client
https://tableplus.com/download/


```
CREATE TABLE customer (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    lastname VARCHAR(200) NOT NULL,
    phone VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create an index for better performance on searches
CREATE INDEX idx_customer_name ON customer(name);
CREATE INDEX idx_customer_lastname ON customer(lastname);

-- Insert some sample customers
INSERT INTO customer (name, lastname, phone) VALUES
('John', 'Doe', '+1234567890'),
('Jane', 'Smith', '+0987654321'),
('Bob', 'Johnson', NULL);

-- Verify the data
SELECT * FROM customer;
```