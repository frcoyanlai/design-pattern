package structural.proxy;

import java.net.URL;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:26
 **/
public class ImageViewer {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
