import opennlp.tools.sentdetect.SentenceDetectorME
import opennlp.tools.sentdetect.SentenceModel
import java.io.File
import java.io.FileInputStream

class SentenceParser(private val text: String) {

    fun getSentences(): List<String> {
        // Todo: Detect text language
        val stream = FileInputStream(File("/home/zx-connect/Projects/demo-kotlin/src/main/resources/nlp-model/en-sent.bin"))
        val model = SentenceModel(stream)
        val sentenceDetector = SentenceDetectorME(model)
        return sentenceDetector.sentDetect(text).toList()
    }
}