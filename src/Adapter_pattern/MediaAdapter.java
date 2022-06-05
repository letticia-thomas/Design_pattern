package Adapter_pattern;

public class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer adv;
	public MediaAdapter(String type) 
	{
		if(type=="mp4")
		{
			adv = new Mp4MediaPlayer();
		}
		if(type=="vlc")
		{
			adv = new VlcMediaPlayer();
		}
		
	}
	public void play(String type)
	{
		adv.play();
	}
}
