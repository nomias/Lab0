class EquilateralTriangle(_name: String): Triangle(_name) {
    var s = 0.0

    fun setDimensions(_s: Double){
        s = _s
    }

    override fun printDimensions() {
        print("Dimensions: $s by $s by $s\n")
    }

    override fun getArea(): Double {
        return (Math.sqrt(3.0)/4.0)*Math.pow(s,2.0)
    }
}