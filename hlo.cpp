// Include the iostream library to print output
#include <iostream>

// Include the string library to use strings
#include <string>

// Use the std namespace
using namespace std;

// Define a function named giftDistribution that takes four parameters: 
// n: the number of kids in the group
// names: an array of strings containing the names of the kids
// g: the total number of gifts that Santa Claus has
// firstTwo: an array of strings containing the names of the initial two kids who received the gift
void giftDistribution(int n, string names[], int g, string firstTwo[]) {

  // Create an array of integers to store the number of gifts received by each kid
  int gifts[n];

  // Initialize the array with zero
  for (int i = 0; i < n; i++) {
    gifts[i] = 0;
  }

  // Find the index of the first kid who received the gift in the names array
  int firstIndex = -1;
  for (int i = 0; i < n; i++) {
    if (names[i] == firstTwo[0]) {
      firstIndex = i;
      break;
    }
  }

  // Find the index of the second kid who received the gift in the names array
  int secondIndex = -1;
  for (int i = 0; i < n; i++) {
    if (names[i] == firstTwo[1]) {
      secondIndex = i;
      break;
    }
  }

  // Determine the direction of gift distribution based on the indices of the first and second kid
  string direction;
  if ((firstIndex + 1) % n == secondIndex) {
    direction = "Clockwise";
  } else {
    direction = "Anti-Clockwise";
  }

  // Print the direction of gift distribution
  cout << direction << endl;

  // Distribute the gifts according to the direction and skipping the immediate next person
  int currentIndex = secondIndex;
  int giftCount = 2;
  
   // Increment the gift count for the first and second kid who received the gift
   gifts[firstIndex]++;
   gifts[secondIndex]++;

   while (giftCount < g) {
     // Find the next index to distribute the gift based on the direction and skipping logic
     if (direction == "Clockwise") {
       currentIndex = (currentIndex + 2) % n;
     } else {
       currentIndex = (currentIndex - 2 + n) % n;
     }

     // Increment the gift count for the current kid who received the gift
     gifts[currentIndex]++;
     giftCount++;
   }

   // Find the maximum number of gifts received by any kid
   int maxGifts = 0;
   for (int i = 0; i < n; i++) {
     if (gifts[i] > maxGifts) {
       maxGifts = gifts[i];
     }
   }

   // Print the names of the kids who received the highest number of gifts along with a hyphen and 
   //the gift count, separated by commas
   bool firstPrinted = false;
   for (int i = 0; i < n; i++) {
     if (gifts[i] == maxGifts) {
       if (firstPrinted) {
         cout << ", ";
       }
       cout << names[i] << "-" << maxGifts;
       firstPrinted = true;
     }
   }
   cout << endl;

   // Find and print the name of the kid who receives 
   //the gift that comes before the last gift

   if (direction == "Clockwise") {
     currentIndex = (currentIndex - 2 + n) % n;
   } else {
     currentIndex = (currentIndex + 2) % n;
   }
   cout << names[currentIndex] << endl;
}