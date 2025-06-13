

# Java Learning – Common Mistakes & Solutions

## ✅ Mistake 1: **Missing 'f' after `float` value**

### 💡 Explanation:

In Java, **decimal values are treated as `double` by default**. To assign a decimal value to a `float` variable, you **must add `f` or `F`** at the end. Otherwise, you get a **"possible lossy conversion from double to float"** error.

### ❌ Incorrect:

```java
float sgpa = 8.45; // Error: possible lossy conversion from double to float
System.out.println("Float: " + sgpa);
```

### ✅ Correct:

```java
float CGPA = 9.78f;
System.out.println("Float: " + CGPA);
```

---

## ✅ Mistake 2: **Calling a non-static method from a static method**

### 💡 Explanation:

In Java, the `main()` method is **static**, so it belongs to the class, not any instance of the class. You **cannot directly call non-static methods** from a static method without creating an object.

### ❌ Incorrect:

```java
class Main {
    public static void main(String[] args) {
        isPresentNow(true); // Error: non-static method cannot be referenced from a static context
    }

    void isPresentNow(boolean p) {
        // code
    }
}
```

### ✅ Correct Solution 1: Make the method static

```java
class Main {
    public static void main(String[] args) {
        isPresentNow(true); // Now this works
    }

    static void isPresentNow(boolean p) {
        // code
    }
}
```

### ✅ Correct Solution 2: Create an object to call non-static method

```java
class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.isPresentNow(true); // Works fine
    }

    void isPresentNow(boolean p) {
        // code
    }
}
```

---

## 📌 Notes:

* Use `float` only when precision is less critical (e.g., graphics, memory-constrained environments).
* For accurate mathematical operations, prefer `double`.
* Always check if a method is `static` or not when calling from `main()`.

---
Sure! Here's a well-structured explanation in the same Markdown style as your previous entries, focusing on the **input skip bug with `Scanner` in Java**:

---

## ✅ Mistake 3: **Using `nextInt()` before `nextLine()` without consuming leftover newline**

#### 💡 Explanation:

In Java, methods like `nextInt()`, `nextDouble()`, and `next()` **do not consume the newline character (`\n`)** left in the input buffer when the user presses Enter.
So, if you call `nextLine()` immediately afterward, it **reads that leftover newline**, causing the next input prompt to be **skipped**.

#### ❌ Incorrect:

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // leaves '\n' in the buffer

        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine(); // skipped due to leftover '\n'

        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}
```

#### 🧨 Problem:

When entering input (Terminal) :

```
Enter your age: 25
Enter your favorite color: Color: 
```

The program skips the color input!

---

#### ✅ Correct:

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine(); // now works as expected

        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}
```

#### 🟢 Output Example (Terminal):

```
Enter your age: 25
Enter your favorite color: Blue
Age: 25
Color: Blue
```

---

Let me know if
