class Circle(_name: String) : Shape(_name) {
    var radius = 0.0

    fun setDimensions(_radius: Double){
        radius = _radius
    }

    override fun printDimensions() {
        var diameter = 2*radius
        var circum = 2*radius*Math.PI
        print("Radius: $radius\t Diameter: $diameter\t Circumference: $circum\n")
    }

    override fun getArea(): Double {
        return 2*Math.PI*Math.pow(radius,2.0)
    }
}