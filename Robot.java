import java.util.Scanner;
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot
{
    public static void RobotWalk(String color, double speed)
    {
        //System.out.print(color);
        if(color.equals("green")){
            System.out.println("속도를 유지하고 보행합니다.");
        }
        else if(color.equals("yellow")){
            System.out.println("보행속도를 " + speed*1.2 + "km/h로 걷습니다.");
        }
        else{
            System.out.println("동작을 멈춥니다.");
        }
    }
    
    public static void main(String[] args){
        double speed = 10;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("교통신호는 :");
            String color = scanner.nextLine();
            RobotWalk(color,speed);
        }
    }
}
