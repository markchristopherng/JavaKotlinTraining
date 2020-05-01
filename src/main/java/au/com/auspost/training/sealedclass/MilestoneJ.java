package au.com.auspost.training.sealedclass;

public enum MilestoneJ {
    WeveGotIt,
    ItsOnItsWay,
    ItsComingToday,
    Delivered;

    public static void main(String args[]) {

        MilestoneJ milestone = MilestoneJ.Delivered;

        String colour = null;
        switch (milestone) {
            case WeveGotIt:
                colour = "Red";
                break;
            case ItsOnItsWay:
                colour = "Brown";
                break;
            case ItsComingToday:
                colour = "Blue";
                break;
            case Delivered:
                colour = "Green";
                break;
        }

        System.out.println("enum = " + colour);
    }

}