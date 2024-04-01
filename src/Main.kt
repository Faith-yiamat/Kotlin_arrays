//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    takeStrings("Yiamat","Oloserian","Faith","Hope")
    arrayNum( numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    println(containArr("Agnes","Ajema","Shiko").contentToString())

}
fun takeStrings(str1:String,str2: String,str3: String,str4: String){
    println(arrayOf(str1,str2,str3,str4).contentToString())
}

fun arrayNum(numbers:Array<Int>){
    println(numbers[1]+ numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun containArr(name1:String,name2:String,name3: String):Array<String>{
  return arrayOf(name1,name2,name3)

}