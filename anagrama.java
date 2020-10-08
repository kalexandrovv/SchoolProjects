package paki4;

import java.util.Scanner;

public class anagrama {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner skener = new Scanner(System.in);
Integer[] usage = new Integer[26];
for(int a=0; a<26; a++) {
usage[a]=0;
}
String pyrwaduma,wtoraduma;
System.out.println("Enter the first word:");
pyrwaduma=skener.nextLine();
System.out.println("Enter the second word:");
wtoraduma=skener.nextLine();
for(int a=0; a<pyrwaduma.length(); a++) {
if(pyrwaduma.charAt(a)>='a' && pyrwaduma.charAt(a)<='z') {
usage[(pyrwaduma.charAt(a)-'a')]++;
}
}
for(int a=0; a<wtoraduma.length(); a++) {
if(wtoraduma.charAt(a)>='a' && wtoraduma.charAt(a)<='z') {
usage[(wtoraduma.charAt(a)-'a')]--;
}
}
boolean anagram=true;
for(int a=0; a<26; a++) {
if(usage[a]==0) {
continue;
} else {
anagram=false;
System.out.println("Ne e anagrama.");
break;
}
}
if(anagram) {
System.out.println("Anagrama e!");
}
//skener.close();
}

}

