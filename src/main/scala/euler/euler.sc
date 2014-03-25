import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

object euler {
	val rs = for{
		c <- 3 until 1000
		b <- 2 until c
		a <- 1 until b
		if c > b
		if b > a
		if a + b + c == 1000
		if a * a + b * b == c *c
	} yield (a,b,c)                           //> rs  : scala.collection.immutable.IndexedSeq[(Int, Int, Int)] = Vector((200,3
                                                  //| 75,425))
	rs(0)                                     //> res0: (Int, Int, Int) = (200,375,425)
	
	val limit = (1 to 1000).find(n => n + math.sqrt(n) >= 1000).get
                                                  //> limit  : Int = 969
 }
 
 