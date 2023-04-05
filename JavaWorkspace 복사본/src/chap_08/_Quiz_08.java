package chap_08;


import chap_08.camera.SpeedCam;
import chap_08.detector.AccidentDectector;
import chap_08.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDectector());  //괄호안에 있는 것이 그냥 객체이다.
        speedCam.setReportor(new VideoReporter());
        speedCam.detect();
        speedCam.report();
        }
    }

