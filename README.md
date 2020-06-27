## Caesar Cipher
This program was created using Java language.

## Author
Barsil Odiwuor Ochola.

### Description
This program uses a command line interface to encrypt or decrypt words using an appropriate key which is a number.
The encryption works by shifting the word characters the number of characters provided by the key e.g encrypting 'ab' by a key of 1 makes it 'bc', while decrypting returns the original value of the encrypted word.
If the word 'name' was encrypted using a key of 1 it would return 'obnf'.If I was to decrypt 'obnf' I would have to know the key that was used for its encryption, which is 1, for it to return 'name'.

## Prerequisites & setup
### Prerequisites
1.Git.
2.Java
3.Text Editor of your choice.
4.Gradle

### Set up
First clone the repo into your machine by running git clone https://github.com/BarsilNzola/Caesar-Cipher on your terminal.
run the command gradle build
navigate into the build\classes/java/main/ directory created using the command cd build\classes/java/main/.
run the command java App.

## BDD
|   example	                        |   input	                |    output     |
|-----------------------------------|:-------------------------:|--------------:|
| encrypt => word: 'barsil', key: 2 |String=>word, Integer=>key	|String:'dctukn'|
| decrypt => word: 'dctukn', key: 2	|String=>word, Integer=>key	|String:'barsil'|

## How to use
Type number '1' to encrypt.
Enter the word you would like to encrypt.
Enter a number to use as the key for the encryption.
Type number '2' to decrypt.
Type the word to be decrypted.
Enter the number to be used as the key for decryption.
To exit type number '3'.
Confirm whether you would like to exit the application by typing either '1' for yes and '2' for no.

## Known Bugs
In case of of any bugs found please contact using the information below.

## Contact Information
email - barsiljohn@gmail.com
call - +254 717304712

## Copyright and license.
(c) 2020 Barsil Odiwuor Ochola.
MIT License