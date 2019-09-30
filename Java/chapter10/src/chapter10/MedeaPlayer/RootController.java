package chapter10.MedeaPlayer;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {
	//1. 멤버변수선언(화면에있는 객체아이디와 같게 한다. )
	@FXML private ImageView imageView;
	@FXML private MediaView mediaView; 
	@FXML private Button buttonPlay;
	@FXML private Button buttonPause;
	@FXML private Button buttonStop;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Slider slider;
	@FXML private Label labelTime;
	
	private boolean endOfMedia =false;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//1. 미디어뷰을 진행하기 위해서는 미디어객체를 가져와야된다(스트림)
		Media media=new Media(getClass().getResource("Medea/video.m4v").toString());
		//2. 미디어 플레이어를 만들고 미디어객체를 받는다.
		MediaPlayer mediaPlayer=new MediaPlayer(media);
		//3. 미디어뷰에 미디어플레이어를 삽입한다.
		mediaView.setMediaPlayer(mediaPlayer);
//		슬라이더와 미디어플레이어 볼륨을 중간정도 셋팅
		slider.setValue(50.0);
		mediaPlayer.setVolume(slider.getValue()/100.0);
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setVolume(newValue.longValue()/100.0);
			}
		});
		//4. 준비상태 알려주는상태
		
		mediaPlayer.setOnReady(()-> {
				//재생활성화, 멈춤 비활성화, 중지 비활성화
				buttonPlay.setDisable(false);
				buttonPause.setDisable(true);
				buttonStop.setDisable(true);
				
//				프로그래스바 이벤트를 설정(프로퍼티 방식으로 이벤트처리한다.)
//				미디어 플레이어가 현재 시간이 변경될때 마다 프로퍼티 방식으로 시간값을 알려준다.
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						double currentTime=mediaPlayer.getCurrentTime().toSeconds()/mediaPlayer.getTotalDuration().toSeconds();
						double totalTime=mediaPlayer.getCurrentTime().toSeconds()/mediaPlayer.getTotalDuration().toSeconds();
						progressBar.setProgress(currentTime/totalTime);
						progressIndicator.setProgress(currentTime/totalTime);
						labelTime.setText((int)currentTime+"/"+(int)totalTime);
					}
				});
				
				//준비상태에서 자동으로 진행된다면 지금은 미디어뷰를 보이지말라
//				if(mediaPlayer.isAutoPlay()) {
//					mediaView.setVisible(false);
//				}
		});
		
		//5. 진행사항이 되었을때
		mediaPlayer.setOnPlaying(()-> {
				//재생비활성화, 멈춤 활성화, 중지 활성화
				buttonPlay.setDisable(true);
				buttonPause.setDisable(false);
				buttonStop.setDisable(false);
		});
		//6. 멈춤사항이 진행되었을때
		mediaPlayer.setOnPaused(()-> {
				//재생활성화, 멈춤 비활성화, 중지 활성화
				buttonPlay.setDisable(false);
				buttonPause.setDisable(true);
				buttonStop.setDisable(false);
		});
		//7. 정지사항이 발생되었을때
		mediaPlayer.setOnStopped(()-> {
				//미디어플레이어가 정지사항이 발생이되면 
				//동영상을 원위치로 돌려놓음
				mediaPlayer.seek(mediaPlayer.getStartTime());
				//재생활성화, 멈춤 비활성화, 중지 비활성화
				buttonPlay.setDisable(false);
				buttonPause.setDisable(true);
				buttonStop.setDisable(true);
		});
		
		//8. 동영상이 끝났을때
		mediaPlayer.setOnEndOfMedia(()-> {
				//재생활성화, 멈춤 비활성화, 중지 비활성화
				buttonPlay.setDisable(false);
				buttonPause.setDisable(true);
				buttonStop.setDisable(true);
				//동영상이 실제로 끝났을때 프로그램상으로 플래그 정보를 알려준다.
				endOfMedia= true;
//				동영상이 끝나면 프로그래스바와 인디게이터를 1로 설정해야한다.
				progressBar.setProgress(1.0);
				progressIndicator.setProgress(1.0);
				labelTime.setText("완료");
				
		});
		
		//플레이 버튼을 눌렀을때
		buttonPlay.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(endOfMedia) {
					mediaPlayer.stop();
					mediaPlayer.seek(mediaPlayer.getStartTime());
				}
				mediaPlayer.play();
				endOfMedia= false;
			}
		});
//		람다식을 표현 가능
		buttonPause.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				mediaPlayer.pause();
			}
		});
		buttonStop.setOnAction(e->{mediaPlayer.stop();});
		
		
	}//end of initialize

}
