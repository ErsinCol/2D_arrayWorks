import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // farklı sütun değerine sahip dizilere ragged array denir
        // sütun sayısını belirtmeyerek sonrasında her bir satır için ayrı ayrı sütun sayısını belirledik
        int[][] raggedArray=new int[3][];
        raggedArray[0]=new int[1];
        raggedArray[1]=new int[2];
        raggedArray[2]=new int[3];
        for(int row=0;row<raggedArray.length;row++){
            for(int col=0;col<raggedArray[row].length;col++){
                System.out.print(raggedArray[row][col]+" ");
            }
            System.out.println();
        }

        // Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
        Scanner scanner=new Scanner(System.in);
        int[][] matris=new int[3][3];
        int number;
        for(int row=0;row<matris.length;row++){
            for(int col=0;col<matris[row].length;col++){
                System.out.print((row+1) +". satır "+ (col+1) +". sütun :");
                number=scanner.nextInt();
                matris[row][col]=number;
            }
        }
        for(int row=0;row<matris.length;row++){
            for(int col=0;col<matris[row].length;col++){
                System.out.print(matris[row][col]+" ");
            }
            System.out.println();
        }

        // İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
        int[][] matris2=new int[4][4];
        for(int row=0;row<matris2.length;row++){
            for(int col=0;col<matris2[row].length;col++){
                matris2[row][col]= (int )(Math.random()*100);
            }
        }
        for(int row=0;row<matris2.length;row++){
            for(int col=0;col<matris2[row].length;col++){
                System.out.print(matris2[row][col]+" ");
            }
            System.out.println();
        }


    }
}
