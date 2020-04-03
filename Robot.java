import java.util.Scanner;
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot
{
    public static void main(String[] args){
        double speed = 10;
        String color;
        Scanner scanner = new Scanner(System.in);
        
        //robot = RobotWalk();
    }

    public static void RobotWalk(String color, double speed)
    {
       if(color == "green")
           System.out.println("동작을 멈춥니다.");
       else if(color == "yellow")
           System.out.println("보행속도를 " + speed*1.2 + "km/h로 걷습니다.");
       else
           System.out.println("동작을 멈춥니다.");
    }
}

