# DSA Mastery

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)](LICENSE) [![Java](https://img.shields.io/badge/Java-8%2B-orange?style=flat-square)](https://www.oracle.com/java/) [![Last commit](https://img.shields.io/github/last-commit/Suresh-Thakur206/DSA_mastery?style=flat-square)](https://github.com/Suresh-Thakur206/DSA_mastery) [![Issues](https://img.shields.io/github/issues/Suresh-Thakur206/DSA_mastery?style=flat-square)](https://github.com/Suresh-Thakur206/DSA_mastery/issues)

A curated collection of Data Structures & Algorithms (DSA) implementations and practice problems in Java. This repository is aimed at learners and interview-prep candidates who want clear, working examples of common algorithmic problems organized by topic and difficulty.

---

## Table of Contents

- [Features](#features)
- [Folder structure](#folder-structure)
- [Getting started](#getting-started)
- [Compile & run examples (quick)](#compile--run-examples-quick)
- [Code example](#code-example)
- [How to use the examples](#how-to-use-the-examples)
- [Contributing](#contributing)
- [License](#license)
- [Author / Contact](#author--contact)

---

## Features

- Clean, focused Java implementations of classic DSA problems.
- Multiple approaches for many problems (brute-force and optimized variants).
- Problems organized by topic and difficulty for easy navigation.
- Small, runnable examples with `main` methods for quick testing.

## Folder structure

Top-level source layout (under `src/`):

- `Array/` — array problems and binary-search variations.
- `BinarySearch/` — pure binary search problems and rotated array tasks.
- `linkedList/` — singly and doubly linked list problems and utilities.
- `TwoPointer/` — two-pointer technique problems (merge, move-zeroes, etc.).
- `recursion/` — recursion-based problems and examples.
- `string/` — string manipulation and pattern problems.
- `test/` — small experiments and learning snippets.
- `tutorial/` — bite-sized tutorials on Java collections and fundamentals.
- `src/Main.java` — a simple entry point that can be used to run or wire test cases.

Each folder contains individual `.java` files where filenames indicate the problem or technique used.

## Getting started

Prerequisites

- Java JDK 8 or later installed and `java`/`javac` available on your PATH.
- Recommended: an IDE such as IntelliJ IDEA or VS Code (Java extension) for easy navigation and running.

Local setup (recommended)

1. Clone the repository:

```powershell
git clone https://github.com/Suresh-Thakur206/DSA_mastery.git
cd "DSA Mastery"
```

2. Open the folder in your IDE and use the IDE to build and run individual classes.

## Compile & run examples (quick)

Compile a single example (e.g., the `Main` class):

```powershell
javac -d out src\Main.java
java -cp out Main
```

Compile a specific file and run it (example: `src/Array/TwoSum.java` if present):

```powershell
javac -d out src\Array\TwoSum.java
java -cp out Array.TwoSum
```

Notes

- Many files include `main` methods — compile and run that class directly.
- For compiling many files or the entire `src` tree, prefer an IDE or add a build tool (Gradle/Maven). I can add a simple Gradle wrapper if you'd like.

## Code example

Here is a small, self-contained Java example (Two-sum style) to show style and how to run a single file.

```java
// src/Array/TwoSumExample.java
package Array;

import java.util.HashMap;

public class TwoSumExample {
	// Find indices of two numbers that add up to target (returns first found)
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int need = target - nums[i];
			if (map.containsKey(need)) {
				return new int[]{map.get(need), i};
			}
			map.put(nums[i], i);
		}
		return new int[]{-1, -1};
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] res = twoSum(nums, target);
		System.out.println("Indices: " + res[0] + ", " + res[1]);
	}
}
```

To compile and run this example from the repo root:

```powershell
javac -d out src\Array\TwoSumExample.java
java -cp out Array.TwoSumExample
```

## How to use the examples

- Browse `src/` for a topic or problem name.
- Open the `.java` file and read the inline comments for complexity/notes.
- Run the file's `main` method to see output for sample inputs.
- Modify inputs or add driver code in `src/Main.java` to exercise multiple examples.

## Contributing

Contributions are welcome — PRs should include:

1. A clear problem filename and a short header comment describing the approach and time/space complexity.
2. Small, focused changes per PR.
3. Optional: a sample input and expected output in comments or a brief test harness.

Suggested workflow:

```text
Fork -> Branch (feat/xyz) -> Commit -> Open PR with description and tests/examples
```

I can add a `CONTRIBUTING.md` with a checklist and formatting rules if you'd like.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

## Author / Contact

Maintained by Suresh Thakur (GitHub: `Suresh-Thakur206`).

