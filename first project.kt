fun main(){
    val score =readln().toInt()
    when(score){
        in 90..100->println("A , Excellent")
        in 80..89->println("B , Good")
        in 70..79->println("C , Average")
        in 0..69->println("F , Needs Work")

    }

}