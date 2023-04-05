package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Inerface {
    public static void main(String[] args) {
        //인터페이스 (뼈대만 제공하는 구조)
        //단일 상속 (extends)
        //NormalReporter normalReporter = new NormalReporter();
        Reportable normalReporter =new NormalReporter();
        normalReporter.report();

        //Reportable videoReporter = new VideoReporter();
        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("----------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("----------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReportor(videoReporter);
        factoryCam.detect();
        factoryCam.report();
    }
}
