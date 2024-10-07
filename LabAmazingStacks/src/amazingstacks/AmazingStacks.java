//A class with a main method to launch the MazeDisplay program
//Created by James Vanderhyde, 2 November 2011
//Modified By Luis Jimenez, 7 October 2024
package amazingstacks;

/**
 *
 * @author jamesvanderhyde
 */
public class AmazingStacks
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        AnimationComponent.launchViewerWindow(640, 480, "Amazing stacks", new MazeDisplay());
    }
}
