//method that set's the dimensions of the shape depending on shape type
fun setDimensions(_type: Shape){
    if(_type is Square){
        println("Enter length and height: ")
        var dim = readLine()!!.split(" ")
        _type.length = dim.get(0).toDouble()
        _type.height = dim.get(1).toDouble()
    }
    else if(_type is Circle){
        println("Enter radius: ")
        _type.radius = readLine()!!.toDouble()
    }
    else if(_type is Triangle && _type !is EquilateralTriangle){
        println("Enter sides: ")
        var dim = readLine()!!.split(" ")
        _type.a = dim.get(0).toDouble()
        _type.b = dim.get(1).toDouble()
        _type.c = dim.get(2).toDouble()
    }
    else if(_type is EquilateralTriangle){
        println("Enter side: ")
        _type.s = readLine()!!.toDouble()
    }
    else{
        println("Shape DNE")
    }
}