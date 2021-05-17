fun main() {
    println(evenStrings(listOf("mzeee","mambo","kiranja","sandra","lovee","yello","nyambura","diamond","zuchu","kalenjin")))
    println(meters(listOf(3.40,5.70,)))
    var personList= mutableListOf<person>(
        person("mamaa",20,34.00,60.00),
        person("daddy",18,40.90,40.50),
        person("jane",16,20.90,43.50),
        person("mkamba",19,490.90,60.50),
        person("harushin",27,34.90,48.50)
    )
    var sortedPerson=personList.sortedByDescending { human -> human.age }
    println(sortedPerson)
    addPeople(mutableListOf<person>(
        person("mamaa",20,34.00,60.00),
        person("daddy",6,40.90,40.50),
        person("jane",26,20.90,43.50),
        person("mkamba" ,46,490.90,60.50),
        person("harushin",36,34.90,48.50)
    ))

    println( avarageMile(listOf(
        Gari(" toyota",100),
        Gari("macdece",20),
        Gari("benz",90),
        Gari("prado",70)



    )))

}


fun evenStrings(names:List<String>):List<String> {
    return names.filterIndexed { index, name -> index%2==0 }

}
fun meters(meters:List<Double>):Pair<Double,Int> {
    var sum = meters.sum()
    var average = meters.average()
    return Pair(average,sum.toInt())
}



data class person(var name:String,var age:Int,var height:Double,var weight:Double)

fun addPeople(peopleList:MutableList<person>){

    peopleList.addAll(
        listOf(person("sharon",60,6.5,90.0),
            person("shilla",40,7.1,100.1))
    )
    println(peopleList)
    }


data class Gari(var registration:String,var mileage:Int)
fun avarageMile(car:List<Gari>):Double{
    var total=0.0000
    car.forEach { gari->gari.mileage
        total+=gari.mileage
    }
    return total/car.count()
}
