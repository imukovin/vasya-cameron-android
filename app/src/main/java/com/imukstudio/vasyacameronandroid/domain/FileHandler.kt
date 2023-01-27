package com.imukstudio.vasyacameronandroid.domain

import com.imukstudio.vasyacameronandroid.App
import com.imukstudio.vasyacameronandroid.R
import java.io.InputStream

class FileHandler(
    private val fileName: String
) {

    private fun readPatternFile(): InputStream = App.getAppContext().resources.openRawResource(
            R.raw.pattern
        )

//    private fun createWordFile() {
//        val dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).path + File.separator
//
//        val ins: InputStream = resources.openRawResource(
//            R.raw.test
//        )
//
//        val xwpfDocument = XWPFDocument(ins)
//        val xwpfParagraph = xwpfDocument.createParagraph()
//        val xwpfRun = xwpfParagraph.createRun()
//
//        for (p in xwpfDocument.paragraphs) {
//            val runs = p.runs
//            if (runs != null) {
//                for (r in runs) {
//                    var text = r.getText(0)
//                    if (text != null && text.contains("Привет")) {
//                        text = text.replace("Привет", "haystack")
//                        r.setText(text, 0)
//                    }
//                }
//            }
//        }
//
//        xwpfRun.setText("Hello ")
//        xwpfRun.fontSize = 24
//
//        val fileOutputStream = FileOutputStream(dir + "TestFile.docx")
//        xwpfDocument.write(fileOutputStream)
//
//        if (fileOutputStream != null) {
//            fileOutputStream.flush()
//            fileOutputStream.close()
//        }
//        xwpfDocument.close()
//
//    }

}
