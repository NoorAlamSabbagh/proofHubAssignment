//6. Write a program to find the number of times, the character "a" is repeated and its index
// position in the following paragraph:

var paragraph = "The short story is usually concerned with a single effect conveyed in only one or a few significant episodes or scenes. The form encourages economy of setting, concise narrative, and the omission of a complex plot; character is disclosed in action and dramatic encounter but is seldom fully developed.";

var count = 0;
var indices = [];

for (var i = 0; i < paragraph.length; i++) {
  if (paragraph[i] === "a") {
    count++;
    indices.push(i);
  }
}
console.log("The character 'a' appears " + count + " times at the following indices: " + indices.join(", "));