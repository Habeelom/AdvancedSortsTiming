# Sorting Algorithms Implementation

A Java program that implements and compares the performance of three popular sorting algorithms (QuickSort, MergeSort, and HeapSort) by testing them on different input data patterns.

## About The Project

This project demonstrates the implementation and performance comparison of three fundamental advanced sorting algorithms:
- QuickSort
- MergeSort 
- HeapSort

Each algorithm is tested against three different input patterns:
- Ascending sequences
- Descending sequences
- Random sequences

## Built With

- Java
- File I/O operations
- System.currentTimeMillis() for performance measurement

## Getting Started
- Three input files:
  - dataAscend.txt
  - dataDescend.txt  
  - dataRandom.txt
    
## Usage

1. Run the program
2. Enter output filenames when prompted for each algorithm:
   - QuickSort outputs
   - MergeSort outputs
   - HeapSort outputs
3. The program will:
   - Read input data
   - Sort using each algorithm
   - Output sorted arrays to files
   - Display execution times

## Implementation Details

### QuickSort
- Uses recursive implementation
- Pivot selection from rightmost element
- Partitioning with two pointers approach

### MergeSort
- Recursive divide-and-conquer approach
- Uses auxiliary workspace array
- Merges sorted subarrays

### HeapSort
- Builds max heap
- In-place sorting
- Heap property maintenance through heapify down

## Performance

The program measures and displays execution times for:
- Each algorithm (QuickSort, MergeSort, HeapSort)
- Each input pattern (Ascending, Descending, Random)

## Features

- Handles large datasets (default 10,000 elements)
- File-based I/O operations
- Performance timing
- Error handling for file operations

## Optimizations

- In-place sorting where possible
- Efficient memory management
- Reusable auxiliary arrays
- Robust error handling

## Lessons Learned

- Algorithm implementation strategies
- Performance analysis techniques
- File I/O best practices
- Time complexity practical implications
- Error handling patterns
