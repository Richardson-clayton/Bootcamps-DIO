let alcohol = 0;
let gasoline = 0;
let diesel = 0;

while ( x ) {
  const code = Number(lines.shift());
  
  switch (code) {
    case 1:
        alcohol++
              
      break;
    case 2:
        gasoline++

      break;
    case 3:
        diesel++
  
      break;
    case 4:
        x = false
      
      break;
  }
}

console.log("MUITO OBRIGADO");
console.log("Alcool: " + alcohol);
console.log("Gasolina: " + gasoline);
console.log("Diesel: " + diesel);