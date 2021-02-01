import java.util.Scanner;

public class Adventure1
{
	public static void main( String[] args )
	{
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "WELCOME TO A TINY TEXT ADVENTURE!");
        System.out.println( "Please make your selections by typing in the indicated \"quoted\" word for each choice.");
        System.out.println();

        System.out.println( "You are in an apartment building. Would you like to take the \"first\" or \"second\" elevator?" );
        System.out.print( "> ");
        String answer = keyboard.next();
        System.out.println();

        if (answer.equals("first")) {

            System.out.println( "You take the first elevator downstairs. You find yourself in the lobby, where there are \"mailboxes\", and the door \"outside\". Should you go outside or open your mailbox?" );

            System.out.print( "> " );
            answer = keyboard.next();
            System.out.println();

            if (answer.equals("mailboxes")) {

                System.out.println( "You open your mailbox. Inside are two envelopes: one is red, while the other is blue. They are unlabeled, and there is no way of knowing what is inside without opening them. So, \"red\" or \"blue\"?");
    
                System.out.print( "> ");
                answer = keyboard.next();
                System.out.println();

                if (answer.equals("red")) {

                    System.out.println( "You take the red envelope and open it carefully. As soon as you open the flap, hundred dollar bills start flying out at a high velocity. You close the flap quickly and look around to see if you are being watched, while quickly shoving the bills into your pocket. You hurry back upstairs to your apartment to revel in your discovery." );
                    System.out.println();
                    System.out.println( "~Congratulations! You've been gifted a magic money envelope - use it wisely!~" );
        
                }
                if (answer.equals("blue")) {
        
                    System.out.println( "You take the blue envelope and rip it open. Junk mail. Wow, that was anticlimatic..." );
                    System.out.println();
                    System.out.println( "~You decided to go check your mail in a text adventure? You could have done that without opening this file!~" );
        
                }
            }

            if (answer.equals("outside")) {

                System.out.println( "You open the door to the outside world. You now find yourself standing on a sidewalk that runs parallel to your building. You have two choices: walk to the \"left\", or walk to  the \"right\"." );
    
                System.out.print( "> " );
                answer = keyboard.next();
                System.out.println();

                if (answer.equals("left")) {

                    System.out.println( "You decide to walk to the left, going south down the street. You reach the corner, and notice the convenience store is having a sale: everything is free today - yay!" );
                    System.out.println();
                    System.out.println( "~Nice, you got free snacks today! Pace yourself, you don't want to eat too much!~" );
        
                }
                
                if (answer.equals("right")) {
        
                    System.out.println( "You decide to walk to the right, going north up the street. After walking about five minutes, you feel raindrops, which very suddenly and violently becomes a torrential downpour. You become drenched within seconds." );
                    System.out.println();
                    System.out.println( "~I guess today wasn't a good day to take a walk. Should've brought an umbrella!~" );

                }
            }
        }
        
        if (answer.equals("second")) {

            System.out.println( "You take the second elevator downstairs. You find yourself facing two doors, one to the \"laundry\" room, and the other goes to the parking \"lot\". Which way should you go?" );

            System.out.print( "> " );
            answer = keyboard.next();
            System.out.println();

            if (answer.equals("laundry")) {

                System.out.println( "You enter the laundry room. Inside are one \"washer\" and one \"dryer\", both running. You don't remember which one is yours; which one do you check?" );
    
                System.out.print( "> " );
                answer = keyboard.next();
                System.out.println();

                if (answer.equals("washer")) {

                    System.out.println( "You decide to check the washer. Upon opening it, a vortex of icy water rushes out of it, instantly filling the room with water. Everything fades to darkness as you feel yourself succumb to the water." );
                    System.out.println();
                    System.out.println( "~Huh, that's odd. Maybe it's broken. Oh well, should have learned how to swim!~" );
        
                }
                if (answer.equals("dryer")) {
        
                    System.out.println( "You decide to check the dryer. You open it to reveal a single sock in it. Yay, your laundry is done!" );
                    System.out.println();
                    System.out.println( "~Who washes a single sock?!~");
        
                }

            }
            if (answer.equals("lot")) {
    
                System.out.println( "You choose the door to the parking lot. Oddly enough, there seems to be a lone car and garbage dumpster sitting in the middle of the lot, both glowing. Which one do you want to investigate - the \"car\", or the \"dumpster\"?" );
    
                System.out.print( "> " );
                answer = keyboard.next();
                System.out.println();

                if (answer.equals("car")) {

                    System.out.println( "You walk up to the car, fascinated by the glow within. You are so fascinated by it that you suddenly feel compelled to smash one of the windows with your bare hand, in an attempt to learn the origins of the mysterious glow. The light immediately fades once the glass is broken, and nothing of interest appears to be in the car. You run, because the car alarm is now blaring, and your hand is covered in blood." );
                    System.out.println();
                    System.out.println( "~I'm not sure quite why you did that, but I hope no one finds out what you did. You might need to cut back on the hard drugs. Get some help.~" );
        
                }
                if (answer.equals("dumpster")) {
        
                    System.out.println( "You decide to investigate the dumpster. It is already open - you peer into it, and appears to be a portal. You're not quite sure what an interdimensional portal is doing in a garbage dumpster, but the absurdity of the situation does not stop you from jumping into it without hesitation. You vanish as the glow fades, and the original contents of the dumpster returm. You were never found again." );
                    System.out.println();
                    System.out.println( "~Wow, where did you go?! I hope you turn up soon - we'll miss you. Have a safe trip!" );
        
                }
            }
        }

        System.out.println();
        System.out.println( "ADVENTURE END" );

    }
}
        