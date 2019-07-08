/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidade_De_Saude;

/**
 *
 * @author HeiThor
 */
public class Bairros {
    public static void main(String[] args){
    int [][] bairro = new int [7][8];
    //     x , y  >>  w       x,y(coordenadas)      e w(número de chamadas)
    //primeria linha
    bairro [0][0] = 7;
    bairro [0][1] = 5;
    bairro [0][2] = 2;
    bairro [0][3] = 5;
    bairro [0][4] = 5;
    bairro [0][5] = 5;
    bairro [0][6] = 4;
    bairro [0][7] = 5;
    //segunda linha
    bairro [1][0] = 1;
    bairro [1][1] = 4;
    bairro [1][2] = 2;
    bairro [1][3] = 8;
    bairro [1][4] = 9;
    bairro [1][5] = 1;
    bairro [1][6] = 1;
    bairro [1][7] = 8;
    //terceira linha
    bairro [2][0] = 3;
    bairro [2][1] = 5;
    bairro [2][2] = 5;
    bairro [2][3] = 1;
    bairro [2][4] = 7;
    bairro [2][5] = 2;
    bairro [2][6] = 3;
    bairro [2][7] = 9;
    //quarta linha
    bairro [3][0] = 1;
    bairro [3][1] = 8;
    bairro [3][2] = 5;
    bairro [3][3] = 6;
    bairro [3][4] = 7;
    bairro [3][5] = 5;
    bairro [3][6] = 4;
    bairro [3][7] = 2;
    //quinta linha
    bairro [4][0] = 5;
    bairro [4][1] = 8;
    bairro [4][2] = 6;
    bairro [4][3] = 5;
    bairro [4][4] = 5;
    bairro [4][5] = 4;
    bairro [4][6] = 2;
    bairro [4][7] = 9;
    //sexta linha
    bairro [5][0] = 1;
    bairro [5][1] = 6;
    bairro [5][2] = 9;
    bairro [5][3] = 3;
    bairro [5][4] = 5;
    bairro [5][5] = 5;
    bairro [5][6] = 6;
    bairro [5][7] = 4;
    //setima linha
    bairro [6][0] = 6;
    bairro [6][1] = 3;
    bairro [6][2] = 9;
    bairro [6][3] = 9;
    bairro [6][4] = 3;
    bairro [6][5] = 8;
    bairro [6][6] = 5;
    bairro [6][7] = 8;
    
    for (int i=0;i<bairro.length; i++ ){
            //System.out.println(bairro[i]+" ");
            for (int j=0; j<bairro[i].length ;j++){ //for alinhado
                System.out.print(bairro[i][j]+"  ");
            }
            System.out.println();
        }
    
    }
    
}
