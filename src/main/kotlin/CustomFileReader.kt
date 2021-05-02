import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import java.io.File

interface DocumentReader {
    fun getContentText(): String
}

class PDFDocumentReader(
    private val file: File
) : DocumentReader {
    override fun getContentText(): String {
        val document = PDDocument.load(file)
        val stripper = PDFTextStripper()
        return stripper.getText(document)
    }
}

class DocXDocumentReader(
    private val file: File
) : DocumentReader {
    override fun getContentText(): String {
        TODO("Not yet implemented")
    }
}
