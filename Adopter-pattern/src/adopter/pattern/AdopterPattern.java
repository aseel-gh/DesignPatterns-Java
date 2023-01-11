package adopter.pattern;
/**
 *
 * @author aseel-gh
 */

// test class---------------------------------------
public class AdopterPattern {

    public static void main(String[] args) {
        IOSimagePreview ios = new IOSimagePreview();

        PNG png = new PNG();
        JPEG jpeg = new JPEG();
        ios.showimage(jpeg); 
         
        PNGtoJPEGAdopter pa = new PNGtoJPEGAdopter();
        ios.showimage(pa.convert()); 
}
    }
    
