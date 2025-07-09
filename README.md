# 🛒 Fawry Quantum Internship Challenge 3

This is a solution for the **Fawry Rise Full Stack Internship Challenge 3**, which requires building a simple e-commerce system using Java.

---

## 🚀 Features

- Add different types of products (perishable, shippable, etc).
- Add items to cart (with quantity checks).
- Checkout process that includes:
  - Subtotal calculation
  - Shipping cost
  - Final amount deduction from customer balance
  - Shipment notice with weight details
- Error handling (out of stock, expired, empty cart, insufficient balance)

---

## 🧾 Classes Overview

### ✅ `Product.java`

Represents a product in the store.

| Variable         | Type      | Description                           |
|------------------|-----------|---------------------------------------|
| `name`           | `String`  | Name of the product                   |
| `price`          | `double`  | Price of one unit                     |
| `quantity`       | `int`     | Available stock quantity              |
| `isPerishable`   | `boolean` | Whether the product can expire        |
| `isShippable`    | `boolean` | Whether the product needs shipping    |
| `weight`         | `double`  | Weight of the product (if shippable)  |
| `isExpired`      | `boolean` | Manually controlled expiry state      |

---

### 👤 `Customer.java`

Represents a customer in the system.

| Variable   | Type      | Description            |
|------------|-----------|------------------------|
| `name`     | `String`  | Customer name          |
| `balance`  | `double`  | Available account balance |

---

### 🛒 `Cart.java`

Handles cart operations (adding products, validating quantities).

| Method       | Description                                 |
|--------------|---------------------------------------------|
| `add()`      | Adds product with quantity to cart          |
| `getItems()` | Returns all items in the cart               |
| `isEmpty()`  | Checks if the cart is empty                 |

---

### 📦 `ShippableItem.java`

An interface used to identify shippable products.

```java
String getName();
double getWeight();
