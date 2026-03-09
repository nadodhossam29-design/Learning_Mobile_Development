fun main(){

    println("please enter name")
    val name=readln()
    var nickname: String?=null
    println("please enter agena")
    val age:Int=readln().toInt()
    if(nickname!=null){
        println("Nickname : $nickname")
    }
    else {
        println("No nickname available")}

    if(age>=18){
        println("$name is an adult")
    }
    else {
        println("$name is a minor")
    }
}
