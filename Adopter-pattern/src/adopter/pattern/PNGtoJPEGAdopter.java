package adopter.pattern;
/**
 *
 * @author aseel-gh
 */

interface JPEGimageConvert {
     public JPEG convert();
}

public class PNGtoJPEGAdopter implements JPEGimageConvert{

    PNG png;
    PNGtoJPEGAdopter() {
         this.png = png;
    }
    
    @Override
    public JPEG convert(){
        return new JPEG();
    } 
}

class JPEG{}
class PNG{}