package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable,Reportable{
    private Detectable detector;
    private Reportable reportor;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReportor(Reportable reportor) {
        this.reportor = reportor;
    }

    @Override
    public void showMainFeature() {

    }
    @Override
    public void detect() {
        detector.detect();
}

    @Override
    public void report() {
        reportor.report();
    }
//    public void detect(){
//        System.out.println("사고를 감지합니다.");
//    }
//
//    public void report(){
//        System.out.println("사고 신고합나다.");
//    }


}
