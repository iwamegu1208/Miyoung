import java.util.Scanner;
/**
 * 교통신호에 따라 RobotWalk 속도가 변경되는 프로그램입니다.
 * 
 * @author (2018315030 이가영,2018315059 이와사키 메구미) 
 * @version (2020.04.10)
 */
public class RobotTest
{
    public static void main(String[] args){
        double speed = 5.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("교통신호는 :");
        String color = scanner.nextLine();
    
        Robot robot = new Robot();
        System.out.println(robot.RobotWalk(color,speed) + "km/h");
    }
}
