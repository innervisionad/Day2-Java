package dayTwo;

import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Pyramid
{

    public static void main(String[] args)
    {

       final int height = setHeight();
        drawPyramid(height);

    }

    public static int setHeight()
    {

        System.out.println("Please enter the height of your pyramid");
        //set up scanner to look for input
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void drawPyramid( int height)
    {
        //determines the height
        for (int i = 1; i <= height; i++)
        {

            //determines space before the pyramid
            String output = "";
            for(int j = height - i; j > 0 ; j--)
            {
                output += " ";
            }

            //outputs the number and space
            for( int j = i; j >0; j-- )
            {
                output += (i + " ");
            }
            System.out.println(output);
        }
    }
}


