import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class Main {

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		VideoCapture camera = new VideoCapture();
		camera.open(0);
		if (!camera.isOpened()) {
			System.out.println("Camera error");
		} else {
			System.out.println("Camera connected");
		}

		Mat frame = new Mat();
		camera.read(frame);
		Imgcodecs.imwrite("img.jpg", frame);
		System.out.println("Image saved");
	}
}
