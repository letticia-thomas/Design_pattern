package Adapter_pattern;

public class AudioPlayer implements MediaPlayer{
	public void play(String type)
	{
		if(type=="mp3")
		{
			System.out.println("Playing MP3 music");
		}
		else if(type=="mp4"||type=="vlc")
		{
			MediaAdapter adapter = new MediaAdapter(type);
			adapter.play(type);
		}
	}
}
