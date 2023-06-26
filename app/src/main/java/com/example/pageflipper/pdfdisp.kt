package com.example.pageflipper

import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.res.AssetManager
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.FileProvider
import java.io.File
import java.io.IOException

class pdfdisp : AppCompatActivity() {
    private lateinit var mImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfdisp)
//
//        mImageView = findViewById(R.id.pdf_image_view)
//
//        // Load the PDF file from the assets folder
//        val assetManager: AssetManager = assets
//        try {
//            val inputStream = assetManager.open("NCERT Class 11 Accountancy Book (Part I).pdf")
//
//            // Load the PDF document
//            val pdfDocument = Document(inputStream)
//
//            // Set up a PDF document renderer
//            val muPDFCore = MuPDFCore(this)
//            muPDFCore.open(pdfDocument)
//
//            // Render the first page of the PDF document
//            val bitmap: Bitmap = muPDFCore.drawPage(0)
//
//            // Display the rendered page in the ImageView
//            mImageView.setImageBitmap(bitmap)
//
//            // Clean up resources
//            muPDFCore.onDestroy()
//            pdfDocument.close()
//
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//    }
//        val file = File("NCERT Class 11 Accountancy Book (Part I).pdf")
//        val intent = Intent(Intent.ACTION_VIEW)
//        intent.setDataAndType(Uri.fromFile(file), "application/pdf")
//        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
//
//        try {
//            startActivity(Intent.createChooser(intent, "Open File"))
//        } catch (e: ActivityNotFoundException) {
//            Toast.makeText(applicationContext, "No PDF Viewer Installed", Toast.LENGTH_LONG).show()
//        }

//        val file = File("G://ANDROID STUDIO//PAGEFLIPPER//app//src//main//assets")
//        val uri = FileProvider.getUriForFile(
//            this,
//            applicationContext.packageName + ".provider",
//            file
//        )
//
//        val intent = Intent(Intent.ACTION_VIEW)
//        intent.setDataAndType(uri, "application/pdf")
//        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
//        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
//
//        val chooser = Intent.createChooser(intent, "Open with")
//
//        if (intent.resolveActivity(packageManager) != null) {
//            startActivity(chooser)
//        }
    }
}