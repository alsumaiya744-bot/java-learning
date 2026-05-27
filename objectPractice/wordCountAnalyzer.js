const prompt=require("prompt-sync")();
let sentence=prompt("Enter a sentence: ");
let sentenceProperty={
    totalCharacters:sentence.length,
    totalWords:sentence.split(" ").length,
    lowercaseSentence:sentence.toLowerCase(),
};
console.log(sentenceProperty);