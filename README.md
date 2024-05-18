# Java Stream API

This project demonstrates Stream API to perform various operations on collections, including filtering, mapping, reducing, collecting, and more.

### Creating a Stream
- **Initialize a List**: Creates a list of integers from 1 to 10.

### Intermediate Operations
- **Filter**: Filters out even numbers and prints them.
- **Map**: Maps the list of numbers to their squares and prints the squared values.
- **Combine Filtering and Mapping**: Filters out odd numbers and then maps them to their cubes.

### Terminal Operations
- **Reduce**: Sums all the numbers in the list.
- **Collect**: Gathers all even numbers into a new list.

### Advanced Stream Operations
- **FlatMap**: Flattens a list of lists into a single list.
- **GroupingBy**: Groups numbers by even and odd.

### Stream with Custom Objects
- **Person Class**: Defines a `Person` class with fields `name` and `age`.
- **Filter**: Filters out people older than 25 and prints their names.
- **Find Oldest**: Finds the oldest person in the list.
