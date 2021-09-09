open class Triangle(_name: String) : Shape(_name) {
    var a = 0.0
    var b = 0.0
    var c = 0.0

    fun setDimensions(_a: Double, _b: Double, _c: Double){
        a=_a
        b=_b
        c=_c
    }

    override fun printDimensions() {
        print("A: $a\t B: $b\t C: $c\n")
    }

    override fun getArea(): Double {
        val s = a+b+c
        return Math.sqrt(s*(s-a)*(s-b)*(s-c))
    }
}