package com.qa.JavaInterviewPrograms;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Convert the image file format from .jpg to .png/.gif/.bmp etc.
 */

public class ImageFormatConversion {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ImageFormatConversion.class);

	public static void test() {

        String jpgFileName = "test_image.jpg";
        String pngFileName = "test_image.png";
        String gifFileName = "test_image.gif";
        String bmpFileName = "test_image.bmp";
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\";
        String urlPath = "https://m.media-amazon.com/images/I/61DjwgS4cbL._AC_SY200_.jpg";

        try {
            URL url = new URL(urlPath);

            BufferedImage image = ImageIO.read(url); // ImageIO.read(new File(path)) : to change format of image file avalable on system locally.

            ImageIO.write(image, "jpg", new File(path + jpgFileName));
            ImageIO.write(image, "png", new File(path + pngFileName));
            ImageIO.write(image, "gif", new File(path + gifFileName));
            ImageIO.write(image, "bmp", new File(path + bmpFileName));

            System.out.println("All images converted successfully.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}