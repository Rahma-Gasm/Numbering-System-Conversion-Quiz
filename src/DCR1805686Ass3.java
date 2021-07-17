
import java.text.DecimalFormat;
import java.util.Scanner;

public class DCR1805686Ass3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String detailed_result = "";//to store detailed result
        int random, trials = 0;
        String result = "";
        String result_2 = "";
        int correct_answer = 0;// num of correct answer entered by user
        String swap = "";
        int number;
        int enter = 0;
        int num;
        int answer_2;
        System.out.println("\t\t\t\t ************************************************");
        System.out.println("\t\t \t\t Welcome to the Numbering System Conversion Quiz!");
        System.out.println("\t\t\t\t ************************************************");
        System.out.println("The quiz consists of 8 random question on converting between Decimal, Binary, and Hexadecimal"
                + "numbers. You have a maximum \nnumber of 3 trials per question.");
        System.out.println("");
        System.out.print("Please enter 1 to start the quiz or 0 to exit:");
        num = input.nextInt();
        while (num == 0) {
            System.exit(0);
        }
        while (num == 1) {
            long start = System.nanoTime();//to calculate the time it takes for quiz
            for (int i = 0; i < 2; i++)//to show two question convert from decimal to hexadecimal
            {
                result = "";
                number = (int) (Math.random() * 256);// to generate random number
                random = number;//switch between value
                do {
                    int hexa = random % 16;
                    if (hexa >= 10) {
                        result += (char) (hexa + 55);
                    } else {
                        result += hexa;
                    }
                    random = random / 16;
                } while (random > 0);
                result_2 = "";
                for (int hexa_num = result.length() - 1; hexa_num >= 0; hexa_num--) {
                    result_2 += result.charAt(hexa_num);
                }
                result = result_2;
                trials = 0;
                while (true) {
                    trials++;
                    System.out.println("");
                    System.out.print("Please enter the equivalent Hexadecimal number of " + number + ":");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase(result)) {
                        System.out.println("");
                        System.out.println("\tCorrect Answer!");
                        detailed_result += ("the equivalent Hexadecimal number of " + number + "is" + answer + ":correct\n");
                        correct_answer += 2;
                        break;
                    } else if (!answer.equalsIgnoreCase(result) && trials < 3) {
                        if (trials == 1) {
                            swap = answer;
                        }
                        System.out.print("\tWrong Answer!");
                        System.out.println("");
                        continue;
                    } else {
                        System.out.println("\t Sorry, you have exceeded the maximum number of trials for this question!\n");
                        detailed_result += "the equivalent Hexadecimal number of " + number + "is" + swap + ":wrong\n";
                        System.out.println("");
                        break;
                    }
                }

            }
            for (int i = 0; i < 2; i++) {
                result = "";
                number = (int) (Math.random() * 256);
                random = number;
                do {
                    int hexa = random % 2;
                    result += hexa;
                    random = random / 2;

                } while (random > 0);
                result_2 = "";
                for (int binary_num = result.length() - 1; binary_num >= 0; binary_num--) {
                    result_2 += result.charAt(binary_num);
                }
                result = result_2;
                trials = 0;
                while (true) {
                    trials++;
                    System.out.println("");
                    System.out.print("Please enter the equivalent Binary number of " + number + ":");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase(result)) {
                        System.out.println("");
                        System.out.println("\tCorrect Answer!");
                        detailed_result += "the equivalent Binary number of " + number + " is" + answer+ ":correct\n";
                        correct_answer += 2;
                        break;
                    } else if (!answer.equalsIgnoreCase(result) && trials != 3) {
                        if (trials == 1) {
                            swap = answer;
                        }
                        System.out.println("");
                        System.out.println("\tWrong Answer!");
                        System.out.println("");
                        continue;
                    } else {
                        System.out.println("");
                        System.out.println("\tSorry, you have exceededthe maximum number of trials for this question!");
                        System.out.println("");
                        detailed_result += ("the equivalent Binary number of" + number + "is" + swap + ":wrong");
                        System.out.println("");
                        break;
                    }
                }
            }
            for (int i = 0; i < 2; i++) {
                number = (int) (Math.random() * 256);
                result = "";
                random = number;
                do {
                    int hexa = random % 16;
                    if (hexa > 10) {
                        result += (char) (hexa + 55);
                    } else {
                        result += hexa;
                    }
                    random = random / 16;
                } while (random > 0);
                result_2 = "";
                for (int decimal_num = result.length() - 1; decimal_num >= 0; decimal_num--) {
                    result_2 += result.charAt(decimal_num);
                }
                result = result_2;
                trials = 0;
                while (true) {
                    trials++;
                    System.out.println("");
                    System.out.print("Please enter the equivalent Decimal number of " + result + ":");
                    answer_2 = input.nextInt();
                    if (answer_2 == number) {
                        System.out.println("");
                        System.out.println("\tCorrect Answer!");
                        System.out.println("");
                        detailed_result += ("the equivalent Decimal number of result" + "is" + answer_2 + ":correct\n");
                        correct_answer+= 2;
                        break;
                    } else if (answer_2 != number && trials != 3) {
                        if (trials == 1) 
                            enter = answer_2;
                        System.out.println("");
                        System.out.println("\tWrong Answer!");
                        System.out.println("");
                        continue;
                        
                       
                    } else {
                        System.out.println("");
                        System.out.println("Sorry,you have exceeded the maximum number of trials for this question!");
                        System.out.println("");
                        detailed_result += ("the equivalent Decimal number of " + result + "is" + enter + ":wrong\n");
                        break;
                    }
                }
            }
            for (int i = 0; i < 0; i++) {
                number = (int) (Math.random() * 256);
                result = "";
                random = number;
               int m=0;
               int l;
               for(int n=0;n<=7;n++){
                   l=(2^n);
                   if(number%(10^(n+1))==(10^n)){
                       m=m+1;
                       number=number-(10^n);
                       result="";
                   }
               }
                trials = 0;
                while (true) {
                    trials++;
                    System.out.println("");
                    System.out.print("Please enter the equivalent Decimal number of " + result + ":");
                    answer_2 = input.nextInt();
                    if (answer_2 == number) {
                        System.out.println("");
                        System.out.println("Correct Answer!");                       
                        System.out.println("");
                        detailed_result += ("the equivalent Decimal number of" + result + "is" + answer_2 + ":correct\n");
                        correct_answer += 2;
                        break;
                    } else if (answer_2 != number && trials != 3) {
                        if (trials == 1) 
                            enter = answer_2;
                        System.out.println("");
                        System.out.println("Wrong Answer!");
                        System.out.println("");
                        continue;

                    } else {
                        System.out.println("");
                        System.out.println("Sorry, you have exceeded the maximum number of trials for this question!");
                        System.out.println("");
                        detailed_result+= ("the equivalent Decimal number of" + result + "is" + enter + ":wrong\n");
                        break;
                    }
                }
            }
            long time = System.nanoTime() - start;
            DecimalFormat df = new DecimalFormat("0.0");
            long s;
            double m;
            s = time / 1000000000;
            m = s / 60;
            s %= 60;
            String test = new String();
            test += s;
            m += Double.parseDouble(test) / 60;
            test += s;
            m += Double.parseDouble(test) / 60;
            test = "";
            test += correct_answer;
            double sco = Double.parseDouble(test) * 100 / 16;
            System.out.println("");
            System.out.println("\t\t*******************************************");
            System.out.println("\t\tTime taken to complete the quiz:" + df.format(m) + " minutes");
            System.out.println("\t\tScore is:" + df.format(sco) + "%");
            if (sco >= 60.0) {
                System.out.println("\t\tCongratulations, you have passed!");
                System.out.println("\t\t******************************************");
            } else {
                System.out.println("\t\tYou didn't pass the quiz!");
                System.out.println("\t\t******************************************");
            }
            System.out.println("");
            System.out.println("Detailed Result:");
            System.out.println("--------------------------");
            System.out.println("");
            System.out.println(detailed_result);
            System.out.println("");
            System.out.print("Please enter 1 to start the quiz or 0 to exit:");
            int start_ = input.nextInt();
            if (start_ == 0) {
                System.exit(0);
            }else{
                return;
            }
            test = "";
            num = input.nextInt();
        }
        System.out.println("");
        System.out.println("\t*** Thank you for using this Application ***");

    }

}
