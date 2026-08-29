const readline = require("readline");
const crypto = require("crypto");
const rl = readline.createInterface({
 input: process.stdin,
 output: process.stdout,
});
const menu = `
1. Convert text to Uppercase.
2. Calculate factorial of a number.
3. Generate random password.
4. Exit.
`;
const convertToUppercase = (text) => {
 return text.toUpperCase();
};
const calculateFactorial = (num) => {
 let result = 1;
 for (let i = 2; i <= num; i++) {
 result *= i;
 }
 return result;
};
const generateRandomPassword = (length) => {
 const characters =
'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
 let password = '';
 for (let i = 0; i < length; i++) {
 password += characters.charAt(Math.floor(Math.random() * characters.length));
 }
 return password;
};
const main = () => {
 console.log(menu);
 rl.question("Enter Your Choice (1/2/3/4): ", (answer) => {
 switch (answer) {
 case "1":
 rl.question("Enter text to convert to uppercase: ", (text) => {
 console.log(convertToUppercase(text));
 main();
 });
 break;
 case "2":
 rl.question("Enter a number to calculate factorial: ", (num) => {
 console.log(calculateFactorial(parseInt(num)));
 main();
 });
 break;
 case "3":
 rl.question("Enter password length: ", (length) => {
 console.log(generateRandomPassword(parseInt(length)));
 main();
 });
 break;
 case "4":
 console.log("Goodbye!");
 process.exit(0);
 break;
 default:
 console.log("Invalid choice, please try again.");
 main();
 }
 });
};

main();
