package cap_7;
// PROGRAMA AYUDA DE OPERACIONES BASICAS CON DOS TERMINOS
// Elaborado por: Sergio F. Pradilla 

import java.util.Scanner;

public class a_ayuda {
    
    // Declarar variables
    static int num1, num2, resulNi, resulMaq, opcion;
    static char desea;
    static String entradaChar;


    public static void main(String[] args) {
        // crear objetos para la entrada de datos
        Scanner entrada = new Scanner(System.in);

        do 
        {
            System.out.println("---------------------------");
            System.out.println("|    TE PUEDO AYUDAR A:    |");
            System.out.println("----------------------------");
            System.out.println("|   1.-  SUMAR             |");
            System.out.println("|   2.-  RESTAR            |");
            System.out.println("|   3.-  MULTIPLICAR       |");
            System.out.println("|   4.-  DIVIDIR           |");
            System.out.println("|   5.-  FIN               |");
            System.out.println("|--------------------------|");
            System.out.print("   ESCOGER OPCION: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    ayudaSumar();
                    break;
                case 2:
                    ayudaRestar();
                    break;
                case 3:
                    ayudaMultiplicar();
                    break;
                case 4:
                    ayudaDividir();
                    break;
                default:
                    break;
            }
        }while ( opcion != 5);
        entrada.close();
    }// fin del main

    public static void ayudaSumar() 
    {
        //crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------------");
        do {
                System.out.println("----- AYUDANDO A SUMAR -------");
                System.out.print("Teclee primer numero: ");
                num1 = entrada.nextInt();

                System.out.print("\nTeclee segundo numero: ");
                num2 = entrada.nextInt();
                System.out.println("                -------------  +");

                System.out.print("\n    Teclee su suma: ");
                resulNi = entrada.nextInt();

                resulMaq = num1 + num2;

                if (resulNi == resulMaq) {
                    System.out.print("\n La suma es correcta");
                    System.out.println(resulMaq);
                } else {
                    System.out.print("\n      La suma es incorrecta");
                    System.out.println(", el resulrado correcto es: " + resulMaq);
                }
                System.out.print("\nDesea revisar otra suma(S/N): ");
                entradaChar = entrada.next();
                desea = entradaChar.charAt(0);
                entrada.nextLine();
                //entrada.close();

        } while (desea == 'S' || desea =='s');
    } //fin metodo

    public static void ayudaRestar() 
    {
        //crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------------");
        do {
                System.out.println("----- AYUDANDO A RESTAR -------");
                System.out.print("Teclee primer numero: ");
                num1 = entrada.nextInt();

                System.out.print("Teclee segundo numero: ");
                num2 = entrada.nextInt();
                System.out.println("                -------------  +");

                System.out.print("    Teclee su resta: ");
                resulNi = entrada.nextInt();

                resulMaq = num1 - num2;

                if (resulNi == resulMaq) {
                    System.out.print("\n La resta es correcta");
                } else {
                    System.out.print("\n La resta es incorrecta");
                }
                System.out.print("\nDesea revisar otra resta(S/N)");
                entradaChar = entrada.next();
                desea = entradaChar.charAt(0);
                entrada.nextLine();
                //entrada.close();

        } while (desea == 'S' || desea =='s');
    }
    
    public static void ayudaMultiplicar() 
    {
        //crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------------");
        do {
                System.out.println("----- AYUDANDO A MULTIPLICAR -------");
                System.out.print("Teclee primer numero: ");
                num1 = entrada.nextInt();

                System.out.print("Teclee segundo numero: ");
                num2 = entrada.nextInt();
                System.out.println("                -------------  +");

                System.out.print("    Teclee su Multiplicacion: ");
                resulNi = entrada.nextInt();

                resulMaq = num1 * num2;

                if (resulNi == resulMaq) {
                    System.out.print("\n         La multiplicacion es correcta");
                } else {
                    System.out.print("\n         La multiplicacion es incorrecta");
                }
                System.out.print("\nDesea revisar otra Multiplicacion (S/N)");
                entradaChar = entrada.next();
                desea = entradaChar.charAt(0);
                entrada.nextLine();
                //entrada.close();

        } while (desea == 'S' || desea =='s');
    } //fin metodo
    
    public static void ayudaDividir() 
    {
        //crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------------");
        do {
                System.out.println("----- AYUDANDO A DIVIDIR -------");
                System.out.print("Teclee primer numero: ");
                num1 = entrada.nextInt();

                System.out.print("Teclee segundo numero: ");
                num2 = entrada.nextInt();
                System.out.println("                -------------  +");

                System.out.print("    Teclee su division: ");
                resulNi = entrada.nextInt();

                resulMaq = num1 / num2;

                if (resulNi == resulMaq) {
                    System.out.print("\n        La division es correcta");
                } else {
                    System.out.print("\n        La division es incorrecta");
                }
                System.out.print("\nDesea revisar otra division(S/N)");
                entradaChar = entrada.next();
                desea = entradaChar.charAt(0);
                entrada.nextLine();
                //entrada.close();
        } while (desea == 'S' || desea =='s');
        entrada.close();
    } //fin metodo

    
}
