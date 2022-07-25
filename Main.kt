import java.util.Calendar
import java.util.concurrent.TimeUnit

fun main() {
    val victi = Robot(name = "VICTI")

    victi.ringAlarm(("9 Am"))


    TimeUnit.MILLISECONDS.sleep(1000)
    println()

    victi.makeCoffee(Coffee(true,1) )
    TimeUnit.MILLISECONDS.sleep(1000)
    println()

    victi.heatWater("40 degree")
    TimeUnit.MILLISECONDS.sleep(1000)
    println()

    victi.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    TimeUnit.MILLISECONDS.sleep(1000)
    println()

    victi.cookBreakfast()
    TimeUnit.MILLISECONDS.sleep(1000)
    println()

    victi.ironClothes("black","white")
    TimeUnit.MILLISECONDS.sleep(1000)
    println()

}

