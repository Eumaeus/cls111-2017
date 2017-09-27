import java.io.File
import java.io.PrintWriter

import scala.io.Source

object Write {
  def main(args: Array[String]) {

	val urnbase:String = "urn:cts:greekLit:tlg0007.tlg012.fuDryden:"

	for (i <- 1 to 39){

		val fileNum:String = i.formatted("%02d")
		val fileName:String = s"${fileNum}_Pericles_Dryden.txt"
		println(fileName)

		val urn:String = s"${urnbase}${i}"
		println(urn)

		val writer = new PrintWriter(new File(fileName))
		writer.write(s"${urn}#")
		writer.close()
		Source.fromFile(fileName).foreach { x => print(x) }
	}

  }

}
