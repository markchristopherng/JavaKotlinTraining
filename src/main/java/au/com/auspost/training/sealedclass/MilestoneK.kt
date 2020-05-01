package au.com.auspost.training.sealedclass

sealed class Milestone {
    class WeveGotIt : Milestone()
    class ItsOnItsWay : Milestone()
    class ItsComingToday : Milestone()
    class Delivered : Milestone()
}

enum class MilesoneEnum {
    WeveGotIt,
    ItsOnItsWay,
    ItsComingToday,
    Delivered
}

fun main(args: Array<String>) {

    val milestone: Milestone = Milestone.Delivered()

    var colour = when (milestone) {
        is Milestone.WeveGotIt -> "Red"
        is Milestone.ItsOnItsWay -> "Brown"
        is Milestone.ItsComingToday -> "Blue"
        is Milestone.Delivered -> "Green"
    }

    println("sealed class = $colour")

    val milestoneEnum: MilesoneEnum = MilesoneEnum.Delivered
    colour = when (milestoneEnum) {
        MilesoneEnum.WeveGotIt -> "Red"
        MilesoneEnum.ItsOnItsWay -> "Brown"
        MilesoneEnum.ItsComingToday -> "Blue"
        MilesoneEnum.Delivered -> "Green"
    }

    println("enum = $colour")
}
