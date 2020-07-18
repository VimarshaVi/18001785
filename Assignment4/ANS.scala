object CeasarCipher extends App{

	
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	val inputText = scala.io.StdIn.readLine("Secret Message: ")

	val outputText = inputText.map( (c: Char) => { 

	val x = alphabet.indexOf(c.toUpper)

	if (x == -1){
		c
	}
	else{
		alphabet((x + shift) % alphabet.size)
	} 
	});

	
	println(outputText);


val alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val sh = ((-shift).toInt + alpha.size) % alpha.size

	val output = outputText.map( (a: Char) => { 

	val y = alpha.indexOf(a.toUpper)

	if (y == -1){
		a
	}
	else{
		alpha((y + sh) % alpha.size)
	} 
	});

	
	println(output);
}