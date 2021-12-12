package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class CheckAlphabetVowelOrConsonant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter aplphabet to Check Whether it is Vowel or Consonant : ");
		String alphabet = input.nextLine();
		String a = "a";
		String A = "A";
		String e = "e";
		String E = "E";
		String i = "i";
		String I = "I";
		String o = "o";
		String O = "O";
		String u = "u";
		String U = "U";
		if(alphabet.equals(a) || alphabet.equals(A)|| alphabet.equals(e) || alphabet.equals(E) || alphabet.equals(i) || alphabet.equals(I) || alphabet.equals(o) || alphabet.equals(O) || alphabet.equals(u) || alphabet.equals(U)) { 
			System.out.println("alphabet " + alphabet + " is Vovel");
		
			}
		else {
			System.out.println("alphabet " + alphabet + " is Consonant");
		}

	}
}
