import model.Axis;
import model.Channel;
import model.Image;
import model.MyImage;
import service.ImageService;
import service.ImageServiceInterface;

/**
 * This is a "mock" ImageService class which extends the ImageService class. In this class,
 * overwriting functions to help to test the controller, to examine whether the controller component
 * correctly receives the command that user inputted or not.
 */
public class MockImageService extends ImageService {


  /**
   * Get one certain channel of the image (result in one colored image).
   *
   * @param image   the image to operate on.
   * @param channel the given channel.
   * @return the split colored image.
   */
  @Override
  public Image splitComponent(Image image, Channel channel) {
    System.out.println("Receive the image need to be split and their corresponding channels.");
    Image myImage = new MyImage("test/img/trichromatic/simple_greyScale_r.ppm");
    return myImage;
  }

  /**
   * Blur an image.
   *
   * @param image the image to operate on.
   * @return the result image.
   */
  @Override
  public Image blur(Image image) {
     System.out.println("Receive the image need to be blurred, now start to blur.");
    Image myImage = new MyImage("test/img/cupcake_blurOnce.png");
    return myImage;
  }

  /**
   * Get value of the image.
   *
   * @param image the image to operate on.
   * @return the result image.
   */
  @Override
  public Image getValue(Image image) {
    System.out.println("Receive the image need to get the value-component, now start to do that.");
    Image myImage = new MyImage("test/img/monochromatic/black_value.ppm");
    return myImage;
  }

  /**
   * Get intensity of the image.
   *
   * @param image the image to operate on.
   * @return the result image.
   */
  @Override
  public Image getIntensity(Image image) {
    System.out.println("Receive the image need to get the intensity-component, now start to do " +
          "that.");
    Image myImage = new MyImage("test/img/monochromatic/black_intensity.ppm");
    return myImage;
  }

  /**
   * Get luma of an image.
   *
   * @param image the image to operate on.
   * @return the result image.
   */
  @Override
  public Image getLuma(Image image) {
    System.out.println("Receive the image need to get the luma-component, now start to do that.");
    Image myImage = new MyImage("test/img/monochromatic/black_luma.ppm");
    return myImage;
  }

  /**
   * Flip an image.
   *
   * @param image the image to operate on.
   * @param axis  the axis to flip on.
   * @return the result image.
   */
  @Override
  public Image flip(Image image, Axis axis) {
    System.out.println("Receive the image need to be flipped, now start to flip.");
    Image myImage = new MyImage("test/img/flip/car_horizontallyFlipped.png");
    return myImage;
  }


  /**
   * Brighten an image with given delta.
   *
   * @param image the image to operate on.
   * @param delta the amount to brighten.
   * @return the result image.
   */
  @Override
  public Image brighten(Image image, float delta) {
    System.out.println("Receive the image need to be brightened, now start to brighten.");
    Image myImage = new MyImage("test/img/trichromatic/simple-4.ppm");
    return myImage;
  }

  /**
   * Result in channelCount greyscale images.
   *
   * @param image the image to operate on.
   * @return the result images.
   */
  @Override
  public Image[] splitChannel(Image image) {
    System.out.println("Receive the image need to be split, now start to split.");
    Image myImage1 = new MyImage("test/img/split/rose_onlyRed.jpg");
    Image myImage2 = new MyImage("test/img/split/rose_onlyGreen.jpg");
    Image myImage3 = new MyImage("test/img/split/rose_onlyBlue.jpg");
    Image[] result = new Image[3];
    result[0] = myImage1;
    result[1] = myImage2;
    result[2] = myImage3;
    return result;


  }

  /**
   * Combine images each representing one monochrome channel to one multicolor image.
   *
   * @param channels the channels to combine.
   * @param images   the images to combine, corresponding to channels.
   * @return the result image.
   */
  @Override
  public Image combineChannels(Channel[] channels, Image[] images) {
    System.out.println("Receive three images need to combine together, now start to combine.");

    Image myImage = new MyImage("test/img/split/rose.jpg");
    return myImage;
  }

  /**
   * Sharpen an image.
   *
   * @param image the image to operate on.
   * @return the result image.
   */
  @Override
  public Image sharpen(Image image) {
    System.out.println("Receive the image need to be sharpened, now start to sharpen.");
    Image myImage = new MyImage("test/img/cupcake_sharpenOnce.png");
    return myImage;
  }

  /**
   * Get sepia version of an image.
   *
   * @param image the image to operate on.
   * @return the result image.
   */
  @Override
  public Image getSepia(Image image) {
    System.out.println("Receive the image need to get its sepia, now start to do that.");
    Image myImage = new MyImage("test/img/city_small_sepia.png");
    return myImage;
  }
}
