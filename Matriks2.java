/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraymatriks;

/**
 *
 * @author AZZAHRA
 */
public class Matriks2 {
    public static void main(String[] args) {
        int matriksA[][]={{3,2},{-4,1}};
        int matriksB[][]={{8,4},{5,2}};
        
        System.out.println("3A+B");
        for(int i = 0; i <matriksA.length; i++) {
            for(int j = 0; j <matriksA[i].length; j++) {
                System.out.print((matriksA[i][j]*3)+matriksB[i][j]+", ");
                
            }
            System.out.println();
        }
        
    }
}
