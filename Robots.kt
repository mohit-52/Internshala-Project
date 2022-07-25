
import java.util.Calendar
import java.util.concurrent.TimeUnit

class Robot(val name: String) {

    fun ringAlarm(time: String){
        println("Good Morning!, This is $name")
        print(".")
        print(" .")
        print(" .")
//  . . .

        print("     .")
        print(" .")
        println(" .")
// . . .     . . .
        TimeUnit.MILLISECONDS.sleep(700)

        print("  .")
        print(" .")
        print("  .")
        print("  .")
        println(".")
        TimeUnit.MILLISECONDS.sleep(500)
//    . . .     . . .
//     . .  .  . .

        print("   .")
        print(".")
        print("  .")
        print(" .")
        println(".")
        TimeUnit.MILLISECONDS.sleep(250)
//    . . .     . . .
//     . .  .  . .
//       ..  . . .

        print("    .")
        print(".")
        print(" .")
        print(".")
        println(".")
//    . . .     . . .
//     . .  .  . .
//      ..  . . .
//       .. . ..
        println()
        println("It's already $time ! Wake up Sleepy Head!")
    }

    fun makeCoffee(coffee: Coffee){
        if(coffee.blackCoffee){
            println("Your Black Coffee with ${coffee.sugarSpoon} spoon of sugar is ready :)")
        }else{
            println("Your Milk Coffee with ${coffee.sugarSpoon} spoon sugar is ready :)")
        }
    }

    fun heatWater(temperature : String){
        println("Your hot Water ($temperature) is ready. You are ready to take bath now :)")
    }

    fun packBag(day : Int){
        val defaultMessage = "Books kept for today are: "
        val subjects = arrayOf("Learning C", "DSA", "AI & ML", "OS", "Python", "Android App Development")

        when(day){

            Calendar.MONDAY -> println("$defaultMessage [${subjects[0]}], [${subjects[1]}] and [${subjects[2]}]")

            Calendar.TUESDAY -> println("$defaultMessage [${subjects[1]}], [${subjects[2]}] and [${subjects[3]}]")

            Calendar.WEDNESDAY -> println("$defaultMessage [${subjects[2]}], [${subjects[3]}] and [${subjects[4]}]")

            Calendar.THURSDAY-> println("$defaultMessage [${subjects[3]}], [${subjects[4]}] and [${subjects[5]}]")

            Calendar.FRIDAY -> println("$defaultMessage [${subjects[4]}], [${subjects[5]}] and [${subjects[6]}]")

            Calendar.SATURDAY -> println("Take a chill pill, It's Weekend")

            Calendar.SUNDAY -> println("Take a chill pill, It's Weekend")

            else -> println("Invalid Selection")
        }
    }

    fun cookBreakfast(){
        val breakFast = mutableListOf("Cereals", "Banana Shake", "Oats", "Muesli", "Sprouts", "Bread & Butter")
        val lunch = mutableListOf("Dal Rice", "Chole Rice", "Kadhai Paneer + Rumali Roti", "Biryani", "Chole Bhature", "Malai Kofte + Rumali Roti")

        println("Today's breakfast is ${breakFast.random()} and lunch is ${lunch.random()}")
    }

    fun ironClothes(shirtColor: String, trouserColor: String){
        val shirtsColor = mutableListOf("Blue and Orange", "Pink and Purple", "Blue", "Black", "White", "White and Black", "Black and Gray.")
        val trousersColor = mutableListOf("Black chinos", "White pants", "Green pants", "Khaki chinos", "Blue Jeans")

        if(shirtsColor.contains(shirtColor)){
            if(trousersColor.contains(trouserColor)){
                println("You are ready to rock!!")
            }else{
                println("You don't have any $trouserColor color trouser.")
            }
        }else{
            println("You don't have any $shirtColor color shirt.")
        }
    }


    }