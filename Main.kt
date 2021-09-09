fun main(args: Array<String>) {

    //initialize and declare shapes
    val sqr: Shape = Square(_name = "Square")
    val cir: Shape = Circle(_name = "Circle")
    val tri: Shape = Triangle(_name = "Triangle")
    val eqT: Shape = EquilateralTriangle(_name = "Equilateral Triangle")

    //set dimensions by Shape type
    setDimensions(sqr)
    setDimensions(cir)
    setDimensions(tri)
    setDimensions(eqT)

   //print shape name, dimensions, and area
    println("Square Name: ${sqr.name}")
    sqr.printDimensions()
    println("Square Area: ${sqr.getArea()}")
    println("\n")
    println("Circle Name: ${cir.name}")
    cir.printDimensions()
    println("Circle Area: ${cir.getArea()}")
    println("\n")
    println("Triangle Name: ${tri.name}")
    tri.printDimensions()
    println("Triangle Area: ${tri.getArea()}")
    println("\n")
    println("Equilateral Triangle Name: ${eqT.name}")
    eqT.printDimensions()
    println("Equilateral Triangle Area: ${eqT.getArea()}")
}