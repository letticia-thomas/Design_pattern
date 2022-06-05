package Adapter_pattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer Obj = new AudioPlayer();
		String type = new String();
		
		// for mp3
		type = "mp3";
		Obj.play(type);
		
		// for mp4
		type = "mp4";
		Obj.play(type);
		
		// for mp4
		type = "vlc";
		Obj.play(type);

	}

}
