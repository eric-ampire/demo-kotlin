import opennlp.tools.sentdetect.SentenceDetectorME
import opennlp.tools.sentdetect.SentenceModel
import java.io.File
import java.io.FileInputStream

fun main(args: Array<String>) {
    val pdfFile = File("/home/zx-connect/Projects/demo-kotlin/src/main/resources/file/en-text-demo.pdf")
    val documentReader = PDFDocumentReader(pdfFile)

    val sentenceParser = SentenceParser(documentReader.getContentText())

    sentenceParser.getSentences().forEach {
        println(it)
    }
}

