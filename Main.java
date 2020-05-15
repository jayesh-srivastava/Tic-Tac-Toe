package tictactoe;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] a = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        Main ob=new Main();
        ob.printing(a);
        ob.entering(a);
        ob.checkresult(a);
    }
    public void printing(char[][] a) {
        int c = 0;
        System.out.print("---------\n| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            if (c < 2) {
                System.out.print("|\n| ");
                c++;
            }
        }
        System.out.print("|\n---------\n");
    }
    int turn=1;
    public void entering(char[][] a) {
            int f = 0;
            while (f == 0) {
                System.out.print("Enter the coordinates: ");
                String str4 = scan.nextLine();
                char d = str4.charAt(0);
                char e = str4.charAt(2);
                char symbol = ' ';
                turn = 1;
                if (turn % 2 != 0)
                    symbol = 'X';
                else
                    symbol = 'O';
                if (d == '1' && e == '3') {
                    if (a[0][0] == ' ') {
                        a[0][0] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '2' && e == '3') {
                    if (a[0][1] == ' ') {
                        a[0][1] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '3' && e == '3') {
                    if (a[0][2] == ' ') {
                        a[0][2] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '1' && e == '2') {
                    if (a[1][0] == ' ') {
                        a[1][0] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '2' && e == '2') {
                    if (a[1][1] == ' ') {
                        a[1][1] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '3' && e == '2') {
                    if (a[1][2] == ' ') {
                        a[1][2] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '1' && e == '1') {
                    if (a[2][0] == ' ') {
                        a[2][0] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '2' && e == '1') {
                    if (a[2][1] == ' ') {
                        a[2][1] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d == '3' && e == '1') {
                    if (a[2][2] == ' ') {
                        a[2][2] = symbol;
                        f++;
                        turn++;
                        printing(a);
                    } else {
                        System.out.print("This cell is occupied! Choose another one!\n");
                    }
                } else if (d > 3 || d < 1 || e > 3 || e < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    System.out.print("You should enter numbers!\n");
                }
            }
            if(!(this.checkresult(a)))
                entering(a);

    }
    public boolean checkresult(char[][] a) {
        boolean result=false;
        if (a[0][0] == 'X' && a[0][1] == 'X' && a[0][2] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[1][0] == 'X' && a[1][1] == 'X' && a[1][2] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[2][0] == 'X' && a[2][1] == 'X' && a[2][2] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[0][0] == 'X' && a[1][0] == 'X' && a[2][0] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[0][1] == 'X' && a[1][1] == 'X' && a[2][1] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[0][2] == 'X' && a[1][2] == 'X' && a[2][2] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[0][0] == 'X' && a[1][1] == 'X' && a[2][2] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[0][2] == 'X' && a[1][1] == 'X' && a[2][0] == 'X') {
            System.out.print("X wins");
            result=true;
        }
        else if (a[0][0] == 'O' && a[0][1] == 'O' && a[0][2] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (a[1][0] == 'O' && a[1][1] == 'O' && a[1][2] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (a[2][0] == 'O' && a[2][1] == 'O' && a[2][2] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (a[0][0] == 'O' && a[1][0] == 'O' && a[2][0] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (a[0][1] == 'O' && a[1][1] == 'O' && a[2][1] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (a[0][2] == 'O' && a[1][2] == 'O' && a[2][2] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (a[0][0] == 'O' && a[1][1] == 'O' && a[2][2] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (a[0][2] == 'O' && a[1][1] == 'O' && a[2][0] == 'O') {
            System.out.print("O wins");
            result=true;
        }
        else if (turn==9) {
            System.out.print("Draw");
            result=true;
        }
        else {
        }
        return result;

    }
}