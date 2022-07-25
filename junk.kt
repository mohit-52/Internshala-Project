import java.util.concurrent.TimeUnit

fun main(){
    print("/")
    print(" /")
    print(" /")
//  . . .

    print("     /")
    print(" /")
    println(" /")
// . . .     . . .
    TimeUnit.MILLISECONDS.sleep(700)

    print("  /")
    print(" /")
    print("  |")
    print("  /")
    println("/")
    TimeUnit.MILLISECONDS.sleep(500)
//    . . .     . . .
//     . .  .  . .

    print("   /")
    print("/")
    print("  |")
    print(" /")
    println("/")
    TimeUnit.MILLISECONDS.sleep(250)
//    . . .     . . .
//     . .  .  . .
//       ..  . . .

    print("    /")
    print("/")
    print(" |")
    print("/")
    println("/")
//    . . .     . . .
//     . .  .  . .
//      ..  . . .
//       .. . ..



}