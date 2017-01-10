val input = "long time ago in a galaxy far far away"

input.split(" ").map(word => (word, 1))

val string: String = "I love scala i hate java i love coffee"
println(string.split(" ").map(_.toLowerCase).groupBy(w => w))
